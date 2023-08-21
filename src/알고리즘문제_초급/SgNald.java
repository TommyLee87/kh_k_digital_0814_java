package 알고리즘문제_초급;
// 상근날드
// 문제 요약 : 햄버거3개와 음료2개를 연속으로 입력받아, 햄버거 중 가장 작은 값, 음료 2개 중 작은 값을 찾음
// 찾은 값을 더하고 세트 메뉴 50원 할인 적용
import java.util.Scanner;

public class SgNald {
    public static void main(String[] args) {
        // 5개의 값을 입력받기 위해 배열 생성
        int[] price = new int[5];
        // 키보드 입력을 받기 위해 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        System.out.print("가격 입력 : ");
        for(int i = 0; i<price.length; i++) {
            price[i] = sc.nextInt();
        }

        int minBurger = price[0]; // 햄버거 3개 중 가장 작은 값
        int minDrink = price[3]; // 음료수 2개 중 가장 작은 값

        for(int i = 0; i < price.length; i++) {
            if (i < 3 && minBurger > price[i])
                minBurger = price[i];
            if (i > 2 && minDrink > price[i])
                minDrink = price[i];
        }

            System.out.println(minBurger + minDrink - 50);
        }

    }

