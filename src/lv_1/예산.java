package lv_1;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 2, 5, 4 };
        System.out.println(solution(arr1, 9));
        // 3
        int[] arr2 = { 2, 2, 3, 3 };
        System.out.println(solution(arr2, 10));
        // 4
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            if (d[i] <= budget) {
                answer++;
                budget -= d[i];
            }
        }

        return answer;
    }
}

// 단순 조합 -> 시간 초과
// 정렬->하나씩 빼기