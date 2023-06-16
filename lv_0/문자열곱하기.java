package lv_0;

public class 문자열곱하기 {
    public static void main(String[] args) {
        System.out.println(solution("string", 3));
        System.out.println(solution("love", 10));
//        "string"	3	"stringstringstring"
//        "love"	10	"lovelovelovelovelovelovelovelovelovelove"
    }

    public static String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(my_string);
        }

        return sb.toString();
    }
}
