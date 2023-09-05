package $자바파이널_텍스트읽기_0905;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

// 총점순으로 정렬
public class ReadTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream inputStream = new FileInputStream("src/$자바파이널_텍스트읽기_0905/Score.txt");
        TreeSet<StudentInfo> treeSet = new TreeSet<>();

        Scanner sc = new Scanner(inputStream);
        while (sc.hasNext()) {
            String[] linesplit = sc.nextLine().split(" ");
            treeSet.add(new StudentInfo (linesplit[0],
                    Integer.parseInt(linesplit[1]
                    + Integer.parseInt(linesplit[2])
                    + Integer.parseInt(linesplit[3]);


        }
        for(StudentInfo e : inputStream) {

        }




    }
}

