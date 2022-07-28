package lv_2;

import java.util.HashSet;

public class 소수_찾기 {
    public static void main(String[] args) {
        System.out.println(solution("17"));
        // 3
        System.out.println(solution("011"));
        // 2
    }

    static HashSet<Integer> set;
    static boolean[] check;

    public static int solution(String numbers) {
        int answer = 0;

        // 문자열로 만들수 있는 수 조합 만들기
        set = new HashSet<Integer>();
        check = new boolean[numbers.length()];
        combi(numbers, numbers.length(), 0, "");

        // System.out.println(set.toString());

        for (int num : set) {
            if (num <= 1)
                continue;

            int half = (int) (Math.sqrt((double) num)) + 1;
            boolean isPrime = true;

            for (int i = 2; i < half; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                answer++;
            }
        }

        return answer;
    }

    static void combi(String numbers, int len, int idx, String newNumber) {
        if (idx == len) {
            // System.out.println(newNumber);

            // 나온 수를 int 형변환 후 hashset에 저장
            if (newNumber.trim().length() > 0)
                set.add(Integer.parseInt(newNumber));
            return;
        }

        // 조합이 더 다양하게 나오도록
        for (int i = 0; i < len; i++) {
            if (!check[i]) {
                check[i] = true;
                combi(numbers, len, idx + 1, newNumber + numbers.charAt(i));
                combi(numbers, len, idx + 1, newNumber);
                check[i] = false;
            }
        }
    }
}
