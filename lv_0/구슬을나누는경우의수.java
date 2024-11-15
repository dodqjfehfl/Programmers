public class 구슬을나누는경우의수 {
    public int solution(int balls, int share) {
        long[] fact = new long[31];
        fact[0] = 1;

        for (int i = 1; i < 31; i++) {
            fact[i] = fact[i - 1] * i;
        }

        return (int) (fact[balls]/(fact[balls-share]*fact[share]));
    }
}
