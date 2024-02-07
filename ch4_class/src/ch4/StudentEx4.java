package ch4;

import java.util.Scanner;

public class StudentEx4 {

  public static void main(String[] args) {
    Student3 stuArr[] = new Student3[3];
    //System.out.println(stuArr[0]); // 클래스 배열의 null 값은 초기값은 null이다
    //System.out.println(stuArr[0].getId()); //  .NullPointerException  = 변수 옆에  . 을 찍는 순간
    // heap 쪽에 저장된게 뭐가 있는지 가져오라는 뜻이지만 값이 없기에  아무것도 가져올게 없어 뜨는 오류

    Scanner sc = new Scanner(System.in);
    // sc.nextLine() sc.nextInt  물리적인 엔터키를 누른 흔적이 버퍼에 남아서  두 메소드르 ㄹ
    // 섞어서 사용할때는

    for (int i = 0; i < stuArr.length; i++) {
      stuArr[i] = new Student3(); // stuArr[i].setId(name); 왼쪽 구문을 넣지않고
      // for 문안에 stuArr[i].setId(name); 이걸 넣게되면 NullPointerException 오류가 뜨게된다
      // 객체 구문인 stuArr[i] = new Student3(); 넣어서 지정해준다

      // 해결 방법?

      //Integer.parseInt(sc.nextLine());  --인티저 대문자 I 까지 쓰면 나온다
      // Integer가 나오면 . 를 찍어 parseInt() 가 뜨게되면 괄호안에 sc.nextLine() 을 넣는다
      // 형변환이다

      // 이름 ,아이디, 국어, 영어,수학점수 입력 받아서 초기화

      System.out.print("이름 입력 : ");
      String name = sc.nextLine(); // 이름 입력
      stuArr[i].setName(name);

      System.out.print("아이디 입력 : ");
      String id = sc.nextLine(); // 아이디 입력
      stuArr[i].setId(id);
      System.out.print("국어 점수 입력 : ");
      int kor = Integer.parseInt(sc.nextLine()); // 국어 점수 입력
      stuArr[i].setKor(kor);
      System.out.print("영어 점수 입력 : ");
      int eng = Integer.parseInt(sc.nextLine()); // 영어 점수 입력
      stuArr[i].setEng(eng);
      System.out.print("수학 점수 입력 : ");
      int math = Integer.parseInt(sc.nextLine()); // 수학 점수 입력
      stuArr[i].setMath(math);
    }

    // 출력문 아이디 이름 국어 영어 수학  총점 평균

    System.out.println("=================================");
    System.out.println("아이디 이름 국어 영어 수학 총점 평균");
    System.out.println("=================================");

    // for 문을 이용한 서로 다른 접근 방식 : 접근방식 1
    // for (Student3 student3 : stuArr) {
    //   System.out.println(
    //     student3.getId() +
    //     " " +
    //     student3.getName() +
    //     " " +
    //     student3.getKor() +
    //     " " +
    //     student3.getEng() +
    //     " " +
    //     student3.getMath()
    //   );

    // }
    // 접근 방식 2
    for (int i = 0; i < stuArr.length; i++) {
      int total = stuArr[i].getKor() + stuArr[i].getMath() + stuArr[i].getEng();

      System.out.printf(
        "%s %s %d %d %d %d %d %.2f \n",
        stuArr[i].getId(),
        stuArr[i].getName(),
        stuArr[i].getKor(),
        stuArr[i].getEng(),
        stuArr[i].getMath(),
        total,
        total / 3.0
      );
    }
  }
}
