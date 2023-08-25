package 알고리즘문제_중급;
// 저항_0825
// 처음 색 2개는 저항의 값이고, 마지막 색은 곱해야 하는 값이다.
// 첫 번째 색은 10의 자리, 두 번째 색은 1의 자리, 세 번째 색은 곱하는 값
import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
//        String[] color = {"black", "brown", "red", "orange",
//                "yellow", "green", "blue", "violet", "grey", "white"};
//        int[] mul = {1, 10, 100, 1000, 10000, 100000, 1000000,
//                10000000, 100000000, 1000000000};
//        int fVal = 0, sVal = 0, tVal = 0;
//        Scanner sc = new Scanner(System.in);
//        String fColor = sc.nextLine();
//        String sColor = sc.nextLine();
//        String tColor = sc.nextLine();
//        for (int i = 0; i < 10; i++) {
//            if (fColor.equals(color[i])) fVal = i; // 첫 번째 입력 받은 컬러 문자열의 인덱스 값 (10의 자리)
//            if (sColor.equals(color[i])) sVal = i; // 두 번째 입력 받은 컬러 문자열의 인덱스 값 (1의 자리)
//            if (tColor.equals(color[i])) tVal = mul[i]; // 세 번째 입력 받은 컬러 문자열의 인덱스 값 (곱하는 수)
//        }
//        System.out.println((long) ((fVal * 10) + sVal) * tVal);
//    }
//}

        String [] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int frt = 0, sec = 0, thd = 0;
        Scanner sc = new Scanner(System.in);
        String frtColor = sc.nextLine();
        String secColor = sc.nextLine();
        String thdColor = sc.nextLine();
        for(int i = 0; i < color.length; i++) {
            if (frtColor.equals(color[i])) frt = i;  // 첫 번째 입력 받은 컬러 문자열의 인덱스 값 (10의 자리)
            if (secColor.equals(color[i])) sec = i;  // 두 번째 입력 받은 컬러 문자열의 인덱스 값 (1의 자리)
            if (thdColor.equals(color[i])) thd = i;  // 세 번째 입력 받은 컬러 문자열의 인덱스 값 (곱하는 수)
        }
        System.out.println((long)((frt*10) + sec) * (long)(Math.pow(10,thd)));

    }

 }