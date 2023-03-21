public class 최빈값구하기 {
    public int solution(int[] array) {
        int[] nums = new int[1001];
        int max = -1;
        int maxIdx = -1;
        boolean isSame = false;

        for (int i = 0; i < array.length; i++) {
            nums[array[i]]++;
        }

        for (int i = 0; i < 1001; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIdx = i;
            }
        }

        for (int i = 0; i < 1001; i++) {
            if (nums[i] == max && i != maxIdx) {
                isSame = true;
            }
        }

        return isSame?-1:maxIdx;
    }
}
