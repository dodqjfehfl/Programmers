package lv_2;

import java.util.*;

public class 주식가격 {
    public static void main(String[] args) {
        int[] price = { 1, 2, 3, 2, 3 };
        System.out.println(Arrays.toString(solution(price)));
        // [4, 3, 1, 1, 0]
    }

    public static int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                if (prices[j] < prices[i]) {
                    answer[i] = j - i;
                    break;
                }

                if (j == len - 1) {
                    answer[i] = j - i;
                    break;
                }
            }
        }

        return answer;
    }
}
