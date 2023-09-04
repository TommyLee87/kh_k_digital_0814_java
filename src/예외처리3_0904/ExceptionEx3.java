package 예외처리3_0904;

// NullPointException (NPE) : Java에서 발생하는 대표적인 런타입 에러. 참조 하려는 객체가 없는 경우 발생.
public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;

        if (test != null) {

            String testStr = test.name;
            System.out.println(testStr);

        } else {
            System.out.println("test 가 null 입니다.");
        }
    }
}

class Test {
    String name = "도리도리";
}