package lv_1;

public class 서울에서_김서방_찾기 {
    public static void main(String[] args) {
        String[] seoul = { "Jane", "Kim" };
        System.out.println(solution(seoul));
        // 김서방은 1에 있다
    }

    public static String solution(String[] seoul) {
        StringBuilder answer = new StringBuilder();
        answer.append("김서방은 ");

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer.append(i);
                break;
            }
        }

        answer.append("에 있다");
        return answer.toString();
    }
}
