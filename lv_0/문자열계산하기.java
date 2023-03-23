import java.util.StringTokenizer;

public class 문자열계산하기 {
    public int solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int answer = Integer.parseInt(st.nextToken());
        String temp;
        int oper = 0; // 0:null, 1:+, 2:-

        while (st.hasMoreTokens()) {
            temp = st.nextToken();

            if (temp.equals("+")) {
                oper = 1;
            } else if (temp.equals("-")) {
                oper = 2;
            } else {
                if (oper == 1) {
                    answer += Integer.parseInt(temp);
                } else {
                    answer -= Integer.parseInt(temp);
                }
            }
        }

        return answer;
    }
}
