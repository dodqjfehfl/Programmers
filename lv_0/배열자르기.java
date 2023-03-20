import java.util.Arrays;

public class 배열자르기 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers, num1, num2+1);
        // new int[num2 - num1 + 1];
        
        // for (int i = num1; i < num1 + num2; i++) {
        //     answer[i - num1] = numbers[i];
        // }

        return answer;
    }
}
