package 영화표예매0823;

import java.util.Scanner;

public class MovieTicket {
    // 좌석의 수 10개
    int seat[] = new int[10];  // 인스턴스 필드
    int ticketPrice;
    MovieTicket(int price) {
        ticketPrice = price;
    }

    // 판매된 좌석의 수를 확인, 총 판매 금액을 구하여 반환
    int totalAmount() {
        int cnt = 0; // 지역변수
        for (int val : seat) { // val 이라는 변수는 seat배열을 처음부터 마지막까지 순회하는 요소
            if (val == 1) cnt++; // val이 1이면 판매된 좌석이라는 의미
        }
        return cnt * 12000; // 반환 값은 int
    }

    void printSeat() { // 선택 가능한 좌석의 리스트를 보여 줌
        for (int s : seat) {
            if (s == 0) System.out.print("[ ]"); // 판매가 안된 좌석
            else System.out.print("[V]"); // 이미 판매된 좌석
        }
        System.out.println();

    }

    void selectSeat() { // 좌석을 판매하는 메뉴
        printSeat(); // 좌석 상태를 보여주는 메소드 호출
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석을 선택하세요 : ");
        int selSeat = sc.nextInt(); // 유저가 선택한 좌석을 입력 받음 (사용자는 1부터 생각)
        if (seat[selSeat - 1] == 0) { // 유저가 선택한 좌석이 판매 되었는지 확인
            seat[selSeat - 1] = 1; // 판매가 안된 좌석이기 때문에 판매 가능
            printSeat();// 판매 이후의 좌석 상태를 다시 보여줌
        } else System.out.println("이미 판매된 좌석입니다. 다른 좌석을 선택하세요.");

    }
}