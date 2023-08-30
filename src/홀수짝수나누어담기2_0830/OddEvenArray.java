package 홀수짝수나누어담기2_0830;

// 7개의 정수를 입력 받는 메소드
// 홀수, 짝수 배열로 나누어 담는 메소드
// 나뉸 홀수, 짝수를 출력하는 메소드
// 입력 : 1 2 3 4 5 6 7
// 홀수 : 1 3 5 7
// 짝수 : 2 4 6
import 홀수짝수나누어담기_0830.OddEvenFunc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
//        홀수짝수나누어담기_0830.OddEvenFunc oddEvenFunc = new OddEvenFunc();
//        oddEvenFunc.inputFunc();
//        oddEvenFunc.oddEvenCalc();
//        oddEvenFunc.oddEvenOutput();

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("정수 입력 : ");
        for (int i = 0; i < 7; i++) list.add(sc.nextInt());
        System.out.print("홀수 : ");
        list.stream()
                .filter(n->n % 2 != 0)
                .forEach(e->System.out.print(e+ " "));
        System.out.println();
        System.out.print("짝수 : ");
        list.stream()
                .filter(n->n % 2 == 0)
                .forEach(e->System.out.print(e+ " "));
        }
    }


