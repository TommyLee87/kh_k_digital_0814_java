package 알고리즘문제_중급;
// 3개의 시간 조절용 버튼 A,B,C
// A : 5분, B : 1분, C : 10초
// 누를때마다 저장된 시간만큼 전자레인지 동작시간 증가
// 최소 버튼 조작 방법으로 요리 완성시간인 T(초)를 구해라.

import java.util.Scanner;

public class MicrowaveEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("요리완성시간 : ");
        int t = sc.nextInt();
        if (t % 10 != 0) {
            System.out.print("-1");
            return;
        }
        a = t / 300;   // 5분 버튼에 대한 몫 (5분 버튼이 눌려진 수)
        b = t % 300 / 60;   // 1분 버튼이 눌려진 수
        c = t % 300 % 60 / 10;   // 10초 버튼이 눌려진 수
        System.out.printf("%d %d %d\n", a,b,c);

        }
    }

