public class 문자열정렬하기 {
    public int[] solution(String my_string) {
        int len = 0;
        int idx = 0;
        char c = '0';
        int[] nums = new int[10];

        for (int i = 0; i < my_string.length(); i++) {
            c = my_string.charAt(i);

            if (Character.isDigit(c)) {
                nums[c - 48]++;
                len++;
            }
        }

        int[] answer = new int[len];

        for (int i = 0; i < 10; i++) {
            if (nums[i] > 0) {
                for (int j = 0; j < nums[i]; j++) {
                    answer[idx++] = i;
                }
            }
        }

        return answer;
    }
}
