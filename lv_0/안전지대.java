public class 안전지대 {
    public int solution(int[][] board) {
        int len = board.length;
        int answer = 0;

        // 지뢰가 있는 부분 색칙하기
        coloring(board, len);

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public int[][] coloring(int[][] board, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == 1) {
                    if (i - 1 >= 0 && board[i - 1][j] == 0) {
                        board[i - 1][j] = 2;
                    }
                    if (i + 1 < len && board[i + 1][j] == 0) {
                        board[i + 1][j] = 2;
                    }
                    if (j - 1 >= 0 && board[i][j - 1] == 0) {
                        board[i][j - 1] = 2;
                    }
                    if (j + 1 < len && board[i][j + 1] == 0) {
                        board[i][j + 1] = 2;
                    }
                    if (i - 1 >= 0 && j - 1 >= 0 && board[i - 1][j - 1] == 0) {
                        board[i - 1][j - 1] = 2;
                    }
                    if (i - 1 >= 0 && j + 1 < len && board[i - 1][j + 1] == 0) {
                        board[i - 1][j + 1] = 2;
                    }
                    if (i + 1 < len && j - 1 >= 0 && board[i + 1][j - 1] == 0) {
                        board[i + 1][j - 1] = 2;
                    }
                    if (i + 1 < len && j + 1 < len && board[i + 1][j + 1] ==0) {
                        board[i + 1][j + 1] = 2;
                    }
                }
            }
        }

        return board;
    }
}
