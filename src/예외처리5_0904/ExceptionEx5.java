package 예외처리5_0904;

import java.io.IOException;

// 예외처리 미루기
public class ExceptionEx5 {
    public static void main(String[] args) {
        IOsample test = new IOsample();
        test.input();
        }
    }

    class IOsample {
        private int num;
        public void input() {
            try {
                num = System.in.read();
            } catch (IOException e) {

            }
        }
        public void output() {
            System.out.println(num);
        }
    }