package lv_1;

public class 음양_더하기 {
    public static void main(String[] args) {
        int[] absoluted1 = { 4, 7, 12 };
        boolean[] signs1 = { true, false, true };
        System.out.println(solution(absoluted1, signs1));
        // 9
        int[] absoluted2 = { 1, 2, 3 };
        boolean[] signs2 = { false, false, true };
        System.out.println(solution(absoluted2, signs2));
        // 0
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int len = absolutes.length;

        for (int i = 0; i < len; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}