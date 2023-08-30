package Vector클래스_0830;
// ArrayList 구조와 메소드가 동일
// 돟기화가 지원되어서 멀티스레드 환경에서 안전
// 하지만 ArrayList 대비 성능이 떨어짐

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();  // Vextor 대신 ArrayList, LinkedList를 써도 무방
        list.add(new NameCard("우영우", "WYW@gmail.com", "010-1234-5678", "변호사"));
        list.add(new NameCard("동그라미", "ROUND@gmail.com", "010-4567-9018", "무직"));
        list.add(new NameCard("이준호", "JHL@gmail.com", "010-1346-1792", "회사원"));

        for (NameCard e : list) {
            System.out.println("이름 : " + e.name);
            System.out.println("메일 : " + e.mail);
            System.out.println("연락처 : " + e.phone);
            System.out.println("직업 : " + e.jobs);
        }
    }
}

class NameCard {
    String name;
    String mail;
    String phone;
    String jobs;

    public NameCard(String name, String mail, String phone, String jobs) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;
    }
}