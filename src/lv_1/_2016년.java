package lv_1;

public class _2016년 {
    public static void main(String[] args) {
        System.out.println(solution(5, 24));
        // TUE

    }

    public static String solution(int a, int b) {
        int total_days = b;

        int[] months = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] days = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };

        for (int i = 1; i < a; i++) {
            total_days += months[i];
        }

        total_days = (total_days - 1) % 7;

        return days[total_days];
    }
}
