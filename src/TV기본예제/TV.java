package TV기본예제;

import java.io.PrintStream;

public class TV {
    private boolean isON; // TV 전원
    private int channel; // 채널
    private int volume; // 볼륨

    TV(){
        isON = false;
        channel = 11;
        volume = 10;
        System.out.println("전원 : " + isON + ", 채널 : " + channel + ", 볼륨 : " + volume);
    }
    TV(boolean isON, int ch, int vol) {
        this.isON = isON;
        channel = ch;
        volume = vol;
    }
    public void setON(boolean isON) {
        this.isON = isON;
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("TV 전원이 " + onOffStr + " 되었습니다.");
    }
    public void setChannel(int ch) {
        if(ch >= 1 && ch <= 990 ) {
            channel = ch;
            System.out.println("채널을 " + channel + "로 변경 하였습니다.");
        } else {
            System.out.println("채널 설정 값이 허용 범위를 벗어 났습니다.");
        }
    }
    public void setVolume(int vol) {
        if(vol >= 0&& vol <= 100) {
            volume = vol;
            System.out.println("현재 볼륨은 " + volume + "입니다.");
        }
    }
    public void getInfoTV() {
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("=".repeat(5) + "TV 정보" + "=".repeat(5));
        System.out.println("전원 : " + onOffStr);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
    }
}
