package 알고리즘문제_초급;
// N개의 숫자의 합
// N개의 숫자가 공백 없이 쓰여있다. 이 숫자들을 모두 더해서 출력하는 프로그램을 만들어라.
// 첫째 줄에 숫자의 개수 N(1<= N <= 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
// 입력으로 주어진 숫자 N개의 합을 출력한다.
// [힌트] 입력을 문자열로 간주 해야 함. 문자열에 하나의 문자를 추출해야 함.
// 추출한 문자가 1이라면 '0'이 35라면?

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String number = sc.next();
        int sum = 0;
        for (int i = 0; i < n; i++) {
//        for (int i = 0; i < number.length(); i++) {    //윗줄 대신 이렇게도 가능
            sum += number.charAt(i) - '0';
        }
        System.out.println(sum);

    }
}
