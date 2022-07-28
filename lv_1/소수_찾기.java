package lv_1;

public class 소수_찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        // 4
        System.out.println(solution(5));
        // 3
    }

    public static int solution(int n) {
        int answer = 1;

        if (n == 2)
            return 1;

        boolean flag = true;
        for (int i = 3; i <= n; i += 2) {
            flag = true;
            for (int j = 2; j < (int) (Math.sqrt(i)) + 1; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer++;
            }
        }

        return answer;
    }

}