import java.util.Scanner;

public class 직각삼각형출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb = new StringBuilder();
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            System.out.println(sb.toString());
        }
    }
}
