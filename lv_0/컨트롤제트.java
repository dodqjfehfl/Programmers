import java.util.Stack;
import java.util.StringTokenizer;

public class 컨트롤제트 {
    public int solution(String s) {
        int answer = 0;
        StringTokenizer st = new StringTokenizer(s);
        Stack<Integer> stack = new Stack<Integer>();
        String temp;

        while (st.hasMoreTokens()) {
            temp = st.nextToken();

            if (temp.equals("Z") && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(temp));
            }
        }
        
        while (!stack.isEmpty()) {
            answer+=stack.pop();
        }
        
        return answer;
    }
}
