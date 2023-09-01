package 단어정렬하기_0831;
// 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
// n개의 수를 입력 받음
// 1. 길이가 짧은 것부터
// 2. 길이가 같으면 사전순
// 3. 중복 제거


import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class WordSortEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n의 개수 입력 받음.

        String[] word = new String[n];
        sc.nextLine(); // 버퍼 비우기
        for (int i = 0; i < word.length; i++) {
            word[i] = sc.nextLine();
        }
        // 입력 받은 문자열 배열의 중복 제거를 위해 set 컬렉션에 넣음
        // asList() : 배열을 컬렉션에 넣을 때 사용하는 메소드
        HashSet<String> set = new HashSet<>(Arrays.asList(word));
        // 다시 배열로 되돌림, 원래 생성된 크기로 되돌림
        word = set.toArray(new String[0]);

        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 길이가 같으면 사전순 정렬
                } else {
                    return o1.length() - o2.length(); // 만약 앞이 길면 양수(양수가 반환되면 정렬)
                }
            }
        });
        System.out.println(Arrays.toString(word));

    }
}
