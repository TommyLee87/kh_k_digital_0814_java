package 형변환;
//형변환 : 하나의 데이터 타입을 다른 타입으로 변환 하는 것
//명시적 형변환 : 개발자가 의도를 가지고 형을 변환
//묵시적 형변환 : 컴파일러가 자동으로 변환(유리한 방향으로)

public class TypeCasting {
    public static void main(String[] args) {
//        int num1 = 1, num2 = 4;
//        double result1 = num1 / num2; //형 변환이 일어나지 않음.
//        double result2 = (double) num1 / num2; // num1은 명시적, num2는 묵시적 형 변환이 일어남.
//
//        System.out.println(result1);
//        System.out.println(result2);

//        int kor = 90;
//        int math = 88;
//        int eng = 56;
//        int total = kor+math+eng; //총점
//        double avg = total / 3; //평균
//
//        System.out.println(avg);
//        System.out.println(total);

        String kor = "90";
        int math = 88;
        int eng = 56;
        int total = Integer.parseInt(kor)+math+eng; //총점
        double avg = total / 3; //평균

        System.out.println(avg);
        System.out.println(total);


    }
}
