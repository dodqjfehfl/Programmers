public class 가까운수 {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int diff = Math.abs(array[0] - n);
        int temp = 0;
System.out.println(diff);
        for (int i = 1; i < array.length; i++) {
            temp = Math.abs(array[i] - n);
            System.out.println(temp);
            if (temp < diff) {
                diff = temp;
                answer = array[i];
            }
        }

        return answer;
    }
}
