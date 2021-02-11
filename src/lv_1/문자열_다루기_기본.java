package lv_1;

public class 문자열_다루기_기본 {
    public static void main(String[] args) {
        System.out.println(solution("a234"));
        // false
        System.out.println(solution("1234"));
        // true
    }

    public static boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isLetter(s.charAt(i)))
                    return false;
            }

            return true;
        } else {
            return false;
        }
    }
}
