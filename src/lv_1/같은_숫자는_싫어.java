package lv_1;

import java.util.*;

public class 같은_숫자는_싫어 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 3, 3, 0, 1, 1 };
        System.out.println(Arrays.toString(solution(arr1)));
        // [1,3,0,1]
        int[] arr2 = { 4, 4, 4, 3, 3 };
        System.out.println(Arrays.toString(solution(arr2)));
        // [4,3]
    }

    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int number : arr) {
            if (stack.size() == 0) {
                stack.add(number);
            }

            if (stack.peek() != number) {
                stack.add(number);
            }
        }

        int[] answer = new int[stack.size()];
        int i = stack.size() - 1;
        while (!stack.isEmpty()) {
            answer[i--] = stack.pop();
        }

        return answer;
    }
}
