package 알고리즘문제_중급;
// 소수의 합 구하기
// 입력 받은 정수보다 낮은 소수의 합을 구하는 함수를 만드세요.
// 예) 입력 값:12 -> 2 + 3 + 5 + 7 + 11 = 28
// 소수 : 1과 자기자신 이외의 자연수로 나눠지지 않는 수

import java.util.Scanner;

public class PrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        int sum = 0;
        // 입력 받은 정수 미만의 소수를 찾기 위해 반복적으로 prime()메소드 호출
        for(int i = 2; i < n; i++) sum += prime(i); // 2에서부터 입력받은 정수 미만 중 소수만 누적
        System.out.println(sum);

    }
    static int prime(int n) {
        boolean isPrime = true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) isPrime = false;
        }
        if(isPrime) return n;
        else return 0;
    }

}
