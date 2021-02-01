package lv_1;

public class 신규_아이디_추천 {
    public static void main(String[] args) {
        // System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
        // "bat.y.abcdefghi"
        System.out.println(solution("z-+.^."));
        System.out.println("============");
        // "z--"
        // System.out.println(solution("=.="));
        System.out.println("============");
        // "aaa"
        System.out.println(solution("123_.def"));
        System.out.println("============");
        // "123_.def"
        System.out.println(solution("abcdefghijklmn.p"));
        System.out.println("============");
        // "abcdefghijklmn"
    }

    public static String solution(String new_id) {
        String answer = step1(new_id);
        System.out.println(answer);
        answer = step2(answer);
        System.out.println(answer);
        answer = step3(answer);
        System.out.println(answer);
        answer = step4(answer);
        System.out.println(answer);
        answer = step5_6(answer);
        System.out.println(answer);
        answer = step7(answer);
        System.out.println(answer);

        return answer;
    }

    static String step1(String new_id) {
        StringBuilder sb = new StringBuilder();
        // 모든 대문자를 대응되는 소문자로 치환
        for (int i = 0; i < new_id.length(); i++) {
            char c = new_id.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    static String step2(String new_id) {
        StringBuilder sb = new StringBuilder();
        // 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        for (int i = 0; i < new_id.length(); i++) {
            char c = new_id.charAt(i);
            if (Character.isLowerCase(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    static String step3(String new_id) {
        StringBuilder sb = new StringBuilder();
        // 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        boolean isComma = false;
        for (int i = 0; i < new_id.length(); i++) {
            char c = new_id.charAt(i);
            if (c == '.') {
                if (!isComma) {
                    isComma = true;
                    sb.append(c);
                }
            } else {
                isComma = false;
                sb.append(c);
            }
        }
        return sb.toString();
    }

    static String step4(String new_id) {
        // 마침표(.)가 처음이나 끝에 위치한다면 제거
        int start = 0;
        int last = new_id.length() - 1;

        if (new_id.charAt(start) == '.')
            start++;
        if (new_id.charAt(last) == '.')
            last--;
        System.out.println("len : " + new_id.length());
        System.out.println("start : " + start);
        System.out.println("last : " + last);
        return new_id.substring(start, last);
    }

    static String step5_6(String new_id) {
        if (new_id.length() == 0) {
            // 빈 문자열이라면, new_id에 "a"를 대입
            return "a";
        } else if (new_id.length() >= 16) {
            // 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
            String id = new_id.substring(0, 16);
            // 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
            return step4(id);
        } else {
            return new_id;
        }
    }

    static String step7(String new_id) {
        // 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙이기
        if (new_id.length() <= 2) {
            StringBuilder sb = new StringBuilder(new_id);
            while (sb.length() <= 2) {
                sb.append(sb.charAt(sb.length() - 1));
            }
            return sb.toString();
        } else {
            return new_id;
        }
    }
}

// 제대로 동작이 안됨.