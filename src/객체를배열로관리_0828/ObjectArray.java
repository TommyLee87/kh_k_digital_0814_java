package 객체를배열로관리_0828;

import java.util.Scanner;

public class ObjectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 인원 : ");
        int cnt = sc.nextInt();
        NameCard[] nameCards = new NameCard[cnt];
        System.out.println("=".repeat(5) + " 정보 입력 " + "=".repeat(5));
        for (int i = 0; i < nameCards.length; i++) {
            nameCards[i] = new NameCard();
            System.out.print("이름 : ");
            nameCards[i].setName(sc.next());
            System.out.print("나이 : ");
            nameCards[i].setAge(sc.nextInt());
            System.out.print("연락처 : ");
            nameCards[i].setPhone(sc.next());
            System.out.print("메일 : ");
            nameCards[i].setMail(sc.next());

        }
        for (NameCard card : nameCards) {
            card.printInfo();
        }

    }
}
