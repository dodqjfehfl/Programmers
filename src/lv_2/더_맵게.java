package lv_2;

import java.util.*;

public class 더_맵게 {
    public static void main(String[] args) {
        int[] scoville = { 1, 2, 3, 9, 10, 12 };
        System.out.println(solution(scoville, 7));
        // 2
    }

    public static int solution(int[] scoville, int K) {

        PriorityQueue pq = new PriorityQueue<Integer>();
        int count = 0;
        for (int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }

        while (pq.size() > 1) {
            // 한개 꺼내고 확인
            int num1 = (int) pq.poll();

            // 넘으면면 탈출
            if (num1 >= K)
                return count;

            // 안되면 섞고 넣기
            int num2 = (int) pq.poll();
            pq.offer(num1 + (num2 * 2));
            count++;
        }

        if ((int) pq.poll() < K)
            return -1;

        return count;
    }
}
