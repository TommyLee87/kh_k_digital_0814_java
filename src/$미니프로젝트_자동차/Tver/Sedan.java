package $미니프로젝트_자동차.Tver;

public class Sedan extends Car {
    public Sedan(String name) {
        this.name = name;
        maxSpeed = 200;
        fuelEff = 12;
        fuelTank = 45;
        seatCnt = 4;

    }
    @Override
    void setMode(boolean isMode) {
        if(isMode) seatCnt += 1;
    }

}


