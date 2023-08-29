package Object클래스;
// toString() : 해당 인스턴스에 대한 정보를 문자열로 반환
// 클래스이름@해시코드 (객체의 메모리 주소를 이용해 해시 코드 생성)
// toString() 메소드는 오버라이딩에서 사용 가능하며 String, Integer의 경우에는 이미 오버라이딩 되어 있음.
public class ObjectClass {
    public static void main(String[] args) {
        Car car01 = new Car();
//        Car car02 = new Car();
//        System.out.println(car01.toString()); // => Object클래스.Car@6a5fc7f7 해시코드
//        System.out.println(car02.toString()); // => Object클래스.Car@3b6eb2ec
//        String test1 = "곰돌이사육사";
//        Integer test2 = 2300;
//        int test3 = 4500;
//        System.out.println(test1);
//        System.out.println(test2);
//        System.out.println(test3);

        Car car02 = car01;

        // equals() 메소드 : 인스턴스를 매개 변수로 전달 받는 참조 변수와 비교하여 그 결과를 반환
        System.out.println(car01.equals(car02));
    }
}
class Car {

}