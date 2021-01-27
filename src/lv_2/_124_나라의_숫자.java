package lv_2;

public class _124_나라의_숫자 {
    public static void main(String[] args) {
        System.out.println(solution(1));
        // 1
        System.out.println(solution(2));
        // 2
        System.out.println(solution(3));
        // 4
        System.out.println(solution(4));
        // 11
        System.out.println(solution(10));
        // 41
        System.out.println(solution(7));
        // 21
    }

    public static String solution(int n) {
        String answer = "";

        // 들어온 숫자를 3진법으로 변환
        // 변환된 숫자를 다시 124로 변경
        while (n > 0) {
            int cmd = n % 3;
            n /= 3;
            switch (cmd) {
                case 1:
                    answer = 1 + answer;
                    break;
                case 2:
                    answer = 2 + answer;
                    break;
                case 0:
                    answer = 4 + answer;
                    n--;
                    break;
            }
            // System.out.println("n : " + n);
        }
        // System.out.println(answer);

        return answer;
    }
}
