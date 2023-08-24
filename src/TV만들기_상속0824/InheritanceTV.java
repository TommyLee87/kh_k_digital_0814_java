package TV만들기_상속0824;

public class InheritanceTV {
    public static void main(String[] args) {
        Prototype prototype = new Prototype(); // 상속을 주는 클래스가 인스턴스화 된다는 것은 추상화가 아니라는 의미
        ProductTV productTV = new ProductTV("우리집 TV");
        productTV.setPower(true);
        productTV.setVolume(30);
        productTV.setChannel(1500, false);
        productTV.viewTV();

    }
}
