package 알고리즘문제_중급;
// 휴대폰 요금 계산하기
// 영식 요금제 : 30초당 10원 (30초가 넘어갈 때 마다 전화 +1통)
// 민식 요금제 : 50초당 15원
// 첫 번째 줄에 통화의 횟수(20 미만), 두 번째 줄에 통화당 통화 시간(초단위)
// 영식 요금제는 Y 60, 민식 요금제는 M 45 으로 싼 요금제를 출력
// 요금이 같은 경우 YM으로 총 통화요금 표시

import java.util.Scanner;

public class MobilePayment {
    public static void main(String[] args) {
        int[] call = new int[20]; // 통화 횟수에 대한 통화 시간을 입력 받기 위한 배열
        int yPay = 0, mPay = 0;
        Scanner sc = new Scanner(System.in);
        int callCnt = sc.nextInt(); // 통화 횟수를 입력 받아 변수에 대입
        for(int i = 0; i < callCnt; i++) {
            call[i] = sc.nextInt();
        }
        // 총 통화 요금 구하기
        for(int i = 0; i < callCnt; i++) {
            yPay += (call[i] / 30) * 10 + 10;  // 기본적으로 시간과 관계 없이 전화를 걸면 1통, 30초가 되면 2통
            mPay += (call[i] / 60) * 15 + 15;
        }
        if(yPay < mPay) {
            System.out.println("M" + mPay);
        } else if (yPay > mPay) {
            System.out.println("Y" + yPay);
        } else {
            System.out.println("YM" + yPay);
        }

    }
}
