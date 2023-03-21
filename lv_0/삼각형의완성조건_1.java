public class 삼각형의완성조건_1 {
    public int solution(int[] sides) {
        int maxLen = Math.max(sides[0], Math.max(sides[1], sides[2]));
        int sum = sides[0] + sides[1] + sides[2] - maxLen;

        return sum>maxLen?1:2;
    }
}
