package 매개변수의다형성0824;

import java.util.Scanner;

public class BuyerEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        TV tv = new TV();
        Computer computer = new Computer();
        Audio audio = new Audio();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("[1]TV [2]Computer [3]Audio [4]Quit : ");
            int sel = sc.nextInt();
            switch (sel) {
                case 1 :
                    buyer.buy(tv);
                    buyer.viewInfo();
                    break;
                case 2 :
                    buyer.buy(computer);
                    buyer.viewInfo();
                    break;
                case 3 :
                    buyer.buy(audio);
                    buyer.viewInfo();
                    break;
                case 4 :
                    return;
                default: System.out.println("명시된 품목 중에서 선택해주세요.");
            }
        }

    }
}
