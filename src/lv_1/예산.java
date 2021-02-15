package lv_1;

public class 예산 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 2, 5, 4 };
        System.out.println(solution(arr1, 9));
        // 3
        int[] arr2 = { 2, 2, 3, 3 };
        System.out.println(solution(arr2, 10));
        // 4
    }

    static int answer;

    public static int solution(int[] d, int budget) {
        answer = Integer.MIN_VALUE;

        combi(d, budget, 0, 0, 0);

        return answer;
    }

    private static void combi(int[] d, int budget, int idx, int sum, int sel) {
        if (d.length == idx) {
            answer = Integer.max(answer, sel);
            return;
        }

        if (sum + d[idx] <= budget) {
            combi(d, budget, idx + 1, sum + d[idx], sel + 1);
        }
        combi(d, budget, idx + 1, sum, sel);
    }
}
