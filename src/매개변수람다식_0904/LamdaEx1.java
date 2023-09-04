package 매개변수람다식_0904;

@FunctionalInterface // 함수형 프로그램을 만들기 위해 사용하는 인터페이스임을 알리기 위한 어노테이션, 내부에 함수가 1개만 존재
interface MyFuncInterface {
    void method(int x);
}
@FunctionalInterface  // 리턴값이 있는 람다식
interface MyFuncInterface2 {
    int min(int x, int y);
}

public class LamdaEx1 {
    public static void main(String[] args) {
//        MyFuncInterface fi = x -> { // 구현부가 1줄인 경우 중괄호 생략 가능
//            int result = x * 5;
//            System.out.println(result);
//        };
//        fi.method(10);
        MyFuncInterface2 fi2 = (x, y) -> Math.min(x, y); // 구현부가 한줄인 경우 {}생략 가능, return 생략
        System.out.println(fi2.min(3,4));

    }
}

