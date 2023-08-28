package $미니프로젝트_자동차0828;
//  속도 : speed;
//  연비 : fuelEfficiency;
//  연료탱크 크기 : fuelTankSize;
//  좌석수 : seat;
//  차량이름 : name;

public class Bus extends Car {
    Bus(int speed, int fuelEfficiency, int seat, String name, int fuelCost, int fuelTankSize) {
        this.speed = speed;
        this.fuelEfficiency = fuelEfficiency;
        this.ableSeat = seat;
        this.name = name;
        this.fuelCost = fuelCost;
        this.fuelTankSize = fuelTankSize;
    }
}

