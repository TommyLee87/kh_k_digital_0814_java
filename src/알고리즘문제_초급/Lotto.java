package 알고리즘문제_초급;
// 중복 없는 로또 번호
// 1 ~ 45 사이의 임의의 수 6개를 생성해야 함.(Math.random() => 0.1~0.999)
// int val = (int) ((MAth.random()*45) + 1);
// 단, 중복 제거
// 생성 된 val 값을 배열에 담을 때 중복값이 있는지 확인 필요.
// 반복 횟수는 정할 수 없음 (while(true)) ==> 탈출 조건이 있어야 함(중복되지 않는 번호 6개각 저장되면 탈출 break)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Lotto {
    public static void main(String[] args) {
        // 배열로 풀기, while
//        int[] lotto = new int[6];
//        int tmp, index = 0;  //임시 로또번호
//        boolean isExist = false;

//        while(true) {
//            tmp = (int) ((Math.random()*45) + 1);
//            for (int i = 0; i<lotto.length; i++) {
//                if(lotto[i] == tmp) isExist = true;
//            }
//            if(!isExist) lotto[index++] = tmp;
//            if (index == 6) break;
//            isExist = false;
//        }
//        for (int e : lotto) System.out.print(e + " ");

//        // ArrayList 사용
//        List<Integer> list = new ArrayList<>();
//        while (true) {
//           int tmp = (int)((Math.random() * 45) + 1);
//            if(!list.contains(tmp)) {
//                list.add(tmp);
//            }
//            if(list.size() == 6) break;
//        }
//        System.out.println(list);

        // Set : 자바에서 사용하는 집합개념
        HashSet<Integer> set = new HashSet<>();
        while (true) {
           int tmp = (int)((Math.random() * 45) + 1);
           set.add(tmp);
           if (set.size() == 6) break;
        }
        System.out.println(set);

    }
}
