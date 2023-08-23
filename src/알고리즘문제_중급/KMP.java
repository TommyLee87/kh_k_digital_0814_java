package 알고리즘문제_중급;
// 첫 글자만 따오기
// Knuth-Morris-Pratt 를 입력 받으면 첫 글자만 따서 KMP로 출력
// Mirko-Slavko 를 입력 받으면 MS로 출력

// split("-")을 이용하여 문자열을 자르고 자른 문자열의 0번째 인덱스를 선택하는 방법
// 첫번째 선택, "-"다음의 첫 번째 문자를 선택하는 방법
// 대문자만 골라냄 (charAt(인덱스), toCharArray())

import java.util.Scanner;

public class KMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("긴 형태 입력 : ");
        String name = sc.next();

        // 1. Split 사용
//        String[] splitName = name.split("-");
//        for(String e : splitName) {
//            System.out.print(e.charAt(0));
//        }

        // 2. charAt(index) 사용 (대문자 골라내기)
//        for(int i = 0; i < name.length(); i++) {
//            if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
//                System.out.print(name.charAt(i));
//            }

        // 3. 첫 번째 문자 선택, "-" 다음의 문자 선택
//        for(int i = 0; i < name.length(); i++) {
//            if (i == 0) System.out.print(name.charAt(i));
//            else {
//                if (name.charAt(i) == '-') System.out.print(name.charAt(i+1));
//            }
//        }

        // 4. toCharArray() : 문자열을 문자 배열로 변경
//        char[] chName = name.toCharArray(); // 문자열을 문자 배열로 변경
//        for(char ch : chName) {
//            if (ch >= 'A' && ch <= 'Z') System.out.print(ch);
//        }


    }
}
