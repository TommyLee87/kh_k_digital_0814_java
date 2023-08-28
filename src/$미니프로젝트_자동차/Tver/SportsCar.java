package $미니프로젝트_자동차.Tver;

public class SportsCar extends Car {
    public SportsCar(String name) {
        this.name = name;
        maxSpeed = 250;
        fuelEff = 8;
        fuelTank = 30;
        seatCnt = 2;

    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) maxSpeed *= 1.2;
    }
}


