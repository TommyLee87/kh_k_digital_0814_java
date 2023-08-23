package 영화표예매0823;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

// 간단한 영화표 예매 시스템 예제
// 사용자가 극장의 좌석을 선택, 판매된 좌석의 수만큼 판매 금액을 계산
// 1. 예매하기와 종료하기 메뉴 만들기 (종료하기 선택 시 총 금액 계산)
// 2. 극장의 좌석은 총 10개
// 3. 각 좌석당 금액은 12000원
public class MovieMain {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket(12000); // 생성자를 추가함, 좌석당 가격을 정할 수 있음.
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[1] 예매하기");
            System.out.println("[2] 종료하기");
            if(sc.nextInt() == 1) ticket.selectSeat();
            else {
                System.out.println("총 결제 금액은 " + ticket.totalAmount() + "원 입니다.");
                break;
            }
        }

    }
}
