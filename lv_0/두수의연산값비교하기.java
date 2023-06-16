package lv_0;

public class 두수의연산값비교하기 {
    public static void main(String[] args) {
        System.out.println(solution(2, 91));
        System.out.println(solution(91, 2));
//        2	91	364
//        91	2	912
    }

    public static int solution(int a, int b) {
        int num1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        return Math.max(num1, 2 * a * b);
    }
}
