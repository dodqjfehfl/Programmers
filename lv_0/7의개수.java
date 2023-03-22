public class 7의개수 {
    public int solution(int[] array) {
        int answer = 0;

        for(int i=0;i<array.length;i++){
            int num = array[i];
            int temp=0;

            while(num>0){
                temp = num%10;

                if(temp == 7){
                    answer++;
                }
                num/=10;
            }
        }

        return answer;
    }
}
