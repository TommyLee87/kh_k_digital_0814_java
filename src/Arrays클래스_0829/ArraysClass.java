package Arrays클래스_0829;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// Arrays 클래스는 배열을 다루기 위한 다양한 메소드 함수가 포함되어 있음.
public class ArraysClass {
    public static void main(String[] args) {

//        1.오름차순 정렬
//        int[] arr = {5, 3, 4, 7, 8, 9, 2, 1};
//        Arrays.sort(arr);

//        2. 내림차순 정렬(Reverse)
//        Integer[] arr = {5, 3, 4, 7, 8, 9, 2, 1};
//        Arrays.sort(arr, Collections.reverseOrder());
//
//        for(int e : arr) System.out.printf(e + " ");

//        3.정렬 오버라이딩 : 재정의
        Integer[] arr = {5, 3, 4, 7, 8, 9, 2, 1};
            Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                if (i1 > i2) return 1; // 오름 차순
                // if(i1 < i2) return 1; // 내림 차순
                else {
                    return 0;
                }
            }
        });
    }
}