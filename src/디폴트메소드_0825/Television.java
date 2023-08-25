package 디폴트메소드_0825;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnON() {
        System.out.println("TV를 켭니다.");
    }
    @Override
    public void turnOFF() {
        System.out.println("TV를 끕니다.");
    }
    @Override
    public void setVolume(int vol) {
        if (vol > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (vol < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = vol;
        }
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }
    void getInfo() {
        System.out.println("TV 입니다.");
        System.out.println("현재 TV 볼륨은 " + volume + "입니다.");
    }

    @Override
    public void setMute(boolean mute) {
        if(mute) System.out.println("TV를 음소거 처리 합니다.");
        else System.out.println("TV 음소거 를 해제 합니다.");
    }
}