public class 특정문자제거하기 {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == letter.charAt(0))
                continue;

            sb.append(my_string.charAt(i));
        }

        return sb.toString();
    }
}