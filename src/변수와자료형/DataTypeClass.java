package 변수와자료형;
// 변수란 ? 값을 저장할 수 있는 메모리 공간에 이름을 붙이는 것
public class DataTypeClass {
    public static void main(String[] args) {
        int age; // 정수형 변수 선언, 4바이트 공간을 확보함. 초기 값은 아직 없음. 정수 값을 저장 하는 목적
        double value; // 실수 값을 저장 하기 위한 변수 선언

        char gender = 'M'; // 선언과 동시에 초기화

        // 논리형 변수 선언 : 참과 거짓을 판별하기 위해 사용하는 자료형
        boolean isTrue; // = true, false 예약어만 사용할 수 있음

        // 정수형 변수 선언 : 소수점 이하가 없고 양수와 음수가 존재
        byte bNum; //  1Byte 크기의 변수 선언 1Byte=8bit(-128 ~ +127)
        short sNum; // 2Byte 크기의 변수 선언
        int iNum; //   4Byte 크기의 변수 선언
        long lNum; //  8Byte 크기의 변수 선언

        // 실수형 변수 선언
        float fNum; // 실수의 범위가 4Byte
        double dNum; // 실수의 범위가 8Byte

        int num1, num2; // 같은 타입의 변수를 동시에 선언할 수 있음(콤마로 구분)
        double num3 = 3.14; // 선언과 동시에 초기화
        double num4 = 1.23, num5 = 4.56;

        int hour = 4;
        int minute = 50;
        System.out.println(hour + "시간" + minute + "분");

    }
}
        /*class nameCard {
            string name;
            string address;
            string eMail;
            string phoneNumber;
 }*/