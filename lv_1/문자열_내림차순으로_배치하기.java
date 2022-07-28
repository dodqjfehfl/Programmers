package lv_1;

import java.util.*;

public class 문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
        // gfedcbZ
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        PriorityQueue<Character> capital = new PriorityQueue(Collections.reverseOrder());
        PriorityQueue<Character> small = new PriorityQueue(Collections.reverseOrder());

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                capital.add(s.charAt(i));
            } else {
                small.add(s.charAt(i));
            }
        }

        while (!small.isEmpty()) {
            answer.append(small.poll());
        }
        while (!capital.isEmpty()) {
            answer.append(capital.poll());
        }

        return answer.toString();
    }
}
