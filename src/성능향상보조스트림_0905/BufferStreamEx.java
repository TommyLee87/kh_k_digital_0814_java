package 성능향상보조스트림_0905;
// 프로그램과 입출력 장치 사이에는 엄청난 속도 차이가 발생하며 이로 인해 병목현상이 발생
// 이를 해결하기 위해 성능 향상 보조 스트림을 사용

import java.io.*;

public class BufferStreamEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null; // 성능 향상을 위한 보조 스트림
        BufferedOutputStream bos = null;
        int data = -1;   // 파일의 끝을 확인하기 위한 변수
        long start = 0;   // 시작 시간
        long end = 0;     //  종료 시간

//        fis = new FileInputStream("src/성능향상보조스트림_0905/bear2.jpg");
//        bis = new BufferedInputStream(fis);
//        fos = new FileOutputStream("d:/tmp/곰도리2.jpg");
//        start = System.currentTimeMillis();
//        while ((data = bis.read()) != -1) {
//            fos.write(data);
//        }
//        fos.flush();
//        end = System.currentTimeMillis();
//        fos.close(); bis.close(); fis.close();
//        System.out.println("성능향상 보조 스트림을 사용하지 않는 경우 : " + (end-start) + "ms");

        fis = new FileInputStream("src/성능향상보조스트림_0905/bear2.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("d:/tmp/곰도리.jpg");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1) {
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        fos.close(); bis.close(); fis.close();
        System.out.println("성능향상 보조 스트림을 사용하는 경우 : " + (end-start) + "ms");




    }
}
