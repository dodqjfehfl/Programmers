import java.util.*;

public class 최댓값만들기_2 {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        // Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer = Math.max(answer, numbers[i] * numbers[j]);
            }
        }

        return answer;
    }
}
