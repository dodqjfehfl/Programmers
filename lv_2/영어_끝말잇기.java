package lv_2;

import java.util.*;

public class 영어_끝말잇기 {
    public static void main(String[] args) {

        String[] words1 = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };
        System.out.println(solution(3, words1));
        // [3,3]
        String[] words2 = { "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure",
                "establish", "hang", "gather", "refer", "reference", "estimate", "executive" };
        System.out.println(solution(5, words2));
        // [0,0]
        String[] words3 = { "hello", "one", "even", "never", "now", "world", "draw" };
        System.out.println(solution(2, words3));
        // [1,3]
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = { 0, 0 };

        int[] count = new int[n]; // 몇번째인지 확인
        int idx = 0; // 누구인지 확인
        ArrayList<String> said = new ArrayList<String>();

        char last = '0';

        for (String word : words) {
            if (word.length() == 1) {
                // 한글자 안됨
                answer[0] = idx + 1;
                answer[1] = count[idx] + 1;
                break;
            }

            if (last == '0') {
                // 첫단어
                last = word.charAt(word.length() - 1);
                said.add(word);

            } else {
                // 첫 단어 아님
                if (word.charAt(0) == last && !said.contains(word)) {
                    last = word.charAt(word.length() - 1);
                    said.add(word);
                } else {
                    answer[0] = idx + 1;
                    answer[1] = count[idx] + 1;
                    break;
                }
            }

            count[idx]++;
            idx = (idx + 1) % n;

        }

        return answer;
    }
}
