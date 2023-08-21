package 문자열다루기;
// 자바의 문자열을 나타내는 자료형은 String이며, 참조 타입 자료형
// equals : 두 개의 문자열이 동일한지 비교하여 결과값을 리턴함.(true / false), == 는 문자열 주소가 같은지 물어봄.
// indexOf : 문자열에서 특정 문자가 [시작되는 인덱스]를 반환
// contains : 문자열에서 특정 문자열의 포함 여부 확인
// charAt : 문자열에서 특정 위치의 문자를 반환
// replace : 문자열 중에서 특정 문자열을 다른 문자열로 변경, 문자열만 가능
// replaceAll : 문자열 중에서 특정 문자열을 다른 문자열로 변경, 정규식을 넣을 수 있음.
// substring : 문자열 중 특정 부분을 뽑아 낼 때 사용 (시작 인덱스만 주는 경우와 시작,끝 인덱스를 주는 경우가 있음)
// toUpperCase / toLowerCase : 문자열 전부를 대문자 / 소문자로 변경하는 메소드
// trim : 공백을 없앨 때
// split : 문자열을 특정 구분자로 분리하는 메소드
// toCharArray : 문자를 문자 배열로 반환
public class StringMethod {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "hello";
        String d = "Hello";

        System.out.println("== a.equals ==");
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        System.out.println(a.equalsIgnoreCase(d)); // 대소문자 구분 없이 문자열을 비교함.

        System.out.println("== indexOf ==");
        System.out.println(a.indexOf("lo")); // 문자가 [시작되는 인덱스] 반환
        System.out.println(a.indexOf("lt")); // 없는 문자열을 넣으면 -로 반환.

        System.out.println("== contains ==");
        String e = "hello java";
        System.out.println(e.contains("java"));
        System.out.println(e.contains("java "));  // 띄어진 부분도 문자열로 인식함.

        System.out.println("== charAt ==");
        String f = new String("hello");
        System.out.println(f.charAt(4));

        System.out.println("== replace ==");
        String g = "Hello java";
        System.out.println(g.replace("java", "Python"));

        System.out.println("== substring ==");
        String h = "Hello java";
        System.out.println(h.substring(4,7));

        System.out.println("== toUpperCase/toLowerCase ==");
        String i = "Hello java";
        System.out.println(i.toUpperCase());
        System.out.println(i.toLowerCase());

        System.out.println("== trim ==");
        String oldstr = "      자바 프로그래밍     ";
        System.out.println(oldstr.trim());

        System.out.println("== split ==");
        String time = "10:23:45";
        String [] modifyTime = time.split(":");
        for (String ee : modifyTime) System.out.println(ee + " ");


        // 문자열 포매팅을 출력을 위하여 사용
        System.out.printf("I eat %d apples.\n", 3);
        String test = String.format("I eat %d apples.", 3);
        System.out.println(test);
        System.out.println(String.format("I eat %d apples.", 3));

        String testname = "James";
        char[] chName = testname.toCharArray();
        for(char eCh : chName) System.out.print(eCh + " ");

    }
}
