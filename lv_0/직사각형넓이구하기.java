public class 직사각형넓이구하기 {
    public int solution(int[][] dots) {
        int hori = dots[0][0] - dots[1][0];
        int verti = dots[1][1] - dots[2][1];
        
        return Math.abs(hori*verti);
    }
}
