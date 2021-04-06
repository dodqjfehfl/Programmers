import java.util.*;
public class 불량_사용자 {
    public static void main(String[] args) {
String[] user_id1={"frodo", "fradi", "crodo", "abc123", "frodoc"};
String[] banned_id1=	{"fr*d*", "abc1**"};	
System.out.println(solution(user_id1, banned_id1));
//2
String[] user_id2={"frodo", "fradi", "crodo", "abc123", "frodoc"};
String[] banned_id2=	{"*rodo", "*rodo", "******"};	
System.out.println(solution(user_id2, banned_id2));
//2
String[] user_id3={"frodo", "fradi", "crodo", "abc123", "frodoc"};
String[] banned_id3=	{"fr*d*", "*rodo", "******", "******"};	
System.out.println(solution(user_id3, banned_id3));
//3
    }

    public static int solution(String[] user_id, String[] banned_id) {
        int answer = 0;

        int[] possible=new int[banned_id.length];

        for(int i=0;i<banned_id.length;i++){
            for(String user:user_id){
                if(banned_id[i].length()!=user.length()) continue;
                else{
                    if(check(banned_id[i], user, banned_id[i].length()))
                        possible[i]++;
                }
            }
        }

        System.out.println(Arrays.toString(possible));

        return answer;
    }

    static boolean check(String ban, String user, int len){
        for(int i=0;i<len;i++){
            if(ban.charAt(i)=='*')
                continue;
            else{
                if(ban.charAt(i)!=user.charAt(i))
                    return false;
            }
        }
        return true;
    }
}
