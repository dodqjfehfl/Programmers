package lv_1;

import java.util.Arrays;

public class 모의고사 {
    public static void main(String[] args) {
        int[] answer1 = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(solution(answer1)));
        // [1]
        int[] answer2 = { 1, 3, 2, 4, 2 };
        System.out.println(Arrays.toString(solution(answer2)));
        // [1,2,3]
    }

    public static int[] solution(int[] answers) {
        int[] person2 = { 1, 3, 4, 5 };
        int[] person3 = { 3, 1, 2, 4, 5 };

        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;

        for (int i = 0; i < answers.length; i++) {
            // 1번 사람

            if (answers[i] == (i % 5) + 1) {
                answer1++;
            }

            // 2번 사람
            if (i % 2 == 0) { // 짝수
                if (answers[i] == 2)
                    answer2++;
            } else {
                if (answers[i] == person2[(i / 2) % 4])
                    answer2++;
            }

            // 3번 사람
            if (answers[i] == person3[(i / 2) % 5]) {
                answer3++;
            }
        }

        // 비교
        if ((answer1 > answer2) && (answer1 > answer3)) {
            // 1이 제일 큼
            int[] answer = { 1 };
            return answer;
        } else if ((answer1 > answer2) && (answer1 == answer3)) {
            // 1,3 이 제일 큼
            int[] answer = { 1, 3 };
            return answer;
        } else if ((answer1 == answer2) && (answer1 > answer3)) {
            // 1,2 이 제일 큼
            int[] answer = { 1, 2 };
            return answer;
        } else if ((answer2 > answer1) && (answer2 > answer3)) {
            // 2 이 제일 큼
            int[] answer = { 2 };
            return answer;
        } else if ((answer2 > answer1) && (answer2 == answer3)) {
            // 2,3 이 제일 큼
            int[] answer = { 2, 3 };
            return answer;
        } else if ((answer3 > answer1) && (answer3 > answer2)) {
            // 3 이 제일 큼
            int[] answer = { 3 };
            return answer;
        } else {
            // 모두 동일
            int[] answer = { 1, 2, 3 };
            return answer;
        }
    }
}

// 단순 비교 노가다