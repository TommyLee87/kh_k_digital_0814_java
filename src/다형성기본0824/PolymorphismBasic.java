package 다형성기본0824;

public class PolymorphismBasic {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        child.out();
        child.display();
        parent.display();

        Parent p = new Child(); // 부모 클래스의 참조 변수로 자식 객체에 접근함
        p.display(); // display() 오버라이딩이 일어나 자식 메소드가 호풀 됨.

    }
}
