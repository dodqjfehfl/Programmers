package lv_1;

public class _3진법_뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution(45));
//        7
        System.out.println(solution(125));
//        229
    }

    public static int solution(int n) {
        int answer = 0;

        StringBuilder sb=new StringBuilder();

        //3진법 변환
        while(n>0){
            sb.append(n%3);
            //알아서 뒤로 들어감
            n=n/3;
        }

        //10진법으로 변환
        int d=1;
        int len=sb.length();
        for(int i=0;i<len;i++){
            answer+=(sb.charAt(len-i-1)-'0')*(d);
            d*=3;
        }

        return answer;
    }
}
