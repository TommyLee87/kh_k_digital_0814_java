package 예외처리1_기본_0904;

public class ExceptionBasic {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("배열의 인덱스를 초과하였습니다! ");
        }
        System.out.println("프로그램 끝");
    }
}
