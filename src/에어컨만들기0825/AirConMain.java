package 에어컨만들기0825;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon lgAirCon = new AirCon();
        int elapsedTime = 0; // 경과 시간을 계산하기 위한 변수
        boolean isSetTemp = false; // 온도를 변경 할 조건인지 판단하는 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("에어컨을 켜시겠습니까? (Yes / No) : ");
        String isOn = sc.next();
        if (isOn.equalsIgnoreCase("yes")) {
            lgAirCon.setPower(true);
            lgAirCon.setAirConState();
            while (true) {
                sleep(1000);
                elapsedTime++;
                switch (lgAirCon.getWindStep()) {
                    case 1 : if(elapsedTime >= 60) isSetTemp = true; break; // 1단계
                    case 2 : if(elapsedTime >= 30) isSetTemp = true; break;// 2단계
                    case 3 : if(elapsedTime >= 20) isSetTemp = true; break;// 3단계
                    default:if (elapsedTime >= 61) isSetTemp = true;
                }
                if (isSetTemp) {
                    if (lgAirCon.isHeater()) lgAirCon.setCurrTemp(1);
                    if (lgAirCon.isCooler()) lgAirCon.setCurrTemp(-1);
                    lgAirCon.airConInfo();
                    isSetTemp = false; // 온도 변경 이후 초기화
                    elapsedTime = 0; // 온도 변경 이후 초기화
                }
                if (lgAirCon.getCurrTemp() == lgAirCon.getSetTemp()) {
                    System.out.println("에어컨을 종료합니다.");
                    break;
                }
            }
        }

    }
}
