package 알고리즘문제_초급;
// 대소문자 바꾸기
// charAt(index) : 문자열에 해당 인덱스 문자를 추출
// toChatArray() : 문자열을 문자 배열로 변환
import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단어 입력 : ");
        String word = sc.next();

         for(int i = 0; i < word.length(); i++) {
             char ch = word.charAt(i);
             if (ch < 'a') System.out.print((char) (ch + ('a' - 'A')));
             else System.out.print((char) (ch - ('a' - 'A')));
         }

    }
}
