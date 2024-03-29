package 명령어이력조회_0901;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class CommandHistory {
    Queue<String> queue = new LinkedList<>();
    final static int MAX_SIZE = 10;
    public static void main(String[] args) {
        CommandHistory history = new CommandHistory();
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
        while (true) {
            System.out.print("$ ");
            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine().trim(); // 입력 받은 문자열 앞뒤의 공백 제거
            if (cmd.equalsIgnoreCase("q")) {
                System.exit(0); // 프로그램 강제 종료
            } else if (cmd.equalsIgnoreCase("help")) {
                System.out.println("help - 도움말을 보여 줍니다.");
                System.out.println("q/Q - 프로그램 종료");
                System.out.println("history - 최근 입력한 명령어 " + MAX_SIZE + "개가 나타납니다." );

            } else if (cmd.equalsIgnoreCase("history")) {
                history.save(cmd);
                int cnt = 0;
                for (String e : history.queue) {
                    cnt ++;
                    System.out.println(cnt + " " + e);
                }

            } else {
                history.save(cmd);
                System.out.println(cmd);
            }
        }

    }
    void save(String cmd) {
        queue.offer(cmd);
        if (queue.size() > MAX_SIZE) queue.remove(); // queue의 사이즈가 MAX보다 크면 제일 앞의 요소를 제거
    }
}


