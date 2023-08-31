package 해시셋클래스_0831;
// 중복 허용 X, 순서 보장X, 수학의 집합과 유사함

import java.util.Arrays;
import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Python");
        set.add("Java"); // add 안됨. 중복.
        for (String e : set) {
            System.out.println(e + " ");
        }
    }
}
