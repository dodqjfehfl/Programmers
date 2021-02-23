package lv_1;

public class 자릿수_더하기 {
    public static void main(String[] args) {
        System.out.println(solution(123));
        // 6
        System.out.println(solution(987));
        // 24
    }

    public static int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
