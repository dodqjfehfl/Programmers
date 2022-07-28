package lv_1;

import java.util.*;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        int[] arr1 = { 5, 9, 7, 10 };
        System.out.println(Arrays.toString(solution(arr1, 5)));
        // [5, 10]
        int[] arr2 = { 2, 36, 1, 3 };
        System.out.println(Arrays.toString(solution(arr2, 1)));
        // [1, 2, 3, 36]
        int[] arr3 = { 3, 2, 6 };
        System.out.println(Arrays.toString(solution(arr3, 10)));
        // [-1]
    }

    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                array.add(arr[i]);
            }
        }

        if (array.size() == 0) {
            return new int[] { -1 };
        }

        int[] answer = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            answer[i] = array.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}
