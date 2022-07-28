package lv_1;

import java.util.*;

public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
        // [5,4,3,2,1]
    }

    public static int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];

        int index = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            answer[index--] = str.charAt(i) - '0';
        }

        return answer;
    }
}
