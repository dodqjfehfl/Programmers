package lv_1;

public class 크레인_인형뽑기_게임 {
    public static void main(String[] args) {
        int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
                { 3, 5, 1, 3, 1 } };
        int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
        System.out.println(solution(board, moves));
        // 4
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        int N = board.length;// 길이
        int[] pick = new int[1001];// moves 배열의 크기는 1 이상 1,000 이하
        int pick_cnt = 0;

        for (int i = 0; i < moves.length; i++) {
            int move = moves[i] - 1;// 줄 선택

            for (int j = 0; j < N; j++) {

                if (board[j][move] != 0) { // 빈칸이 아니라면
                    int temp = board[j][move]; // 뽑기
                    board[j][move] = 0;

                    if (pick_cnt > 0) { // 뽑은 칸에 하나하도 있으면 터트릴 준비
                        if (pick[pick_cnt - 1] == temp) { // 뽑은게 같다면 터트리기
                            answer += 2;
                            pick_cnt--;
                        } else { // 아니면 그냥 넣기
                            pick[pick_cnt++] = temp;
                        }
                    } else { // 없으면 그냥 넣기
                        pick[pick_cnt++] = temp;
                    }
                    break;
                }
            }
        }

        return answer;
    }
}
