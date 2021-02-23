package lv_1;

public class 이상한_문자_만들기 {
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
        // TrY HeLlO WoRlD
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                index = 0;
                answer.append(" ");
                continue;
            }

            if (index % 2 == 0) {
                answer.append(Character.toUpperCase(s.charAt(i)));
            } else {
                answer.append(Character.toLowerCase(s.charAt(i)));
            }
            index++;
        }

        return answer.toString();
    }
}
