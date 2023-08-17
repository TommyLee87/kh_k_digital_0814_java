package 변수의스코프;
// 변수가 할당되고 사용되는 범위 확인
public class VarScopeClass {
    public static void main(String[] args) {
        //문자 자료형 : 자바에서는 유니코드 문자 표현.
        char ch = 'A'; // 자바에서 문자는 작은 따옴표를 사용하고 실제 저장은 유니코드로 정수값.

   //     System.out.println(ch); //문자 출력.
  //      System.out.println((int)ch); //문자의 정수값 출력.

        char ch2 = 'B';
 //      System.out.println(ch2);
 //      System.out.println((int)ch2);

        //실수 자료형 : float(4 Byte=32 bit), double(8 Byte=64 bit) 근사치 계산법, Byte 대문자(ex.저장용량) bit 소문자(ex.속도)
 //     float Num = 175.51f;
 //     double Num = 175.51;
        double num1 = 0.1;
        for(int i = 0; i < 1000; i++) {
            num1 += 0.1;
        }
        System.out.println(num1);

    }
}
