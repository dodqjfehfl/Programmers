public class 분수의덧셈 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // gcd 구하는거 연습하기
        int[] answer = new int[2];
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;

        for (int i = numer - 1; i > 1; i--) {
            if (numer % i == 0 && denom % i == 0) {
                numer /= i;
                denom /= i;
            }
        }

        answer[0] = numer;
        answer[1] = denom;
        return answer;
    }
}
