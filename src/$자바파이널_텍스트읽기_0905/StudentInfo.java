package $자바파이널_텍스트읽기_0905;

import java.io.Serializable;

public class StudentInfo implements Comparable<StudentInfo>, Serializable {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentInfo(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public int compareTo(StudentInfo o) {
        if((this.kor+this.eng+this.math) == (o.kor+o.eng+o.math)) return 0;
        else if((this.kor+this.eng+this.math) > (o.kor+o.eng+o.math)) return -1;
        else return 1;
    }
}