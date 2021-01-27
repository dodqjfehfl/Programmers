package lv_1;

import java.util.*;

public class 문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {
        String[] strings1 = { "sun", "bed", "car" };
        String[] result1 = solution(strings1, 1);
        System.out.println(Arrays.toString(result1));
        // ["car", "bed", "sun"]
        String[] strings2 = { "abce", "abcd", "cdx" };
        String[] result2 = solution(strings2, 2);
        System.out.println(Arrays.toString(result2));
        // ["abcd", "abce", "cdx"]
    }

    public static String[] solution(String[] strings, int n) {

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) == o2.charAt(n))
                    return o1.compareTo(o2);
                return o1.charAt(n) - o2.charAt(n);
            }
        });

        return strings;
    }
}
