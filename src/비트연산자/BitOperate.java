package 비트연산자;
// 비트 연산자는 비트 단위의 연산을 수행.
// AND(&) : 비교하는 두개의 비트가 모두 1이어야 1이 됨.
// OR(|) : 비교하는 두개의 비트가 한쪽만 1이면 1이 됨.
// XOR(^) : 비교하는 두개의 비트가 서로 다른 경우만 1이 됨.
// NOT(~) : 현재의 비트 값을 반전시킴
// 왼쪽 시프트(<<) : 비트를 왼쪽으로 이동
// 오른쪽 시프트(>>) : 비트를 오른쪽으로 이동

public class BitOperate {
    public static void main(String[] args) {
        int num1 = 10, num2 = 12;
        System.out.println(num1 & num2); // 8
        System.out.println(num1 | num2); // 14
        System.out.println(num1 ^ num2); // 6
        System.out.println(~num1); // -11
        System.out.println(~num2); // -13
        System.out.println(num1<<1); // 20
        System.out.println(num1>>1); // 5

        //


    }
}
