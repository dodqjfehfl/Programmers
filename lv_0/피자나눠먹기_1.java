public class 피자나눠먹기_1 {
    public int solution(int n) {
        int answer = n/7;
        return n%7!=0?answer+1:answer;
    }
}