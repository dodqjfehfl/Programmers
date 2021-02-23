package lv_1;

public class 정수_제곱근_판별 {
    public static void main(String[] args) {
        System.out.println(solution(121));
        // 144
        System.out.println(solution(3));
        // -1
    }

    public static long solution(long n) {
        long answer = 0;

        long sqrt = (long) Math.sqrt(n);

        if (sqrt * sqrt == n) {
            return (sqrt + 1) * (sqrt + 1);
        } else {
            return -1;
        }
    }
}
