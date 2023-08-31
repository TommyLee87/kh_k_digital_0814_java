package 컴페어레이터_0831;

import java.util.TreeSet;

public class ComparatorEx1 {
    public static void main(String[] args) {
        TreeSet<Fruit> set = new TreeSet<>(new DescendComparator().reversed());
        set.add(new Fruit("포도", 3000));
        set.add(new Fruit("수박", 10000));
        set.add(new Fruit("딸기", 6000));
        for(Fruit e : set) {
            System.out.println("과일 이름 : " + e.name + ", 가격 : " + e.price);
        }
    }
}
