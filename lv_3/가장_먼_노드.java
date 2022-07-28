import java.util.*;

public class 가장_먼_노드 {
    public static void main(String[] args) {
        int[][] vertex = { { 3, 6 }, { 4, 3 }, { 3, 2 }, { 1, 3 }, { 1, 2 }, { 2, 4 }, { 5, 2 } };
        System.out.println(solution(6, vertex));
        // 3
    }

    public static int solution(int n, int[][] edge) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -9);
        ArrayList[] adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<Node>();
        }

        for (int[] rows : edge) {
            adj[rows[0]].add(new Node(rows[0], rows[1]));
            adj[rows[1]].add(new Node(rows[1], rows[0]));
        }

        dist[1] = 0;
        Queue<Node> queue = new LinkedList<Node>();
        for (int i = 0; i < adj[1].size(); i++) {
            queue.add((Node) adj[1].get(i));
        }

        while (!queue.isEmpty()) {
            Node front = queue.poll();

            if (dist[front.to] == -9) {
                dist[front.to] = dist[front.from] + 1;
                for (int i = 0; i < adj[front.to].size(); i++) {
                    queue.add((Node) adj[front.to].get(i));
                }
            } else {
                dist[front.to] = Integer.min(dist[front.to], dist[front.from] + 1);
            }
        }

        // System.out.println(Arrays.toString(dist));
        int maxLen = -1;
        int maxCnt = 0;

        for (int i = 1; i <= n; i++) {
            if (dist[i] > maxLen) {
                maxLen = dist[i];
                maxCnt = 1;
            } else if (dist[i] == maxLen) {
                maxCnt++;
            }
        }

        return maxCnt;
    }

    static class Node {
        int from, to;

        public Node(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }
}
