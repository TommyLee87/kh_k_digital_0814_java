package 알고리즘문제_기본;
// 1~1000사이의 7의 배수를 구하고 한 줄에 10개씩 출력

public class Multiple7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            if (i % 7 == 0) {
                System.out.printf("%5d", i);
                if (i % 70 == 0) System.out.println();

            }
        }
//        int cnt = 0;
//        for(int i = 7; i <= 1000; i += 7) {
//            cnt++;
//            System.out.printf("%5d", i);
//            if(cnt == 10) {
//                System.out.println();
//                cnt = 0;
//            }
//        }
    }
}