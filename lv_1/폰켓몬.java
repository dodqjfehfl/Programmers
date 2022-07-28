package lv_1;

import java.util.HashMap;

public class 폰켓몬 {
    public static void main(String[] args) {
        int[] nums1 = { 3, 1, 2, 3 };
        System.out.println(solution(nums1));
        // 2
        int[] nums2 = { 3, 3, 3, 2, 2, 4 };
        System.out.println(solution(nums2));
        // 3
        int[] nums3 = { 3, 3, 3, 2, 2, 2 };
        System.out.println(solution(nums3));
        // 2
    }

    public static int solution(int[] nums) {
        int limit = nums.length / 2;
        // 폰켓몬의 종류 번호는 1 이상 200,000 이하의 자연수
        // HashMap<int, int>를 이용하여 각 갯수를 구하고
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        // map.size() 가 > nums/2 보다 크면
        if (map.size() > limit)
            // return nums/2
            return limit;
        // else return map.size()
        return map.size();
    }
}
