package 문자열다루기;
// 자바의 문자열을 나타내는 자료형은 String이며, 참조 타입 자료형 입니다.
// equals : 두 개의 문자열이 동일한지 비교하여 결과값을 리턴함.(true / false), == 는 문자열 주소가 같은지 물어봄
// indexOf : 문자열에서 특정 문자가 시작되는 인덱스를 반환

public class StringMethod {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "hello";
        String d = "Hello";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        System.out.println(a.equalsIgnoreCase(d)); // 대소문자 구분 없이 문자열을 비교함.

        System.out.println(a.indexOf("lo")); // 문자가 시작되는 인덱스 반환
        System.out.println(a.indexOf("lt")); // 없는 문자열을 넣으면 -로 반환.

    }
}
