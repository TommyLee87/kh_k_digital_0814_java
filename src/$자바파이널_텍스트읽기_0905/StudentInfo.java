package $자바파이널_텍스트읽기_0905;

import java.io.Serializable;

public class StudentInfo implements Comparable<StudentInfo>, Serializable {
    private String name;
    private int total;

    public StudentInfo(String name, int total) {
        this.name = name;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public int compareTo(StudentInfo o) {
        if (this.getTotal() == o.getTotal()) return this.name.compareTo(o.name); // 이름 순 정렬
        return o.getTotal() - this.getTotal(); // 내림차순 정렬
    }
}
