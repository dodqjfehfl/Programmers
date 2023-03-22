public class 팩토리얼 {
    public int solution(int n) {
        int answer = 0;
        int num=1;

        for (int i = 1; i < 11; i++) {
            num *= i;
            if (n == num) {
                answer = i;
                break;
            } else if(n<num) {
                answer = i-1;
                break;
            }
        }

        return answer;
    }
}
