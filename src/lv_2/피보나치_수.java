package lv_2;

public class 피보나치_수 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        // 2
        System.out.println(solution(5));
        // 5
    }

    public static int solution(int n) {
        int[] fibo = new int[100001];
        fibo[1] = 1;
        fibo[2] = 1;

        for (int i = 3; i <= n; i++) {
            fibo[i] = (fibo[i - 2] + fibo[i - 1]) % 1234567;
        }

        return fibo[n];
    }
}
