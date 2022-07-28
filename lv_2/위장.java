package lv_2;

import java.util.*;

public class 위장 {
    public static void main(String[] args) {
        String[][] clothes1 = { { "yellowhat", "headgear" }, { "bluesunglasses", "eyewear" },
                { "green_turban", "headgear" } };
        System.out.println(solution(clothes1));
        // 5
        String[][] clothes2 = { { "crowmask", "face" }, { "bluesunglasses", "face" }, { "smoky_makeup", "face" } };
        System.out.println(solution(clothes2));
        // 3
    }

    public static int solution(String[][] clothes) {
        HashMap<String, Integer> wear = new HashMap<>();

        for (String[] cloth : clothes) {
            wear.put(cloth[1], wear.getOrDefault(cloth[1], 0) + 1);
        }

        int answer = 1;
        for (String s : wear.keySet()) {
            answer = answer * (wear.get(s) + 1);
        }

        return answer - 1;
    }
}
