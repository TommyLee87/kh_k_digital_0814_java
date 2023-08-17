package 스위치문;

import java.util.Scanner;

// 조건에 조건식이 올 수 없고, 조건 값이 와야 함.
// 조건 값에는 정수, 문자, 문자열이 올 수 있음.
// 장점 : if ~ else에 비해 가독성이 좋음, 약간 더 빠름.
// 단점 : 조건식이나 범위가 올 수 없음.
public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력하세요 : ");
        String season = sc.next();
        switch (season) {
            case "spring" :
                System.out.println("꽃이 피는 봄이 왔어요.");
                break;
            case "summer" :
                System.out.println("아주 무더운 여름입니다.");
                break;
            case "fall" :
            case "autumn" :  // << 이렇게 두 개를 쓰면 OR의 개념
                System.out.println("단풍이 물드는 가을입니다.");
                break;
            case "winter" :
                System.out.println("손발이 꽁꽁 겨울이에요.");
                break;
            default:
                System.out.println("계절을 잘 못 입력 했습니다.");

        }
    }
}
