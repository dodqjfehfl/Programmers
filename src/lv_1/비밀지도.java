package lv_1;

import java.util.Arrays;

public class 비밀지도 {
    public static void main(String[] args) {
        int[] arr1 = { 9, 20, 28, 18, 11 };
        int[] arr2 = { 30, 1, 21, 17, 28 };
        System.out.println(Arrays.toString(solution(5, arr1, arr2)));
        // ["#####","# # #", "### #", "# ##", "#####"]
        int[] arr3 = { 46, 33, 33, 22, 31, 50 };
        int[] arr4 = { 27, 56, 19, 14, 14, 10 };
        System.out.println(Arrays.toString(solution(6, arr3, arr4)));
        // ["######", "### #", "## ##", " #### ", " #####", "### # "]
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String temp = Integer.toBinaryString(arr1[i] | arr2[i]);
            // System.out.println(temp);
            temp = String.format("%" + n + "s", temp);
            temp = temp.replace("1", "#");
            temp = temp.replace("0", " ");
            // System.out.println(temp);
            answer[i] = temp;
        }

        return answer;
    }
}

// 비트 연산으로 숫자를 만들고 자리 고정 숫자 변환