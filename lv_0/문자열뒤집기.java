public class 문자열뒤집기 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        return sb.reverse().toString();
    }
}
