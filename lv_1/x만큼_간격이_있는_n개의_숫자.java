package lv_1;

import java.util.Arrays;

public class x만큼_간격이_있는_n개의_숫자 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
        // [2,4,6,8,10]
        System.out.println(Arrays.toString(solution(4, 3)));
        // [4,8,12]
        System.out.println(Arrays.toString(solution(-4, 2)));
        // [-4, -8]
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        answer[0] = x;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
    }
}
