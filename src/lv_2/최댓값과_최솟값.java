package lv_2;

import java.util.*;

public class 최댓값과_최솟값 {
    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));
        // "1 4"
        System.out.println(solution("-1 -2 -3 -4"));
        // "-4 -1"
        System.out.println(solution("-1 -1"));
        // "-1 -1"
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        StringTokenizer token = new StringTokenizer(s);
        int[] temp = new int[2];
        temp[0] = temp[1] = Integer.parseInt(token.nextToken());
        while (token.hasMoreTokens()) {
            int num = Integer.parseInt(token.nextToken());
            temp[0] = Integer.min(temp[0], num);
            temp[1] = Integer.max(temp[1], num);
        }

        answer.append(temp[0]).append(" ").append(temp[1]);

        return answer.toString();
    }
}
