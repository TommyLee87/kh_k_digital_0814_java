package 문자스트림_0905;
// Writer : 문자열 기반 출력 스트림의 최상위 클래스, 추상 클래스

import java.io.*;

public class CharStreamEx {
    public static void main(String[] args) throws IOException {
//        Writer writer = new FileWriter("test.txt");
//        char[] data = "곰도리464".toCharArray();
//        for (int i = 0; i < data.length; i++) {
//            writer.write(data[i]);
//        }
//        writer.write(data);
//        writer.flush(); // 버퍼 비우기
//        writer.close();

        Reader reader = new FileReader("test.txt");
        while (true) {
            int readData = reader.read();
            if (readData == -1) break;
            System.out.print((char)readData);
        }
        reader.close();
    }
}
