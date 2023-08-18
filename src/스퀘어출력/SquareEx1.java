package 스퀘어출력;

import java.util.Scanner;

// input : 3
// output
// 1 2 3
// 4 5 6
// 7 8 9
public class SquareEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num * num; i++) {
            System.out.printf("%4d", i);
            if (i % num == 0) System.out.println();

        }
    }
}
