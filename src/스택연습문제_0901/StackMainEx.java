package 스택연습문제_0901;

import java.util.Scanner;
import java.util.Stack;

// Stack을 이용해 괄호 열림/닫힘 확인
public class StackMainEx {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("수식 입력 : ");
        String exp = sc.next();
        // 입력 받은 문자열 길이 만큼 반복 순회
        for(int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (!st.empty()) st.pop();  // 닫힘 갈호일 때 pop
                else {
                    System.out.println("괄호가 일치하지 않습니다.");
                    return;

                }
            }
        }
        if (st.isEmpty()) {
            System.out.println("괄호가 일치합니다.");
        } else {
            System.out.println("괄호가 일치 하지 않습니다.");
        }

    }
}
