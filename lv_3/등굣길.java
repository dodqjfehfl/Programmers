package lv_3;

import java.util.Arrays;

public class 등굣길 {
    public static void main(String[] args) {
        int[][] puddles = { { 2, 2 } };
        System.out.println(solution(4, 3, puddles));
        // 4
    }

    public static int solution(int m, int n, int[][] puddles) {
        int[][] answer = new int[n][m];

        int mod = 1_000_000_007;

        // 웅덩이를 큰 값으로 변경
        for (int[] rows : puddles) {
            answer[rows[0] - 1][rows[1] - 1] = 99999;
        }

        answer[0][0] = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (answer[i][j] == 99999) // 웅덩이는 pass
                    continue;

                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0) { // 첫줄은 위에 불가
                    answer[i][j] = answer[i][j - 1] + 1;
                } else if (j == 0) { // 첫칸은 왼쪽 불가
                    answer[i][j] = answer[i - 1][j] + 1;
                } else { // 양쪽 가능
                    answer[i][j] = Math.min(answer[i][j - 1] + 1, answer[i - 1][j] + 1);
                }

                answer[i][j] %= mod;
            }
        }

        for (int[] rows : answer)
            System.out.println(Arrays.toString(rows));

        return (answer[n - 1][m - 1]);
    }
}

// 런타임에러, 실패 -> 계산이 잘못된듯
// 코드를 정리했지만 실패...