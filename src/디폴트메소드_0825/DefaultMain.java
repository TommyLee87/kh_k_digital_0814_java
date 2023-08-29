package 디폴트메소드_0825;

import java.util.Scanner;

public class DefaultMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품 선택 [1]Audio [2]TV : ");
        int sel = sc.nextInt();
        RemoteControl rc;
        if (sel == 1) {
            rc = new Audio();
            rc.turnON();
            rc.setVolume(20);
            rc.setMute(false);
            RemoteControl.changeBattery();
        } else {
            rc = new Television();
            rc.turnON();
            rc.setVolume(30);
            rc.setMute(false);
        }

        //익명객체 추가 0829
        RemoteControl ps5 = new RemoteControl() {
            @Override
            public void turnON() {
                System.out.println("플스5 ON");
            }

            @Override
            public void turnOFF() {
                System.out.println("플스5 OFF");

            }

            @Override
            public void setVolume(int vol) {

            }
        };
        ps5.turnON();
        ps5.turnOFF();


    }
}
