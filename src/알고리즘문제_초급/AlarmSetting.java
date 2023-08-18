package 알고리즘문제_초급;
//알람 45분 일찍 설정하기

// 순서
// 시간과 분을 입력 받기 위해 스캐너 생성
// 시간, 분을 입력 받음
// 시간과 분을 총 몇 분인지 환산함
// 환산된 시간이 45분보다 작으면 하루 전날이므로 하루의 시간 만큼 더해줌
// 결과를 시간과 분으로 다시 환산해서 출력 해줌

import java.util.Scanner;

public class AlarmSetting {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("시 입력 : ");
        int hour = sc.nextInt();

        System.out.print("분 입력 : ");
        int min = sc.nextInt();

        int totalMin = hour * 60 + min;
        int alarm = totalMin - 45;

        if (totalMin < 45) {
            totalMin = 24 * 60 + min;
        }

        System.out.print("기상 시간 : " + alarm / 60 + "시 " + alarm % 60 + "분");

        }
    }

