package lv_2;

public class 다음_큰_숫자 {
    public static void main(String[] args) {
        System.out.println(solution(78));
        // 83
        System.out.println(solution(15));
        // 23
    }

    public static int solution(int n) {
        int answer = n + 1;

        int n_bit = Integer.bitCount(n);

        int next = n + 1; // 다음수
        while (true) {
            if (Integer.bitCount(answer) == n_bit)
                break;
            answer++;
        }

        return answer;
    }
}
