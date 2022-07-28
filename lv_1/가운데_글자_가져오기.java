package lv_1;

public class 가운데_글자_가져오기 {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        // c
        System.out.println(solution("qwer"));
        // we
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        if (s.length() % 2 == 1) {
            answer.append(s.charAt(s.length() / 2));
        } else {
            answer.append(s.charAt(s.length() / 2 - 1));
            answer.append(s.charAt(s.length() / 2));
        }
        return answer.toString();
    }
}
