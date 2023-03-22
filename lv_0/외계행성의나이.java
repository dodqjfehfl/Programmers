public class 외계행성의나이 {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        int temp=0;

        while (age > 0) {
            temp = age%10;
            sb.append(Character.toChars(97 + temp));
            age /= 10;
        }

        return sb.reverse().toString();
    }
}
