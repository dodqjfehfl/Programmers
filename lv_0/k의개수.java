public class k의개수 {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (; i <= j; i++) {
            answer+=check(i, k);
        }

        return answer;
    }

    int check(int num, int target) {
        int ck = 0;
        int temp = 0;

        while (num>0) {
            temp = num % 10;
            if (temp == target) {
                ck++;
            }
            num /= 10;
        }

        return ck;
    }
}
