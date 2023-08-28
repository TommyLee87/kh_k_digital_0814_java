package 미니프로젝트_자동차0828;
//  속도 : speed;
//  연비 : fuelEfficiency;
//  연료탱크 크기 : fuelTankSize;
//  좌석수 : seat;
//  차량이름 : name;

public class Bus extends Car {
    int speed;
    int fuelEfficiency;
    int fuelTankSize;
    int seat;
    boolean isSubTank;

    Bus(String name) {
        this.name = name;
        speed = 150;
        fuelEfficiency = 5;
        fuelTankSize = 100;
        seat = 20;
    }

    void setSubTank(boolean isSubTank) {
        if (isSubTank) fuelTankSize += 30;
    }

    @Override
    void costCal(int cost) {

    }
}



