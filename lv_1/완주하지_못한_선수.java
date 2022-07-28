package lv_1;

import java.util.Arrays;

public class 완주하지_못한_선수 {
    public static void main(String[] args) {
        String[] participant1 = { "leo", "kiki", "eden" };
        String[] completion1 = { "eden", "kiki" };
        System.out.println(solution(participant1, completion1));
        // leo
        String[] participant2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
        String[] completion2 = { "josipa", "filipa", "marina", "nikola" };
        System.out.println(solution(participant2, completion2));
        // vinko
        String[] participant3 = { "mislav", "stanko", "mislav", "ana" };
        String[] completion3 = { "stanko", "ana", "mislav" };
        System.out.println(solution(participant3, completion3));
        // mislav
    }

    public static String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        int len = completion.length;
        for (int i = 0; i < len; i++) {
            if (!completion[i].equals(participant[i])) {
                return participant[i];
            }
        }
        return participant[len];
    }
}

// 문자열을 정렬을 하고 확인하면서 답 찾기