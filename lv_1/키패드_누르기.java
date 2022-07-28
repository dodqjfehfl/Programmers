package lv_1;

public class 키패드_누르기 {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
        String hand = "right";

        System.out.println(solution(numbers, hand));
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        int[][] keypad = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 0, 11 } };
        int lHand = 10;
        int lR = 3;
        int lC = 0;
        int rHand = 11;
        int rR = 3;
        int rC = 2;

        for (int i = 0; i < numbers.length; i++) {
            int press = numbers[i];
            switch (press) {
                case 1:
                case 4:
                case 7:
                    lHand = press;
                    sb.append('L');
                    lR = press / 3;
                    lC = 0;
                    System.out.println(press + " L");
                    break;
                case 3:
                case 6:
                case 9:
                    rHand = press;
                    sb.append('R');
                    rR = (press - 1) / 3;
                    rC = 2;
                    System.out.println(press + " R");
                    break;
                case 2:
                case 5:
                case 8:
                case 0:
                    // 거리 계산
                    System.out.println("lR : " + lR + ", lC : " + lC);
                    System.out.println("rR : " + rR + ", rC : " + rC);
                    int numR = press == 0 ? 3 : press / 3;
                    int numC = 1;
                    System.out.println("numR : " + numR + ", numC : " + numC);

                    int lLen = Math.abs(numR - lR) + Math.abs(numC - lC);
                    int rLen = Math.abs(numR - rR) + Math.abs(numC - rC);
                    System.out.println("lLen : " + lLen + ", rLen : " + rLen);
                    // 비교

                    if (lLen < rLen) {
                        lHand = press;
                        sb.append('L');
                        System.out.println(press + " L");
                        lR = numR;
                        lC = numC;
                    } else if (rLen < lLen) {
                        rHand = press;
                        sb.append('R');
                        System.out.println(press + " R");
                        rR = numR;
                        rC = numC;
                    } else {
                        if (hand.equals("left")) {
                            lHand = press;
                            sb.append('L');
                            System.out.println(press + " L");
                            lR = numR;
                            lC = numC;
                        } else {
                            rHand = press;
                            sb.append('R');
                            System.out.println(press + " R");
                            rR = numR;
                            rC = numC;
                        }
                    }
                    break;
            }
        }

        return sb.toString();
    }
}