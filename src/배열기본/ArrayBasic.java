package 배열기본;

import javax.swing.*;

// 자바의 배열은 동일한 데이터 요소들을 연속적으로 저장하는 자료 구조
// 인덱스를 사용해서 각 요소를 접근할 수 있음.(인덱스는 0부터 시작)
// 배열은 크기를 먼저 지정해야함

public class ArrayBasic {
    public static void main(String[] args) {
        // 배열의 크기를 할당하고 이후에 초기화 하는 방법
        int[] grade1 = new int[3]; // 크기 지정.
        grade1[0] = 85;
        grade1[1] = 99;
        grade1[2] = 77;

//        for(int i = 0; i < grade1.length; i++) {
//            System.out.println(grade1[i] + " ");
//        }

//        //향상된 for문 : 주어진 배열 등의 크기를 자동 순회함.
//        for (int e : grade1) {
//            System.out.println(e + " ");
//        }

//        int[] odd = {1,3,5,7,9}; // 이미 정해진 값을 배열에 대입하는 경우는 크기와 new를 사용하지 않아도 됨.
//        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

        int[] grade2 = {88, 99, 56}; // 이미 값을 알고 있는 경우
        int[] grade3 = new int[]{99, 88, 88};
        int[] grade4; // 객체 타입의 참조 변수이므로 실제 객체의 주소를 받아야 함.
        grade4 = new int[4];
        grade4[0] = 100;
        grade4[1] = 88;
        grade4[2] = 77;
        grade4[3] = 55;
        int sum = 0; // 총점을 구하기 위한 변수

//        for(int i = 0; i < grade1.length; i++) {
//            grade4[i] += 10;
//            sum += grade4[i];
//        }


        for (int val : grade4) {
            val += 10;
            sum += val; // 총점 구하기
        }
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n", (double) sum / grade4.length);

        sum = 0;
        for (int i = 0; i < grade4.length; i++) { //length 배열의 길이 확인
            sum += grade4[i];
        }

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n", (double) sum / grade4.length);



    }
}

