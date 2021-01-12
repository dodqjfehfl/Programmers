package lv_2;

import java.util.Arrays;

public class 짝지어_제거하기 {
    public static void main(String[] args) {
        String s = "baabaa";
        System.out.println(solution(s));
        // 1
        String s2 = "cdcd";
        System.out.println(solution(s2));
        // 0
    }

    public static int solution(String s) {
        int answer = 1;

        boolean[] check = new boolean[s.length()];

        for (int i = 1; i < check.length; i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                check[i] = true;
                check[i - 1] = true;
                continue;
            }
        }

        System.out.println(Arrays.toString(check));

        for (int i = 0; i < check.length; i++) {
            if (!check[i]) {
                answer = 0;
            }
        }

        return answer;
    }
}

// queue에 넣고 뺴기 런타임, 시간 초과 발생 -> boolean 배열을 생성해서 체크?