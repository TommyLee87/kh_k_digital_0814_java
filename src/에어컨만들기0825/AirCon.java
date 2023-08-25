package 에어컨만들기0825;
// 전원 : ON / OFF
// 온도 설정 기능
// 현재 온도 표시 기능
// Cooler ON / OFF
// Heater ON / OFF
// 바람 세기 : 1단 / 2단 / 3단

import java.awt.*;
import java.util.Calendar;
import java.util.Scanner;

public class AirCon {
    private boolean isPower;   // ON / OFF는  boolean 기능을 활용하자!
    private int setTemp; // 온도 설정
    private int currTemp; // 현재 온도
    private boolean isCooler; // 냉방
    private boolean isHeater; // 난방
    private int windStep; // 바람 세기
    AirCon() {
        // 에어컨의 현재 온도를 보여주기 위한 값
        final int[] MONTHTEMP = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 2};
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH); // 배열의 인덱스와 동일
        currTemp = MONTHTEMP[month];
        isPower = false;
        setTemp = 18;
        isCooler = false;
        isHeater = false;
        windStep = 1;
    }
    void airConInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("=".repeat(10) + " 에어컨 정보 " + "=".repeat(10));
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("난방 : " + heaterStr);
        System.out.println("냉방 : " + coolerStr);
        System.out.println("바람 세기 : " + windStr[windStep]);
    }
    public void setAirConState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도는 " + currTemp + "도 입니다.");
        System.out.println("온도를 설정하세요 : ");
        setTemp = sc.nextInt();
        System.out.println("설정 온도는 " + setTemp + "도 입니다.");
        System.out.println("바람 세기를 설정하세요 (1단계 / 2단계 / 3단계) : ");
        windStep = sc.nextInt();
        if(currTemp > setTemp) { // 설정 온도가 현재 온도보다 낮은 상태 : 냉방 가동
            System.out.println("냉방을 시작합니다.");
            isCooler = true;
            isHeater = false;
        } else if(currTemp < setTemp) { // 설정 온도가 현재 온도 보다 높은 상태 : 난방 가동
            System.out.println("난방을 시작합니다.");
            isCooler = false;
            isHeater = true;
        } else {
            System.out.println("현재 온도를 유지합니다.");
            isCooler = false;
            isHeater = false;
        }

    }
    public void setPower(boolean power) {
        isPower = power;
    }

    public int getWindStep() {
        return windStep;
    }
    public boolean isHeater() {
        return isHeater;
    }
    public boolean isCooler() {
        return isCooler;
    }
    public void setCurrTemp(int n) { // 매개 변수의 정수 값을 받아 현재 온도를 변경해줌
        currTemp += n;
    }
    public int getCurrTemp() { // 현재 온도를 읽는 메소드
        return currTemp;
    }
    public int getSetTemp() { // 설정 온도를 읽는 메소드
        return setTemp;
    }
}
