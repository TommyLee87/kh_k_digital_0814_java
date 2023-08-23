package 객체타입확인0823;
// instanceOf : 상속 관계가 성립하는지 확인하는 용도
// 왼쪽 피연산자가 오른쪽 피연산자의 인스턴스인지 검사
// 결과는 불리언 값(true 또는 false)으로 반환
public class InstanceOf {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");
        System.out.println(parent instanceof Parent); // true 대문자 Parent 클래스 안의 참조 변수 parent
        System.out.println(child instanceof Parent); // true 부모로부터 상속 받음.
        System.out.println(parent instanceof Child); // false 부모 클래스의 참조 변수는 자식 클래스로부터? X
        System.out.println(child instanceof Child); // true 대문자 Child 클래스 안의 참조 변수 child
    }
}
class Parent {
    String name;
    Parent(String name) {
        this.name = name;
    }
}
class Child extends Parent {
    Child(String name) {
        super("부모");
        this.name = name;
    }
}