package 참조타입기초;
// Java의 데이터 타입은 기본 타입과 참조 타입으로 나뉘어 짐.
// 기본 타입 : 정수, 실수, 문자, 논리값 등을 저장하는 타입(실제 값이 변수에 저장됨)
// 참조 타입 : 객체의 주소를 변수에 저장함(배열, 열거형, 인퍼테이스, 클래스, 문자열)

public class RefType {
    public static void main(String[] args) {
        //기본타입
        int age = 25; // int 형으로 만들어진 age라는 변수에 25라는 값을 저장
        double price = 100.5; // double 형으로 만들어진 price라는 변수에 100.5라는 값을 저장

        //참조타입
        String name = "곰돌이사육사"; // Steing 형으로 만들어진 name에는 실제 "곰돌이사육사" 라는 문자열이 아니라 주소가 있음.

       // int unbox = null; // int형의 [기본타입] 이므로 값을 대입해야함.
//        Integer boxedvalue = null; // int형에 대한 [참조타입]
//        int intValue = boxedvalue;
//        System.out.println(boxedvalue);

        String strVal1 = "나희도"; // 리퍼럴 상수로 고정 됨.
        String strVal2 = "나희도";
        String strVal3 = new String("나희도"); // heap 영역에 메모리 공간을 확보 함.

        //참조 변수에서 ==, != (참조변수는 값이 아닌 주소가 들어있으므로 주소를 비교하게 된다)
        if(strVal1 == strVal3) {
            System.out.println("strVal1과 strVal3는 참조하는 주소가 같음");
        } else {
            System.out.println("strVal1과 strVal3는 참조하는 주소가 다름");
        }

        if(strVal1. equals(strVal3)) {  // 포함된 내용, 즉 문자열이 같은지 비교.
            System.out.println("strVal1과 strVal3의 내용이 같음");

        }

    }
}
