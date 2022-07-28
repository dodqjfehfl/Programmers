package lv_1;

public class 핸드폰_번호_가리기 {
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        // *******4444
        System.out.println(solution("027778888"));
        // *****8888
    }

    public static String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < phone_number.length(); i++) {
            if (i < phone_number.length() - 4) {
                answer.append("*");
            } else {
                answer.append(phone_number.charAt(i));
            }
        }

        return answer.toString();
    }
}
