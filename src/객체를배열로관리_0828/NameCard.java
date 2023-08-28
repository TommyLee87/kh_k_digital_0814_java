package 객체를배열로관리_0828;

public class NameCard {
    private String name;
    private int age;
    private String phone;
    private String mail;

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printInfo() {
        System.out.println("이름" + name);
        System.out.println("나이" + age);
        System.out.println("연락처" + phone);
        System.out.println("메일" + mail);
    }
}
