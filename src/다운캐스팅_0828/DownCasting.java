package 다운캐스팅_0828;

import java.util.ArrayList;
import java.util.List;

// 다운캐스팅 : 상위 클래스형으로 변환 되었던 하위 클래스를 다시 원래 자료형으로 변환하는 것
public class DownCasting {
    List<Animal> aniList = new ArrayList<>();

    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();
        downCasting.testCasting();
    }

    public void addAnimal() {
        aniList.add(new Animal()); // ArrayList에 추가되면서 Animal 형으로 변환
        aniList.add(new Human());
        aniList.add(new Tiger());
        aniList.add(new Eagle());
        for (Animal ani : aniList) {
            ani.move();
        }
    }

    public void testCasting() {
        for (int i = 0; i < aniList.size(); i++) {
            Animal ani = aniList.get(i); // 업캐스팅
            if (ani instanceof Human) { // Human 형으로 다운캐스팅이 가능한지 확인
                Human h = (Human) ani;
                h.readBook(); // 원래 자신의 클래스에 대한 참조 변수이기 때문에 접근이 가능
            } else if (ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if(ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            } else {
                System.out.println("지원되지 않는 형입니다.");
            }
        }
    }
}
