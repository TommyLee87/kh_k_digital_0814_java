package 브루마블;
// 두 개의 주사위를 던져 12가 나오면 탈출하는 게임

public class RandomGame {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0; // 몇 번만에 탈출 하는가?
        while (true) {
            cnt++;
            rand1 = (int) ((Math.random() * 6) + 1); // (0.1xx ~ 5.9xx) + 1
            rand2 = (int) ((Math.random() * 6) + 1);
            if ((rand1 + rand2) == 12) {
                System.out.printf("무인도를 %d번 만에 탈출하였습니다.\n", cnt);
                break;
            } else {
                System.out.println("주사위의 합이 " + (rand1 + rand2) + "입니다.");
            }
        }
    }
}
