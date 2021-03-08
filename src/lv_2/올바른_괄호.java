package lv_2;

public class 올바른_괄호 {
    public static void main(String[] args) {
        System.out.println(solution("()()"));
        // true
        System.out.println(solution("(())()"));
        // true
        System.out.println(solution(")()("));
        // false
        System.out.println(solution("(()("));
        // false
    }

    static boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') { // 열고
                cnt++;
            } else { // 닫고
                if (cnt != 0) {
                    cnt--;
                } else {
                    answer = false;
                    break;
                }
            }
        }

        if (cnt != 0) {
            answer = false;
        }

        return answer;
    }
}
