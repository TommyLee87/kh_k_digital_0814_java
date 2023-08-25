package 디폴트메소드_0825;

public interface RemoteControl {
    int MAX_VOLUME = 100; // final static 추가 됨(대문자)
    int MIN_VOLUME = 0;
    void turnON(); // 자동으로 public abstract 추가 됨
    void turnOFF();
    void setVolume(int vol);
// 디폴트 메소드는 JDK 8 이후에 추가 됨
    default void setMute(boolean mute) {
        if(mute) System.out.println("음소거 처리합니다.");
        else System.out.println("음소거 상태를 해제합니다.");

    }
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
}
