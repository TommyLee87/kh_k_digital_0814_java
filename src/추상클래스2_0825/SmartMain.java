package 추상클래스2_0825;

public class SmartMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone Pro 14");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();


        //익명객체 추가 0829
        Phone phone = new Phone("목업") {

            @Override
            void call() {
                System.out.println("목업폰이라 통화가 안되요ㅠㅠ");
            }
        };
        phone.call();

    }
}
