import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class n의배수고르기 {
    public int[] solution(int n, int[] numlist) {
        Queue<Integer> q = new ConcurrentLinkedQueue<>();

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                q.add(numlist[i]);
            }
        }

        int[] answer = new int[q.size()];
        int idx = 0;

        while (!q.isEmpty()) {
            answer[idx++] = q.poll();
        }

        return answer;
    }
}
