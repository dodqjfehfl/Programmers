public class 숫자찾기 {
    public int solution(int num, int k) {
        int temp = 0;
        int idx = 0;
        int d = 0;
        boolean find = false;

        while (num > 0) {
            temp = num % 10;
            if (temp == k) {
                idx = d;
                find = true;
            }
            num/=10;
            d++;
        }

        return find?d-idx:-1;
    }
}
