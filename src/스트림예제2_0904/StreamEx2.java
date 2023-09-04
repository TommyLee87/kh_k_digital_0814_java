package 스트림예제2_0904;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

// 반복자 스트림 forEach() : 내부 반복자. 스트림 요소에 대한 순차 접근을 제공하며 최종 연산에 해당
public class StreamEx2 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("고유림", 67),
                new Student("나희도", 55),
                new Student("우영우", 99),
                new Student("최수연", 96),
                new Student("권민우", 92)
        );
        double average = list.stream()// 스트림 생성
                .mapToInt(Student::getScore) // 메소드 참조, 중간 연산
                .average() // 중간 연산
                .orElse(0.0); // 만약 스트림이 비어 있으면 0.0으로 반환

        System.out.println("평균 점수 : " + average);

        IntStream stream = IntStream.rangeClosed(1, 100); // 1 ~ 100까지로 구성된 정수 스트림 생성
        System.out.println("합계 : " + stream.sum());

    }
}

//        list.forEach(s->{
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score);
//        });
//        list.parallelStream(). forEach(s->{ // 내부 반복자를 이용한 병렬 처리
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score);
//        });
//    }
//}
class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
}