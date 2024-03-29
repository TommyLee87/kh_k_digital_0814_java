package 트리셋_0831;

import java.util.TreeSet;

// 검색 기능을 강화시킨 자료구조
// 데이터가 저장 될 때 이전 검색 트리 형태로 저장 되고, 값을 검색 할 때 inOrder(Left - Root - Right) 방식으로 검색 함.
public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23);
        ts.add(10);
        ts.add(48);
        ts.add(15);
        ts.add(7);
        ts.add(22);
        ts.add(56);
        for (Integer e : ts) System.out.print(e + " ");
    }
}
