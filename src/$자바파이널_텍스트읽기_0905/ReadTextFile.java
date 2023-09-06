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
            String[] lineSplit = sc.nextLine().split(" ");
            treeSet.add(new StudentInfo(lineSplit[0],
                    Integer.parseInt(lineSplit[1])
                            + Integer.parseInt(lineSplit[2])
                            + Integer.parseInt(lineSplit[3])));
        }
        for(StudentInfo e : treeSet) {
            System.out.println(e.getName() + " : " + e.getTotal());
        }
    }
}



