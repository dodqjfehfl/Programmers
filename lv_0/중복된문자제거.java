public class 중복된문자제거 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        boolean[] lowAlp = new boolean[27]; // 26+26+1
        boolean[] uppAlp = new boolean[27]; // 26+26+1
        boolean space = false; // 26+26+1
        char c = '0';

        for (int i = 0; i < my_string.length(); i++) {
            c = my_string.charAt(i);

            if (Character.isLowerCase(c)) {
                if (!lowAlp[c - 97]) {
                    lowAlp[c - 97] = true;
                    sb.append(c);
                }
            } else if (Character.isUpperCase(c)) {
                if (!uppAlp[c - 65]) {
                    uppAlp[c - 65] = true;
                    sb.append(c);
                }
            } else {
                if (!space) {
                    space = true;
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}
