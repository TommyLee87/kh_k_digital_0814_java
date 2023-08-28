package 미니프로젝트_자동차0828;

//- 속도
//- 연비
//- 연료탱크 크기
//- 좌석수
//- 차량이름
public abstract class Car {
    int speed;
    int fuelEfficiency;
    int fuelTankSize;
    int seat;
    String name;
    static int count = 0;
    int fuelTank;
    int fuelCost;

    int refueling(int cost) {
        count++;
        if (fuelTank < fuelTankSize && 0 >= fuelTank) {
            fuelTank += fuelTankSize;
            cost *= fuelCost;
        }
        return cost;
    }

    abstract void costCal(int cost);
}