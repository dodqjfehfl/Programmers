package lv_0;

import java.util.Scanner;

public class 대소문자바꿔서출력하기 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a = sc.next();

        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);

            if(Character.isUpperCase(c)){
                System.out.print(Character.toLowerCase(c));
            }else{
                System.out.print(Character.toUpperCase(c));
            }
        }
    }
}
