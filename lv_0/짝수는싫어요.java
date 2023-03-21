public class 짝수는싫어요 {
    public int[] solution(int n) {
        int len = n % 2 == 0 ? n / 2 : (n + 1) / 2;
        int[] answer = new int[len];

        for (int i = 1, j=0; i <= n; i += 2, j++) {
            answer[j] = i;
        }

        return answer;
    }
}
