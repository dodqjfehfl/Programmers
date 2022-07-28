package lv_1;

public class 두_정수_사이의_합 {
    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        // 12
        System.out.println(solution(3, 3));
        // 3
        System.out.println(solution(5, 3));
        // 12
    }

    public static long solution(int a, int b) {
        long answer = 0;

        if (a == b)
            return a;

        else if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }
}
