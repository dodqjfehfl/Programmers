package lv_1;

public class 약수의_합 {
    public static void main(String[] args) {
        System.out.println(solution(12));
        // 28
        System.out.println(solution(5));
        // 6
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }
}
