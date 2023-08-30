package Vector클래스_0830;
// ArrayList 구조와 메소드가 동일
// 돟기화가 지원되어서 멀티스레드 환경에서 안전
// 하지만 ArrayList 대비 성능이 떨어짐

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("우영우", "WYW@gmail.com","010-1234-5678","변호사"));

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