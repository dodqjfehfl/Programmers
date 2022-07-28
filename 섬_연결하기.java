import java.util.*;

public class 섬_연결하기 {
    public static void main(String[] args) {
        int[][] costs={{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
        System.out.println(solution(4, costs));
        //	4
    }

    public static int solution(int n, int[][] costs) {
        int answer = 0;

        PriorityQueue<bridge> pq=new PriorityQueue<>();
        for(int[] rows:costs){
            pq.add(new bridge(rows[0], rows[1], rows[2]));
        }

        boolean[] check=new boolean[n];
        while (!pq.isEmpty()) {
            //System.out.println(pq.poll());
            bridge front=pq.poll();
            if(check[front.from] && check[front.to])
                continue;
            else{
                check[front.from]=true;
                check[front.to]=true;
                answer+=front.cost;
            }
        }

        return answer;
    }

    static class bridge implements Comparable<bridge>{
        int from, to, cost;

        public bridge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(섬_연결하기.bridge o) {
            return this.cost-o.cost;
        }

        @Override
        public String toString() {
            return "bridge [cost=" + cost + ", from=" + from + ", to=" + to + "]";
        }
    }
}
