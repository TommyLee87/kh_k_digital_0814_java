package 접근제한자;

public class Parent {
    public String name;
    String money;  // default는 같은 패키지 내에서 접근 허용.
    protected String addr; // 같은 패키지 내 or 상속 관계이면 접근 허용
    public Parent() {
        name = "Parent";
        money = "100억";
        addr = "서울시 강남구 역삼동";
    }

}
