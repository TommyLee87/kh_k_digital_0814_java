package 시스템입력;
// Scanner 클래스를 사용하여 입력을 받음
import java.util.Scanner;
public class SystemInput {
    public static void main(String[] args) {
        // sc는 클래스에 대한 변수, 클래스는 설계 도면이라고 생각하자.
        Scanner sc = new Scanner(System.in); // 스캐너에 대한 객체 생성
        System.out.print("이름을 입력 하세요 : ");
        String name = sc.next(); // 이름을 입력 받은 후 공백이나 줄바꿈이 일어나면 다음으로 넘어감.
        sc.nextLine(); // 버퍼 비우기
        System.out.print("주소를 입력 하세요 : ");
        String addr = sc.nextLine(); // 줄바꿈이 일어나면 다음 입력으로 넘어감.
        System.out.print("성별을 입력 하세요 : ");
        char gender = sc.next().charAt(0); // 입력 받은 문자열에서 맨 앞의 문자(인덱스:0) 1개 추출
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();

        System.out.println("==== 회원 정보 출력 ====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);


//        byte a = sc.nextByte(); // 입력된 데이터를 byte 형으로 반환
//        short b = sc.nextShort(); // short 형으로 반환
//        int c = sc.nextInt(); // int 형으로 반환
//        long d = sc.nextLong(); // long 형으로 반환
//        char ch = sc.next().charAt(0); // 문자열에서 첫 번째(인덱스:0) 문자를 추출
//        float e = sc.nextFloat(); // float 형으로 반환
//        double f = sc.nextDouble(); // double 형으로 반환
//        String h = sc.next(); // 공백 기준으로 입력 받음
//        String i = sc.nextLine(); // 줄바꿈. 문자 기준


    }
}
