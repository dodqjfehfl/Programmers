package lv_0;

public class 더크게합치기 {
    public static void main(String[] args) {
        System.out.println(solution(9, 91));
        System.out.println(solution(89, 8));
//        9	91	991
//        89	8	898
    }

    public static int solution(int a, int b) {
        int num1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int num2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        return Math.max(num1, num2);
    }
}
