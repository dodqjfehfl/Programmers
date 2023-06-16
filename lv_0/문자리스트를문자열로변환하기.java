package lv_0;

public class 문자리스트를문자열로변환하기 {
    public static void main(String[] args) {
        String[] temp= {"a","b","c"};
        System.out.println(solution(temp));
//        ["a","b","c"]	"abc"
    }

    public static String solution(String[] arr) {
        StringBuilder sb =new StringBuilder();

        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
