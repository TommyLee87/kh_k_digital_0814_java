package 알고리즘문제_중급;
// PC방 아르바이트
// 손님 수 입력
// 1번부터 100번까지 컴퓨터
// 예약제, 사람이 그 번호에 앉아 있다면 거절.
// 거절 당하는 사람의 수를 출력하는 프로그램을 작성

import java.util.Scanner;

public class PcAlba0823 {
    public static void main(String[] args) {
        int[] pcSeat = new int[100];
        int rejCnt = 0;
        int seatNum;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  // 손님 수 입력 받음.
        for(int i = 0; i < num; i++) {
            seatNum = sc.nextInt();
            if(pcSeat[seatNum-1] == 1) rejCnt++;
            else (pcSeat[seatNum-1]) = 1;
        }
        System.out.println(rejCnt);


    }
}
