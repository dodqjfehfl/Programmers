package lv_2;

import java.util.*;

public class 기능개발 {
    public static void main(String[] args) {
        int[] progresses1 = { 93, 30, 55 };
        int[] speeds1 = { 1, 30, 5 };
        System.out.println(solution(progresses1, speeds1));
        // [2, 1]
        int[] progresses2 = { 95, 90, 99, 99, 80, 99 };
        int[] speeds2 = { 1, 1, 1, 1, 1, 1 };
        System.out.println(solution(progresses2, speeds2));
        // [1, 3, 2]
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] remain = new int[progresses.length];

        for (int i = 0; i < remain.length; i++) {
            remain[i] = (int) Math.ceil((100 - (double) progresses[i]) / speeds[i]);
        }

        List<Integer> list = new ArrayList();

        int count = 1;
        int day = remain[0];
        for (int i = 1; i < remain.length; i++) {
            if (day >= remain[i]) {
                count++;
            } else {
                list.add(count);
                day = remain[i];
                count = 1;
            }
        }
        list.add(count);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);

        return answer;
    }
}
