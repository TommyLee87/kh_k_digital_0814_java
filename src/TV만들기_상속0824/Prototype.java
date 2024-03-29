package TV만들기_상속0824;

public class Prototype {
    boolean isPower; // 전원값 저장
    int channel; // 채널 정보 저장
    int volume; // 볼륨값 저장
    public Prototype() { // 생성자
        this.isPower = false;
        this.channel = 10;
        this.volume = 20;
    }
    // 생성자 오버로딩
    public Prototype(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel(int ch) {
        if (ch > 0 && ch < 1000) {
            channel = ch;
        } else System.out.println("채널 설정 범위가 아닙니다.");
    }
}

