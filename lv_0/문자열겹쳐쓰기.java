package lv_0;

public class 문자열겹쳐쓰기 {
    public static void main(String[] args) {
        System.out.println(solution("He11oWor1d", "lloWorl", 2));
//        "He11oWor1d"	"lloWorl"	2	"HelloWorld"
        System.out.println(solution("Program29b8UYP", "merS123", 7));
//        "Program29b8UYP"	"merS123"	7	"ProgrammerS123"
    }

    public static String solution(String my_string, String overwrite_string, int s) {

        System.out.println(my_string.substring(0, s));
        System.out.println(overwrite_string);
        System.out.println(my_string.substring(overwrite_string.length() + s, my_string.length()));
        return my_string.substring(0, s) + overwrite_string + my_string.substring(overwrite_string.length() + s, my_string.length());
    }
}
