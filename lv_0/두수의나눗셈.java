public class 두수의나눗셈 {
    public int solution(int num1, int num2) {
        float answer = (float) num1 % (float) num2;
        return (int)(((float)num1) / ((float)num2)*1000);
    }
}
