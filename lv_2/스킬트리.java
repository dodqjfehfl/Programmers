package lv_2;

import java.util.HashMap;

public class 스킬트리 {
    public static void main(String[] args) {
        String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };
        System.out.println(solution("CBD", skill_trees));
        // 2
    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < skill.length(); i++) {
            map.put(skill.charAt(i), i);
        }

        for (int i = 0; i < skill_trees.length; i++) {
            String learn = "";

            for (int j = 0; j < skill_trees[i].length(); j++) {
                if (map.containsKey(skill_trees[i].charAt(j))) {
                    learn += skill_trees[i].charAt(j);
                }
            }

            int ck = -1;
            boolean flag = true;
            for (int j = 0; j < learn.length(); j++) {
                if ((map.get(learn.charAt(j))) != (ck + 1)) {
                    flag = false;
                    break;
                }
                ck++;
            }

            if (flag) {
                answer++;
            }
        }

        return answer;
    }
}
