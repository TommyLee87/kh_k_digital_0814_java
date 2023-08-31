package 프로퍼티_0831;
// Map의 키와 값이 모두 String 타입으로 제한된 형태.

import 커피메뉴만들기_0831.CoffeeMenuList;

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Properties;


public class PropertiesMain {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String path = PropertiesMain.class.getResource("./database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8"); // 한글에 대한 처리를 위해서
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
