package lv_2;

public class 타겟_넘버 {
    public static void main(String[] args) {
        int[] numbers = { 1, 1, 1, 1, 1 };
        System.out.println(solution(numbers, 3));
        // 5
    }

    static int count;

    public static int solution(int[] numbers, int target) {
        // 카운트 생성
        count = 0;

        // dfs numbers, target, nowSum, nowIdx
        dfs(numbers, target, 0, 0);

        return count;
    }

    // dfs
    static void dfs(int[] numbers, int target, int sum, int idx) {
        // idx가 number 끝이면 같은지 확인
        if (idx == numbers.length) {

            if (sum == target) {
                count++;
            }
            return;
        }

        dfs(numbers, target, sum + numbers[idx], idx + 1);
        dfs(numbers, target, sum - numbers[idx], idx + 1);
    }
}
