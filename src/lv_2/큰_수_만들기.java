package lv_2;

import java.util.Collections;
import java.util.PriorityQueue;

public class 큰_수_만들기 {
    public static void main(String[] args) {
        System.out.println(solution("1924", 2));
        // 94
        System.out.println(solution("1231234", 3));
        // 3234
        System.out.println(solution("4177252841", 4));
        // 775841
    }

    static PriorityQueue<Integer> pq;

    public static String solution(String number, int k) {
        pq = new PriorityQueue<>(Collections.reverseOrder());

        combi(number, k, "", 0, 0);

        return Integer.toString(pq.poll());
    }

    private static void combi(String number, int k, String newNumber, int idx, int sel) {
        if (idx == number.length()) {
            if (newNumber.length() == (number.length() - k)) {
                pq.add(Integer.parseInt(newNumber));
            }
            return;
        }

        combi(number, k, newNumber + number.charAt(idx), idx + 1, sel + 1);
        combi(number, k, newNumber, idx + 1, sel);
    }
}

// 조합 -> 메모리, 시간 초과