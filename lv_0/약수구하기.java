import java.util.Set;
import java.util.Stack;

public class 약수구하기 {
    public int[] solution(int n) {
        Stack<Integer> s = new Stack<Integer>();
        Set

        for (int i = 1; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                s.push(i);
                s.push(n / i);
            }
        }

        int[] answer = {};
        return answer;
    }
}
