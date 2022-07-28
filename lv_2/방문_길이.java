package lv_2;

public class 방문_길이 {
    public static void main(String[] args) {
        System.out.println(solution("ULURRDLLU"));
        // 7
        System.out.println(solution("LULLLLLLU"));
        // 7
    }

    public static int solution(String dirs) {
        int count = 0;

        boolean[][] horizontal = new boolean[11][10];
        boolean[][] vertical = new boolean[10][11];
        int xPos = 5;
        int yPos = 5;

        for (int i = 0; i < dirs.length(); i++) {
            // System.out.println(dirs.charAt(i));
            switch (dirs.charAt(i)) {
                case 'U':
                    if (yPos > 0) {
                        yPos--;
                        if (!vertical[yPos][xPos])
                            count++;
                        vertical[yPos][xPos] = true;
                    }
                    break;
                case 'D':
                    if (yPos < 10) {
                        if (!vertical[yPos][xPos])
                            count++;
                        vertical[yPos][xPos] = true;
                        yPos++;
                    }
                    break;
                case 'L':
                    if (xPos > 0) {
                        xPos--;
                        if (!horizontal[yPos][xPos])
                            count++;
                        horizontal[yPos][xPos] = true;
                    }
                    break;
                case 'R':
                    if (xPos < 10) {
                        if (!horizontal[yPos][xPos])
                            count++;
                        horizontal[yPos][xPos] = true;
                        xPos++;
                    }
                    break;
            }
        }

        return count;
    }
}
