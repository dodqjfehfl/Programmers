package lv_1;

public class 수박수박수박수박수박수 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        // 수박수
        System.out.println(solution(4));
        // 수박수박
    }

    public static String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n / 2; i++) {
            answer.append("수박");
        }
        if (n % 2 == 1) {
            answer.append("수");
        }

        return answer.toString();
    }
}
