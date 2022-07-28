package lv_1;

import java.util.*;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        System.out.println(solution(118372));
        // 873211
    }

    public static long solution(long n) {
        int[] numbers = new int[10];
        while (n > 0) {
            numbers[(int) (n % 10)]++;
            n /= 10;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < numbers[i]; j++) {
                sb.append(i);
            }
        }

        return Long.parseLong(sb.toString());
    }
}