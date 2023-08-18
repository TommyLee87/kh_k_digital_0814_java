package 알고리즘문제_초급;
//별찍기 연습
import java.util.Scanner;

// 삼각형 별찍기
// 입력 받은 수만큼 별찍기
// 5를 입력 하면
// *
// * *
// * * *
// * * * *
// * * * * *
public class StarEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("별의 개수를 입력 하세요 : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
