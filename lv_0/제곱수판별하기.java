public class 제곱수판별하기 {
    public int solution(int n) {
        int answer = 2;
        int temp=0;

        for (int i = 1; i < 1000001; i++) {
            temp = i * i;
            if (temp == n) {
                answer = 1;
                break;
            }
            if (temp > n) {
                break;
            }
        }

        return answer;
    }
}
