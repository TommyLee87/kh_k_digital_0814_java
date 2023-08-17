package 계산기만들기;

import java.util.Scanner;

public class CalcSwitch {
    public static void main(String[] args) {
        int x, y; // 좌변과 우변
        char op; // 연산자
        Scanner sc = new Scanner(System.in);
        System.out.println("계산식 입력 : ");
        x = sc.nextInt();
        op = sc.next().charAt(0);
        y = sc.nextInt();  // x, op, y 값을 한 번에 입력 받고 있음. 입력 시 공백으로 구분 ex) 200 + 10
        switch (op) {
            case '+' :
                System.out.println("덧셈 : " + (x + y));
                break;
            case '-' :
                System.out.println("뺄셈 : " + (x - y));
                break;
            case '*' :
                System.out.println("곱셈 : " + (x * y));
                break;
            case '/' :
                System.out.println("나눗셈 : " + ((double)x / y));
                break;
            case '%' :
                System.out.println("나머지 : " + (x % y));
                break;
            default:
                System.out.println("연산자를 잘 못 입력하셨습니다.");
        }
    }
}
