import java.util.Set;
import java.util.Stack;

public class 약수구하기 {
    public int[] solution(int n) {
        boolean[] nums = new boolean[n + 1];
        int len = 0;

        for (int i = 1; i < n+1; i++) {
            if (n % i == 0) {
                if (!nums[i]) {
                    nums[i] = true;
                    len++;
                }
                if (!nums[n/i]) {
                    nums[n/i] = true;
                    len++;
                }
            }
        }

        int[] answer = new int[len];
        int idx = 0;

        for (int i = 1; i < n + 1; i++) {
            if (nums[i]) {
                answer[idx++] = i;
            }
        }
        
        return answer;
    }
}
