package 박싱과언박싱_0829;

public class BoxingMain {
    public static void main(String[] args) {
        Integer num = 12; // 오토 박싱 - 지금은 이렇게
        //Integer num = new Integer(12);   //원래 문법
        System.out.println(num);

        Character ch = 'x'; // 오토 박싱
        char c = ch; // 오토 언박싱
        System.out.println(c);
    }
}
