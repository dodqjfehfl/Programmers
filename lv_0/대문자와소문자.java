public class 대문자와소문자 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char c= '0';

        for (int i = 0; i < my_string.length(); i++) {
            c = my_string.charAt(i);

            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString();
    }
}
