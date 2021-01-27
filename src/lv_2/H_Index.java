package lv_2;

import java.util.Arrays;

public class H_Index {
    public static void main(String[] args) {
        int[] citations = { 3, 0, 6, 1, 5 };
        System.out.println(solution(citations));
        // 3
    }

    public static int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);
        // System.out.println(Arrays.toString(citations));

        int idx = citations.length / 2;

        while (idx < citations.length) {
            // System.out.println(citations[idx++]);
            if (citations.length - idx + 1 >= citations[idx] && citations.length - idx <= citations[idx]) {
                if (answer == citations[idx]) {
                    break;
                } else {
                    answer = citations[idx];
                    idx++;
                }
            } else {
                idx--;
            }
        }

        return answer;
    }
}

// 런타임 에러 -> 이런 식이 아닌 다른 방법이 있을듯