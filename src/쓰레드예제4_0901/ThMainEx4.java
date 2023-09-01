package 쓰레드예제4_0901;

import static java.lang.Thread.sleep;

// 쓰레드를 안전하게 종료하기, stop()메소드는 사용 중지됨.
public class ThMainEx4 {
    public static void main(String[] args) throws InterruptedException {
        RunTread runTread = new RunTread();
        runTread.start();
        try {
            sleep(3000);
        } catch(InterruptedException e) {}
        runTread.interrupt();

    }
}

class RunTread extends Thread {
//    private boolean stop = false; // stop 플래그 설정
//
//    public void setStop(boolean stop) {
//        this.stop = stop;
//    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Thread 실행 중...... ");
                sleep(1);
            }
        } catch(InterruptedException e) {
            System.out.println("인터럽트 발생 !!!!!!");
        }

        System.out.println("자원 정리...");
        System.out.println("실행 종료...");
    }
}

