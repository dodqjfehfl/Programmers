package lv_1;

import java.util.Arrays;
import java.util.HashSet;

public class 두_개_뽑아서_더하기 {
    public static void main(String[] args) {
        int[] numbers={2,1,3,4,1};
        System.out.println(Arrays.toString(solution(numbers)));
//        [2,3,4,5,6,7]
        int[] numbers2={5,0,2,7};
        System.out.println(Arrays.toString(solution(numbers2)));
//        [2,5,7,9,12]
    }

    public static Integer[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j< numbers.length;j++){
                set.add(numbers[i]+numbers[j]);
            }
        }

        Integer[] answer=new Integer[set.size()];
        set.toArray(answer);

        Arrays.sort(answer);

        return answer;
    }
}
