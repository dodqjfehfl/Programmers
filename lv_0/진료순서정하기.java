import java.util.Arrays;

public class 진료순서정하기 {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];
        int[] temp = Arrays.copyOf(emergency, len);
        Arrays.sort(temp);

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (temp[i] == emergency[j]) {
                    answer[j] = len - i;
                }
            }
        }
        
        return answer;
    }
}
