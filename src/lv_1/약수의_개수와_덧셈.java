package lv_1;

import java.util.HashSet;

public class 약수의_개수와_덧셈 {
    public static void main(String[] args) {
        System.out.println(solution(13, 17));
    }

    public int solution(int left, int right) {
        int answer = 0;

        HashSet<Integer> set = null;
        for (int i = left; i <= right; i++) {
            set = new HashSet();
            int limit = (int) (Math.sqrt(i)) + 1;
            for (int j = 1; j < limit; j++) {
                if (i % j == 0) {
                    set.add(j);
                    set.add(i / j);
                }
            }
            if (set.size() % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }
}
