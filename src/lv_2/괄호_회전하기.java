package lv_2;

import java.util.Stack;

public class 괄호_회전하기 {
    public static void main(String[] args) {
        // System.out.println(solution("[](){}"));
        // // 3
        // System.out.println(solution("}]()[{"));
        // // 2
        // System.out.println(solution("[)(]"));
        // // 0
        // System.out.println(solution("}}}"));
        // 0
        System.out.println(solution("([{}]){"));
    }

    public static int solution(String s) {
        int answer = 0;

        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb = new StringBuilder();
            sb.append(s.substring(i, len)).append(s.substring(0, i));
            // check
            if (check(sb.toString(), len))
                answer++;
        }

        return answer;
    }

    static boolean check(String s, int len) {
        int bracket1 = 0; // ()
        int bracket2 = 0; // []
        int bracket3 = 0; // {}
        Stack<Character> stack = new Stack<>();
        char recent = ' ';

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);

            if (c == '(') {
                bracket1++;
                stack.push(c);
            }
            if (c == '[') {
                bracket2++;
                stack.push(c);
            }
            if (c == '{') {
                bracket3++;
                stack.push(c);
            }
            if (c == ')') {
                bracket1--;
                if (bracket1 < 0)
                    return false;
                if (stack.pop() != '(')
                    return false;
            }
            if (c == ']') {
                bracket2--;
                if (bracket2 < 0)
                    return false;
                if (stack.pop() != '[')
                    return false;
            }
            if (c == '}') {
                bracket3--;
                if (bracket3 < 0)
                    return false;
                if (stack.pop() != '{')
                    return false;
            }
        }

        if (bracket1 != 0 || bracket2 != 0 || bracket3 != 0)
            return false;

        return true;
    }
}
