package lv_1;

public class 하샤드_수 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        // true
        System.out.println(solution(12));
        // true
        System.out.println(solution(11));
        // false
        System.out.println(solution(13));
        // false
    }

    public static boolean solution(int x) {
        int x_copy = x;
        int num = 0;

        while (x_copy > 0) {
            num += x_copy % 10;
            x_copy /= 10;
        }

        System.out.println("x" + x);
        System.out.println("num" + num);

        return x % num == 0 ? true : false;
    }
}
