package 알고리즘문제_중급;
// 더하기 사이클
// 입력 받은 수를 더하기 사이클 조건에 넣었을 때 몇 회만에 원래 입력 받은 수로 돌아오는지 확인

// == 1Cycle ==
// 입력 26 => 2와 6으로 분리해서 더함 => 8
// 원래 값의 1의 자리 숫자 6과 새로운 값의 1의 자리 8을 붙임 => 68

// == 2Cycle ==
// 68 => 6과 8로 분리 후 더함 => 14
// 8과 4를 붙임 => 84

// == 3Cycle ==
// 84를 8과 4로 분리 후 더함 => 12
// 4와 2 붙임 => 42

// == 4Cycle ==
// 4와 2 분리 후 더함 => 6
// 2와 6 붙임 => 26 (원래 수로 돌아옴)

import java.util.Scanner;

public class PlusCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int input = sc.nextInt(); // 최초 숫자를 입력 받음
        int totalCnt = 0; // 총 사이클 누적 횟수
        int calcNum = input; // 최초 입력값이 변경되지 않도록 하기 위해서
        int divsum = 0; // 수를 10의 자리와 1의 자리를 분리해서 더하기 위한 변수
        int newNum = 0;
        while (true) {
            totalCnt++;
            divsum = (calcNum / 10) + (calcNum % 10); // 10의 자리와 1의 자리를 분리해서 더함
            newNum = (calcNum % 10) * 10 + (divsum % 10); // 앞의 1의 자리 + 계산된 수의 1의자리
            if(newNum == input) break;
            calcNum = newNum;
        }
        System.out.println(totalCnt);
    }
}
