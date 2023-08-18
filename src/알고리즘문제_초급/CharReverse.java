package 알고리즘문제_초급;
// 문자열 반전
// 문자열을 입력 받음 : abcd -> dcba로 출력
// 문자열의 인덱스는 0부터 시작함

import java.util.Scanner;

public class CharReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하세요 : ");
        String text = sc.next();

//      1. for문
        for(int i = text.length()-1; i > -1; i--) {
            System.out.print(text.charAt(i));

//      2. while문
//      int pos = text.length() -1;  //문자열의 시작위치(반전의 위치)
//      while (pos > -1) {
//          System.out.print(text.charAt(pos));
//          pos--;

        }
    }
}
