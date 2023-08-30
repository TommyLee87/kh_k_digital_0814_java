package 알고리즘문제_중급;
// X보다 작은 수
// 정수 N개로 이루어진 배열 A, 정수 X
// A에서 X보다 작은 수를 모두 출력하는 프로그램
// 입력 : 첫째 줄에 N과 X(1 ≤ N, X ≤ 10,000), 둘째 줄에 수열 A를 이루는 정수 N
// 출력 : X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LowerX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt(); // 배열의 갯수
        int x = sc.nextInt(); // 크기를 비교하는 기존 값 (미만 값을 찾음)
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt()); // 리스트에 값을 추가 함
            if (list.get(i) < x) System.out.print(list.get(i) + " ");
        }
        System.out.println();


//        System.out.print("N과 X 입력 : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int x = sc.nextInt();
//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//            if (arr[i] < x) System.out.print(arr[i] + " ");
//        }
//        System.out.println();
    }
}
