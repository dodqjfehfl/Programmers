package lv_2;

import java.util.Arrays;
import java.util.Comparator;

public class 가장_큰_수 {
    public static void main(String[] args) {
        int[] numbers1 = { 6, 10, 2 };
        System.out.println(solution(numbers1));
        // 6210
        int[] numbers2 = { 3, 30, 34, 5, 9 };
        System.out.println(solution(numbers2));
        // 9534330
    }

    public static String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();

        // Arrays.sort(numbers, new myComparator());

        return answer.toString();
    }

    static class myComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            // TODO Auto-generated method stub
            return o2.compareTo(o1);
        }
    }
}
