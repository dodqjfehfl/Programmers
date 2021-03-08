package lv_1;

public class 소수_만들기 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        System.out.println(solution(arr1));
        // 1
        int[] arr2 = { 1, 2, 7, 6, 4 };
        System.out.println(solution(arr2));
        // 4
    }

    static int answer;

    public static int solution(int[] nums) {
        answer = 0;

        dfs(nums, 0, 0, 0);

        return answer;
    }

    static boolean isPrime(int n) {
        int sprt = (int) Math.sqrt(n) + 1;

        for (int i = 2; i < sprt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void dfs(int[] nums, int idx, int selected, int sum) {
        if (selected == 3) {
            if (isPrime(sum)) {
                answer++;
            }
            return;
        }

        if (idx == nums.length)
            return;

        dfs(nums, idx + 1, selected + 1, sum + nums[idx]);
        dfs(nums, idx + 1, selected, sum);
    }
}
