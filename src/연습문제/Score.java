package 연습문제;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("성적를 입력 하세요 : ");
            int score = sc.nextInt();

            if(score < 0 || score > 100) continue;

            if (score >= 90)
                System.out.println("당신의 학점은 A 입니다.");
            else if (score >= 80)
                System.out.println("당신의 학점은 B 입니다.");
            else if (score >= 70)
                System.out.println("당신의 학점은 C 입니다.");
            else if (score >= 60)
                System.out.println("당신의 학점은 D 입니다.");
            else
                System.out.println("당신의 학점은 F 입니다.");
            break;
            }
            }
        }




