public class 한번만등장한문자 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int[] alp = new int[27];
        char c = '0';

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            alp[c - 96]++;
        }

        for (int i = 0; i < 27; i++) {
            if (alp[i] == 1) {
                sb.append(Character.toChars(i+96));
            }
        }

        return sb.toString();
    }
}
