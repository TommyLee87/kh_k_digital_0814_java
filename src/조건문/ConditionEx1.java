package 조건문;

import java.util.Scanner;

// 조건문은 조건을 만족하는 경우와 만족하지 않는 경우로 나누어 수행하는 것
public class ConditionEx1 {
    public static void main(String[] args) {
        //if ~ else : 참인 경우와 거짓인 경우를 나누어서 수행
//        System.out.println("정수를 입력 하세요 : ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if(num >= 0) {
//            System.out.println(num + "은 양수 입니다.");
//        } else {
//            System.out.println(num + "은 음수 입니다.");
//        }
//            if(num > 100) {
//                System.out.println(num + "은 100보다 크다.");
//            } else if(num == 100) {
//                System.out.println(num + "은 100과 같다.");
//            } else {
//                System.out.println(num + "은 100보다 작다.");
//            }

        System.out.print("문자를 입력 하세요 : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "는 소문자입니다.");
            } else if(ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "는 대문자입니다.");
            } else {
            System.out.println(ch + "는 알파벳이 아닙니다.");
            }

    }
}
