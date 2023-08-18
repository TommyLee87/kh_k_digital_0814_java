package While문;
// 반복 횟수를 알 수 없는 경우
// do ~ while : 무조건 1회 수행 후 조건이 참이면 계속 수행

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
//        int age; // 나이를 입력 받기 위한 변수
//        Scanner sc = new Scanner(System.in);
//        while (true) {//무한으로 반복하기 위해 조건식을 참(true)으로 만듦 (반드시 탈출문이 필요함!!)
//            System.out.println("나이를 입력 하세요 : ");
//            age = sc.nextInt();
//            if (age > 0 && age < 200) break; // 1~199 사이만 입력된 나이로 간주
//            System.out.println("나이를 잘 못 입력 하셨습니다.");
//
//        }
//        System.out.println("입력하신 나이는 " + age + "입니다.");
        int age;
        do {
            System.out.print("나이를 입력 하세요 : ");
            Scanner sc = new Scanner(System.in);
            age = sc.nextInt();
        } while (age <= 0 || age >=200);
    }
    }
