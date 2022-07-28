package lv_1;

import java.util.Arrays;

public class 체육복 {
    public static void main(String[] args) {
        int[] lost1 = { 2, 4 };
        int[] reserve1 = { 1, 3, 5 };
        System.out.println(solution(5, lost1, reserve1));
        // 5
        int[] lost2 = { 2, 4 };
        int[] reserve2 = { 3 };
        System.out.println(solution(5, lost2, reserve2));
        // 4
        int[] lost3 = { 3 };
        int[] reserve3 = { 1 };
        System.out.println(solution(3, lost3, reserve3));
        // 2
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n + 2];
        Arrays.fill(student, 1);

        for (int i = 0; i < lost.length; i++) {
            student[lost[i]]--;
        }

        for (int i = 0; i < reserve.length; i++) {
            student[reserve[i]]++;
        }

        // 체육복 나눠주기
        for (int i = 1; i <= n; i++) {
            // 남음
            if (student[i] > 1) {
                if (student[i - 1] == 0) {
                    student[i - 1]++;
                    student[i]--;
                } else if (student[i + 1] == 0) {
                    student[i + 1]++;
                    student[i]--;
                }
            }
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (student[i] > 0)
                answer++;
        }

        return answer;
    }
}
