package lv_2;

public class 점프와_순간_이동 {
    public static void main(String[] args) {
        System.out.println(solution(5));
        // 2
        System.out.println(solution(6));
        // 2
        System.out.println(solution(5000));
        // 5
    }

    static int answer = 0;

    public static int solution(int n) {
        answer = 0;

        dfs(n, 0, 0);

        return answer;
    }

    private static void dfs(int n, int idx, int cnt) {
        if (n == idx) {
            answer = Integer.min(answer, cnt);
            return;
        }

        if (idx > n)
            return;

        if (idx != 0) {
            dfs(n, idx * 2, cnt);
        }
        dfs(n, idx + 1, cnt + 1);
    }
}
