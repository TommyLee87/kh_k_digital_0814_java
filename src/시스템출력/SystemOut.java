package 시스템출력;

import java.util.Scanner;

//System.out : 표준 출력 스트림
//print, println : 오버로딩이 적용된 메소드이며 줄바꿈 차이만 있음.
public class SystemOut {
    public static void main(String[] args) {
        String name = "곰돌이그자체";
        String addr = "서울시";
        int age = 37;
        char gender = 'M';
        int kor = 99, eng = 88, mat = 77;
//
//        //자바 스타일 : 오버로딩으로 구현 되어 있음
//        System.out.println("======Java Style======");
//        System.out.println("이름 : " + name);
//        System.out.println("주소 : " + addr);
//        System.out.println("성별 : " + gender);
//        System.out.println("나이 : " + age);
////        System.out.println("총점 : " + kor + eng + mat); // 원하는 값이 안나온다.
//        System.out.println("총점 : " + (kor + eng + mat)); //괄호 안부터 처리한다.
////       System.out.println("평균 : " + (double)kor + eng + mat / 3); // -> 원하는 값 안나옴(나누기를 먼저함)
//        System.out.println("평균 : " + ((double)(kor + eng + mat) / 3)); // -> 괄호로 더하기를 먼저 하도록 순서 변경

//        double PI   =   3.1415132364646444;
//
//        System.out.println(age);
//        System.out.println(name);
//        System.out.printf("%s\n", name);
//        System.out.println(PI);
//        System.out.printf("%.2f\n",PI);

        // C언어 스타일 : 서식을 지정하는 스타일
        // 서식지정자 : %d(정수), %ld(long 타입의 정수), %u(보호없는 정수형), %f(실수형), %c(문자)
        // 이스케이프 시퀀스 : \n(줄 바꿈), \r(캐리지 리턴, 커서를 라인의 처음으로 이동), \t(탭), \b(back space), \\
//        System.out.printf("이름 : %s\n", name);
//        System.out.printf("오늘의 습도는 %.2f%% 입니다.", 85.555555); // 실수형 출력, %.2f -> 소수점 2자리까지(반올림)
//        System.out.printf("성별 : %c\n", gender); // 문자 출력
//        System.out.println("안녕하세요. 저의 이름은 \"곰돌이\" 입니다.");
//        System.out.println("안녕하세요. 저의 이름은 '곰돌이' 입니다.");
//        System.out.printf("평균 : %.2f",(kor + eng + mat) / 3.0);
//        System.out.printf("Apple\rBanana\tOrange\n");
//        System.out.printf("Apple\rBanana\tOrange\b\b\n");
//        System.out.printf("%6d%6d%6d\n", 100, 2000, 30000);

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n * n; i++) {
            System.out.printf("%4d", i);
            if (i % n == 0) System.out.println();
        }
    }
}
