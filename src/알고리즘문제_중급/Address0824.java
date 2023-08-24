package 알고리즘문제_중급;
// (집)호수판 사이즈 문제
// 숫자를 입력, 몇 칸을 차지하는지 구하는 문제
// 1. 1은 2cm의 너비. 0은 4cm의 너비. 나머지는 3cm의 너비를 차지.
// 2. 각 숫자 사이에는 1cm의 여백
// 3. 호수판의 경계와 숫자 사이에는 1cm의 여백
// 0을 입력하면 종료

import java.util.Scanner;

public class Address0824 {
    public static void main(String[] args) {
        int [] size = {4,2,3,3,3,3,3,3,3,3};
        int sum = 0; // 입력 받은 숫자가 차지하는 총 자릿수
        Scanner sc = new Scanner(System.in);

        while (true) {
            String num = sc.nextLine();
            if(num.equals("0")) break; // 0이 입력되면 끝
            for(int i = 0; i < num.length(); i++ ) {
                sum += size[num.charAt(i) - '0'] + 1; // 1을 더하는 이유는 각 숫자마자 여백 1칸
            }
            System.out.println(sum + 1); // 제잎 앞의 공백 1칸
            sum = 0; // 다음 계산을 위해 sum 변수를 초기화 함

        }










    }
}
