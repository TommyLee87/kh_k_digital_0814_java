package 싱글톤0824;

public class Singleton {
    String name;
    int id;
    // 클래스 내에서 단 한번 객체를 생성함
    private static Singleton singleton = new Singleton();
    // 생성자를 외부에서 호출 할 수 없도록 private으로 접근을 제한함
    private Singleton() {
        name = "test";
        id = 100;
    }
    // 한번 만들어진 객체에 대한 주소를 반환함
    static Singleton getSingleton() {
        return singleton;
    }
}
