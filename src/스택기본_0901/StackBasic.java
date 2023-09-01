package 스택기본_0901;
// Stack은 제일 나중에 들어온 값이 제일 먼저 빠져나가는 구조

import java.util.Stack;

public class StackBasic {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());      // 제일 위의 값 확인 = 3
        System.out.println(stack.pop());       // 제일 나중에 들어온 값을 꺼냄 =>3
        System.out.println(stack.empty());     // 현재 스택이 비어 있는지 확인
        System.out.println(stack.size());      // 스택 내에 몇 개의 데이터가 있는지 확인
        System.out.println(stack.contains(1)); // 매개 변수의 값이 스택 내에 존재하는지 확인

    }

}
