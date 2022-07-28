package lv_1;

import java.util.Arrays;

public class 행렬의_덧셈 {
    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2 }, { 2, 3 } };
        int[][] arr2 = { { 3, 4 }, { 5, 6 } };
        int[][] result1 = solution(arr1, arr2);
        for (int[] rows : result1)
            System.out.println(Arrays.toString(rows));
        // [[4,6],[7,9]]

        int[][] arr3 = { { 1 }, { 2 } };
        int[][] arr4 = { { 3 }, { 4 } };
        int[][] result2 = solution(arr3, arr4);
        for (int[] rows : result2)
            System.out.println(Arrays.toString(rows));
        // [[4],[6]]
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
