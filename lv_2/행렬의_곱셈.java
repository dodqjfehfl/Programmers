package lv_2;

import java.util.Arrays;

public class 행렬의_곱셈 {
    public static void main(String[] args) {
        int[][] arr1 = { { 1, 4 }, { 3, 2 }, { 4, 1 } };
        int[][] arr2 = { { 3, 3 }, { 3, 3 } };
        int[][] result1 = solution(arr1, arr2);
        for (int[] rows : result1)
            System.out.println(Arrays.toString(rows));
        // [[15, 15], [15, 15], [15, 15]]
        int[][] arr3 = { { 2, 3, 2 }, { 4, 2, 4 }, { 3, 1, 4 } };
        int[][] arr4 = { { 5, 4, 3 }, { 2, 4, 1 }, { 3, 1, 1 } };
        int[][] result2 = solution(arr3, arr4);
        for (int[] rows : result2)
            System.out.println(Arrays.toString(rows));
        // [[22, 22, 11], [36, 28, 18], [29, 20, 14]]
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                sum = 0;
                for (int k = 0; k < arr2.length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }

        return answer;
    }
}

// 3중 for문 만들기가 어려웠음;;;