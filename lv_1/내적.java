package lv_1;

public class 내적 {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={-3,-1,0,2};
        System.out.println(solution(a,b));
//        3
        int[] a2={-1,0,1};
        int[] b2={1,0,-1};
        System.out.println(solution(a2,b2));
//        -2
    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i=0;i<a.length;i++){
            answer+=(a[i]*b[i]);
        }

        return answer;
    }
}
