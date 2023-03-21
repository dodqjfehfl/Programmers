public class 문자반복출력하기 {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }
}
