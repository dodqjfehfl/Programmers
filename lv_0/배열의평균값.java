public class 배열의평균값 {
    public double solution(int[] numbers) {
        double answer = 0;
        int len = numbers.length;

        for (int i = 0; i < len; i++) {
            answer += numbers[i];
        }

        return answer/len;
    }
}
