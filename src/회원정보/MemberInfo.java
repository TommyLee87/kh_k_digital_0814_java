package 회원정보;

import java.util.Scanner;

// 이름 : 문자열
// 나이 : 정수, 나이는 1 ~ 199, 이 외의 값이 오면 재입력 요구
// 성별 : 문자 'M'과 'F' 입력 받고 출력은 "남성"과 "여성"으로 출력
// 직업 : 정수로 입력 (1. 학생, 2. 회사원, 3. 주부, 4. 무직)
// 결과는 한 번에 출력
public class MemberInfo {
    String name; // 인스턴스 필드
    int age;
    char gender;
    int jobs;

    Scanner sc = new Scanner(System.in);

    public void setName() {
        System.out.print("이름을 입력 하세요 : ");
        name = sc.nextLine();
    }

    public void setAge() {
        while (true) {
            System.out.print("나이를 입력 하세요 : ");
            age = sc.nextInt();
            if (age > 0 && age < 200) return; // break; 대신 return 가능. 같은 것은 아님!
            System.out.println("나이를 잘 못 입력 하셨습니다.");
        }
    }
    public void setGender() {
        while (true) {
            System.out.print("성별을 입력 하세요 : ");
            gender = sc.next().charAt(0); // 문자열에서 제잎 앞 문자만 추출
            switch (gender) {
                case 'M' :
                case 'm' :
                case 'F' :
                case 'f' :
                    return;
                    //break; //(break;를 쓴다면 default 뒤에 continue;를 써줘야 함 -> while 문에서 쓰는 방식.)
                default:
                    System.out.println("성별을 잘 못 입력 하셨습니다.");
                    //continue;
            }
        }
    }
    public void setJobs() {
        while (true) {
            System.out.print("직업을 입력 하세요 : ");
            jobs = sc.nextInt();
            if(jobs > 0 && jobs < 5) break;
            System.out.print("직업을 잘 못 입력 하셨습니다.");
        }
    }
    public int getGenderType() {
        if(gender == 'M' || gender == 'm') return 1;
        else return 2;
    }

    public void getInfo() {
        String[] genderStr = {"", "남성", "여성"};
        String[] jobsStr = {"", "학생", "회사원", "주부", "무직"};

        System.out.println("=".repeat(5) + " 회원정보 " + "=".repeat(5));
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]);
        System.out.println("직업 : " + jobsStr[jobs]);

    }
}


