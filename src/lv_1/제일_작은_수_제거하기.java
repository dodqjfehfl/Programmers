package lv_1;

import java.util.Arrays;

public class 제일_작은_수_제거하기 {
    public static void main(String[] args) {
        int[] arr1 = { 4, 3, 2, 1 };
        System.out.println(Arrays.toString(solution(arr1)));
        // [4,3,2]
        int[] arr2 = { 10 };
        System.out.println(Arrays.toString(solution(arr2)));
        // [-1]
    }

    public static int[] solution(int[] arr) {
        int[] answer;

        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arr.length - 1];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                min = Math.min(min, arr[i]);
            }

            boolean ck = false;
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (!ck && arr[i] == min) {
                    ck = true;
                    continue;
                }

                answer[index++] = arr[i];
            }
        }

        return answer;
    }
}
