package lv_2;

import java.util.*;

public class 게임_맵_최단거리 {
    public static void main(String[] args) {
        int[][] maps1 = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 },
                { 0, 0, 0, 0, 1 } };
        System.out.println(solution(maps1));
        // 11
        int[][] maps2 = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 1 } };
        System.out.println(solution(maps2));
        // -1
    }

    static class Point implements Comparable<Point> {
        int x, y, count;

        public Point(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }

        @Override
        public int compareTo(Point o) {
            if (this.count < o.count)
                return -1;
            return 1;
        }
    }

    public static int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        boolean[][] visited = new boolean[n][m];

        visited[0][0] = true;

        PriorityQueue<Point> pq = new PriorityQueue<Point>();
        pq.offer(new Point(0, 0, 1));

        while (!pq.isEmpty()) {
            Point p = pq.poll();

            if (p.y == n - 1 && p.x == m - 1) {
                return p.count;
            }

            for (int i = 0; i < 4; i++) {
                int nx = p.x + dirs[i][0];
                int ny = p.y + dirs[i][1];
                if ((0 <= nx && nx < m) && (0 <= ny && ny < n)) {
                    if (maps[ny][nx] == 1 && !visited[ny][nx]) {
                        visited[ny][nx] = true;
                        pq.offer(new Point(nx, ny, p.count + 1));
                    }
                }
            }
        }

        return -1;
    }
}
