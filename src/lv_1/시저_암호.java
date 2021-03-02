package lv_1;

public class 시저_암호 {
    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        // "BC"
        System.out.println(solution("z", 1));
        // "a"
        System.out.println(solution("a B z", 4));
        // "e F d"
    }

    public static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer.append(' ');
            } else if (Character.isUpperCase(s.charAt(i))) {
                int temp = s.charAt(i) - 'A';
                answer.append((char) ('A' + (temp + n) % 26));
            } else {
                int temp = s.charAt(i) - 'a';
                answer.append((char) ('a' + (temp + n) % 26));
            }
        }

        return answer.toString();
    }
}
