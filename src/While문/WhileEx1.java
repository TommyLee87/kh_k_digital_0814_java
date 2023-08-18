package While문;
// 주어진 조건이 참인동안 계속 해당 블록{} 을 반복 수행, 주로 반복 횟수를 알 수 없는 경우에 사용

import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int n = sc.nextInt();
        int sum = 0;  // 합계를 구한 변수를 초기화
        while (n > 0) {
            sum += n; // sum = sum + n;
            //10을 입력시 sum = 0 (sum초기값이 0) + 10
            n--; // 입력 받은 값을 1씩 감소 시킴
            // 10이 9가 된다.
            // 다음 차례에서 sum = 10 + 9 수행, 9가 8이 됨.
        }
        System.out.println("주어진 정수의 합 : " + sum);


//        // 초기식;조건식;증감식
//        for (int i = 1; i <=n; i++) { //i는 1부터 시작, i가 n이 될 때 까지
//            sum += i;
//        }
//        System.out.println("주어진 정수의 합 : " + sum);

    }
}
