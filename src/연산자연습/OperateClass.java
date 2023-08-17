package 연산자연습;

import java.util.Scanner;

//산술 연산자 : 사칙연산(+,-,*,/) + 나머지연산자(%)
public class OperateClass {
    public static void main(String[] args) {
        int num1 = 10, num2 =4;
//        System.out.println("덧셈 : " + (num1 + num2));
//        System.out.println("뺄셈 : " + (num1 - num2));
//        System.out.println("곱셈 : " + (num1 * num2));
//        System.out.println("나눗셈 : " + ((double)num1 / num2));
//        System.out.println("나머지 : " + (num1 % num2)); // 10안에 4가 2번 들어가고(몫) 2가 남음 -> 나머지 : 2
//        System.out.println("몫 : " + (num1 / num2));

        // 대입 연산자 : 변수에 값을 대입하는 연산자(=), 프로그램에서 =는 '같다' 라는 의미가 아님, '대입 한다'는 의미
//        System.out.println(num1 += 2); // 복합 대입 연산자 : num1 = num1 + 2;
//        System.out.println(num1 -= 2); // 복합 대입 연산자 : num1 = num1 - 2;
//        System.out.println(num1 *= 2); // 복합 대입 연산자 : num1 = num1 * 2; << 곱셈의 경우 이렇게 많이 씀
//        System.out.println(num1 /= 2); // 복합 대입 연산자 : num1 = num1 / 2; << 나눗셈의 경우 이렇게 많이 씀

        // 증감 연산자 : 단항 연산자, 피연산자의 값을 1만큼 증가 또는 감소시키는 연산자
        //System.out.println(++num1); // 11
        //System.out.println(num1++); // 10
//        int tmp = num1--;
//        System.out.println(tmp);
//        System.out.println(num1);

        // 비교 연산자 : 두 개의 피연산자를 비교하여 어느 쪽이 큰지 판단
        int x = 10;
        int y = 20;
        boolean rst1, rst2, rst3;
        //        System.out.println(x > y); // 거짓 false
//        System.out.println(x < y); // 참 true
//        System.out.println(x == y); // 거짓 false
//        System.out.println(x != y); // 참 true
//        System.out.println(x >= y); // 거짓 false
//        System.out.println(x <= y); // 참 true

        // 논리 연산자 : &&(AND 연산자 : 둘 다 참이면 참), ||(OR 연산자 : 둘 중 하나만 참이면 참)
        // ! : NOT 연산자, 현재가 차이면 거짓, 거짓이면 참
//        rst1 = (x > 0) && (x > y); // 거짓
//        rst2 = (x > 0) || (x < y); // 참
//        rst3 = !((x > 0) || (x < y)); // 거짓
//
//        System.out.println(rst1 + " " + rst2 + " " + rst3);

        // 삼항 연산자 : 3개의 피연산자를 필요로 하는 연산자
//        Scanner sc = new Scanner(System.in);
//        System.out.print("나이를 입력 하세요 : ");
//        int age = sc.nextInt();
//        boolean isAdult = (age > 19)? true: false;
//        System.out.println(isAdult);

        // 문자열 결합 연산자
//        System.out.println("Java" + 18.04 + 12); // Java18.0412
//        System.out.println(3 + 3.3 + "JDK"); // 6.3JDK

        // 연산자 우선 순위 확인
        int val1 = 5;
        int val2 = 5;
        int val3 = 5;
        int result1, result2, result3;

        result1 = val1 + val2 * val3;
        result2 = (val1 + val2) * val3;
        result3 = val1 + (++val2) * val3;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
