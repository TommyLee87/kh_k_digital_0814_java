package $미니프로젝트_자동차.Tver;

// 상속을 주기 위한 Car class 생성
public abstract class Car {
    //  protected 접근 제한자는 같은 패키지, 상속 관계에서 접근 가능
    protected int maxSpeed; // 최고 속도
    protected int fuelEff; // 연비(리터당 주행 거리)
    protected int fuelTank; // 연료 탱크 크기
    protected int seatCnt; // 좌석 수
    protected String name; // 자동차 이름

    abstract void setMode(boolean isMode); // 상속 받은 자동차 각각의 특수 기능

    public String getName() {
        return this.name;
    }


    // 총 이동 횟수
    int setMovingCnt(int passCnt) { //입력 값으로 승객 수 가 필요
        if (passCnt % seatCnt != 0) return (passCnt / seatCnt) + 1;
        return passCnt / seatCnt;
    }
    int getRefuelCnt(int dist, int moveCnt) { // 이동 거리와 이동 횟수를 매개 변수로 입력 받음
        if(((dist *moveCnt) / fuelEff) % fuelEff != 0) return (((dist * moveCnt) / fuelEff) / fuelTank) + 1;
        return ((dist * moveCnt)/fuelEff) / fuelTank;
    }
    // 총 이동 비용
    int getToTalCost(int dist, int moveCnt) {
        return dist / fuelEff * 2000 * moveCnt;
    }
    // 총 소요 시간
    String getMovingTime(int dist, int moveCnt) {
        double getTime = (double) dist * moveCnt / maxSpeed;
        int totalMinute = (int)(getTime * 60);
        int hour = totalMinute / 60;
        int minute = totalMinute % 60;
        return String.format("%d시간 %d분", hour, minute);
    }

    public int getMovingCnt(int passCnt) {
        return passCnt;
    }
}


