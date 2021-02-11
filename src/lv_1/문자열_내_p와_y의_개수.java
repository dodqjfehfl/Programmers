package lv_1;

public class 문자열_내_p와_y의_개수 {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        // true
        System.out.println(solution("Pyy"));
        // false
    }

    static boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'p' || c == 'P') {
                pCnt++;
            } else if (c == 'y' || c == 'Y') {
                yCnt++;
            }
        }

        if (pCnt == yCnt)
            return true;
        else
            return false;
    }
}
