package lv_2;

import java.util.*;

public class 카카오프렌즈_컬러링북 {
    public int[] solution(int m, int n, int[][] picture) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        boolean[][] visited = new boolean[m][n];

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (picture[r][c] != 0 && !visited[r][c]) {
                    // 방문 안함
                    int color = picture[r][c];
                    int count = 1;
                    Queue<Point> queue = new LinkedList<Point>();
                    queue.offer(new Point(r, c));
                    visited[r][c] = true;

                    while (!queue.isEmpty()) {
                        Point p = queue.poll();

                        for (int d = 0; d < 4; d++) {
                            int nr = p.r + dirs[d][0];
                            int nc = p.c + dirs[d][1];

                            if ((0 <= nr && nr < m) && (0 <= nc && nc < n)) {
                                if (picture[nr][nc] == color && !visited[nr][nc]) {
                                    count++;
                                    visited[nr][nc] = true;
                                    queue.offer(new Point(nr, nc));
                                }
                            }
                        }
                    }

                    pq.add(count);
                }
            }
        }

        int[] answer = { pq.size(), pq.poll() };
        return answer;
    }

    class Point {
        int r, c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}