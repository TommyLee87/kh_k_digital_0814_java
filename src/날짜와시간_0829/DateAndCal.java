package 날짜와시간_0829;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// Date() : 운영체제로부터 날짜와 시간 정보를 가져와 원하는 포맷으로 출력, 객체를 생성해야 함.
// 자바의 java.util 패키지에 포함되어 있어 import 해야 함.
public class DateAndCal {
    public static void main(String[] args) {
        Date now = new Date();
        // yyyy : 연도를 4자리로 표시
        // yy : 연도를 2자리로 표시
        // MM : 월을 표시(대문자, 월이 2자리로 표시)
        // HH : 24시간제
        // hh : 12시간제
        // mm : 분
        // ss : 초
        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7, f8;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년 MM월 dd일");
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날입니다");
        f6 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
        f7 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        f8 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");

//        System.out.println(f1.format(now));
//        System.out.println(f2.format(now));
//        System.out.println(f3.format(now));
//        System.out.println(f4.format(now));
//        System.out.println(f5.format(now));
//        System.out.println(f6.format(now));
//        System.out.println(f7.format(now));
        System.out.println(f8.format(now));

//        Calendar cal = Calendar.getInstance(); // 운영 체제로부터 시간을 가지고 옴
//        System.out.println(cal.get(Calendar.YEAR));
//        System.out.println(cal.get(Calendar.MONTH) + 1);  // 인덱스 배열임을 유의.
//        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//        System.out.println(cal.get(Calendar.AM_PM));
//        System.out.println(cal.get(Calendar.HOUR));
//        System.out.println(cal.get(Calendar.MINUTE));
//        System.out.println(cal.get(Calendar.SECOND));

        //문제 : Calendar 클래스로 yyyy년 MM월 dd일 HH시 mm분 ss초 포맷과 동일하게 출력 하기

        Calendar date = Calendar.getInstance();
        int year = date.get(Calendar.YEAR);
        int mon = date.get(Calendar.MONTH)+1;
        int day = date.get(Calendar.DAY_OF_MONTH);
        int hour = date.get(Calendar.HOUR);
        int isPm = date.get(Calendar.AM_PM);
        int min = date.get(Calendar.MINUTE);
        int sec = date.get(Calendar.SECOND);
        if (isPm == 1) hour += 12;
        System.out.printf("%d년 %02d월 %02d일 %02d시 %02d분 %02d초\n", year, mon, day, hour, min, sec);


    }
}
