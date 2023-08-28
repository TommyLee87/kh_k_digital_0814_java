package 미니프로젝트_자동차.Tver;

public class Bus extends Car {
    public Bus(String name) {
        this.name = name;
        maxSpeed = 150;
        fuelEff = 5;
        fuelTank = 100;
        seatCnt = 4;

    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) fuelTank += 30;
    }
}