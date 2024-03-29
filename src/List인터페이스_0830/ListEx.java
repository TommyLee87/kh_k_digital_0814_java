package List인터페이스_0830;
// 리스트 인터페이스는 ArrayList, LinkedList, Vector의 부모이며 인터페이스로 구성되어 있음
// 리스트 구조는 배열과 유사하고 차이점으로 동적으로 크기가 변함
// ArrayList, LinkedList, Vector 거의 동일한 메소드를 가지고 있어 코드 변환이 자유로움
// ArrayList : 리스트 타입의 대표적인 자료 구조(특별한 경우가 아니면 ArrayList 사용)
// - 검색이 빈번한 경우 효율적이며, 맨 뒤에 입력이 일어나는 경우에는 효과적.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        String[] arr = {"1000", "2000", "3000", "10", "9999", "560"};
        // Arrays.asList(arr) : 이미 만들어진 배열을 ArrayList에 추가
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

        // 특정 위치에 값을 가져 올 때 : get(index)
        System.out.println(list.get(2));

        // List의 크기를 가져올 때 : size()
        System.out.println(list.size());

        // 리스트 내에 해당하는 항목이 있는지 판별 : contains(항목)
        System.out.println("포함 여부 확인 : " + list.contains("142"));

        // remove(객체) : 리스트 내에 객체에 해당하는 항목을 삭제하고 결과를 반환
        // remove(인덱스) : 해당 인덱스의 값을 삭제하고 삭제된 값을 반환
        System.out.println("삭제 성공 여부 확인 : " + list.remove(2));

        list.sort(Comparator.naturalOrder()); // 오름차순, reverseOrder() = 역순(내림) , 지금은 문자상태
        System.out.println(list);

    }
}
