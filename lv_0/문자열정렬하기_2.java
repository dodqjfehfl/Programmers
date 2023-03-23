public class 문자열정렬하기_2 {
    public String solution(String my_string) {
        int len = 0;
        int idx = 0;
        char c = '0';
        int[] nums = new int[27];

        for (int i = 0; i < my_string.length(); i++) {
            c = Character.toLowerCase(my_string.charAt(i));
            nums[c - 97]++;
            len++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 27; i++) {
            if (nums[i] > 0) {
                for (int j = 0; j < nums[i]; j++) {
                    sb.append(Character.toChars(i + 97));
                }
            }
        }

        return sb.toString();
    }
}
