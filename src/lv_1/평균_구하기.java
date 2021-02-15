package lv_1;

public class 평균_구하기 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        System.out.println(solution(arr1));
        // 2.5
        int[] arr2 = { 5, 5 };
        System.out.println(solution(arr2));
        // 5
    }

    public static double solution(int[] arr) {
        double answer = 0;

        for (int number : arr) {
            answer += number;
        }

        return answer / arr.length;
    }
}
