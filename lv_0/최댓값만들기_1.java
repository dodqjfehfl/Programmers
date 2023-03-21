import java.util.*;

public class 최댓값만들기_1 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1] * numbers[numbers.length-2];
    }
}
