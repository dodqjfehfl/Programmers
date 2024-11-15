public class 소인수분해 {
    public int[] solution(int n) {
        boolean[] nums = new boolean[10001];
        int len = 0;
        int i = 2;

        while (n>=1) {
            if (n % i == 0) {
                if (!nums[i]) {
                    nums[i] = true;
                    len++;
                }
                n /= i;
            } else {
                i++;
            }
        }        

        int[] answer = new int[len];
        int idx = 0;
        for (int j = 2; j < 10001; j++) {
            if (nums[j]) {
                answer[idx++] = j;
            }
        }
        return answer;
    }
}
