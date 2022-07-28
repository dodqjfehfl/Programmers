package lv_2;

import java.util.HashSet;
import java.util.Set;

public class 전화번호_목록 {
    public static void main(String[] args) {
        String[] phone_book1 = { "119", "97674223", "1195524421" };
        System.out.println(solution(phone_book1));
        // false
        String[] phone_book2 = { "123", "456", "789" };
        System.out.println(solution(phone_book2));
        // true
        String[] phone_book3 = { "12", "123", "1235", "567", "88" };
        System.out.println(solution(phone_book3));
        // false
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        HashSet<String> set = new HashSet<String>();

        for (String numbers : phone_book) {
            for (int i = 0; i < set.size(); i++) {
                // if(numbers.contains(Set.)))
            }
        }

        return answer;
    }
}
