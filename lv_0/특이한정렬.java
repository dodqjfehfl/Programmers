import java.util.Arrays;
import java.util.Comparator;

public class 특이한정렬 {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1 - n) == Math.abs(o2 - n)) {
                    return o1 - o2;
                }
                return Math.abs(o1 - n) - Math.abs(o2 - n);
            }
            
        });
        return numlist;
    }
}
