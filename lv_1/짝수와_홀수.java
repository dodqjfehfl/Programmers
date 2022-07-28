package lv_1;

public class 짝수와_홀수 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        // Odd
        System.out.println(solution(4));
        // Even
    }

    public static String solution(int num) {
        if (num % 2 == 0)
            return "Even";
        else
            return "Odd";
    }
}
