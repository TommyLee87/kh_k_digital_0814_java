package $미니프로젝트_자동차.Tver;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
//                          //  부산, 대전, 강릉, 광주
        final int[] dist = { 0, 400, 150, 200, 300};
        Car car = null; // 부모 클래스의 참조 변수를 만드는데 초기 값으로 null 대입
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int city = sc.nextInt();
        System.out.print("이동 할 승객 수 : ");
        int passCnt = sc.nextInt();
        System.out.print("차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int carsel = sc.nextInt();
        System.out.print("부가 기능 [1]ON [2]OFF : ");
        int option = sc.nextInt();
        boolean isMode = (option ==1)?true:false;
        switch (carsel) {
            case 1 : car = new SportsCar("포르쉐 911"); break;
            case 2 : car = new Sedan("제네시스 G80"); break;
            case 3 : car = new Bus("고속버스"); break;
            default: System.out.println("차량 선택이 잘 못 되었습니다.");
        }
        car.setMode(isMode); // 모드 ON/OFF
        int moveCnt = car.getMovingCnt(passCnt); // 승객의 수로 이동 횟수를 무하는 메소드
        System.out.println("=".repeat(7) + car.getName() + "=".repeat(7));
        System.out.println("총 비용 :" + car.getToTalCost(dist[city], moveCnt));
        System.out.println("총 주유 횟수 :" + car.getRefuelCnt(dist[city], moveCnt));
        System.out.println("총 이동 시간 :" + car.getMovingTime(dist[city], moveCnt));
    }
}
