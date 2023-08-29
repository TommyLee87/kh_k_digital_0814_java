package 중첩인터페이스_0829;

// 중첩 인터페이스 : 클래스 내부에 선언한 인터페이스
// 주로 UI 프로그래밍에서 이벤트 처리를 목적으로 사용
public class DoubleInterface {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.setOnClickListener(new CallListener());
        btn.touch();
        btn.setOnClickListener(new MessageListener());
        btn.touch();

        //Car car = new Car();
    }
}
//class Car extends Object {}

