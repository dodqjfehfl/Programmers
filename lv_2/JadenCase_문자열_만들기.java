package lv_2;

public class JadenCase_문자열_만들기 {
    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
        // "3people Unfollowed Me"
        System.out.println(solution("for the last week"));
        // "For The Last Week"
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        answer.append(Character.toUpperCase(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == ' ') {
                answer.append(Character.toUpperCase(s.charAt(i)));
            } else {
                answer.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        return answer.toString();
    }
}
