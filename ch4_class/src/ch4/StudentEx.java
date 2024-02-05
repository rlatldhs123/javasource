package ch4;

public class StudentEx {

  public static void main(String[] args) {
    // 객체(인스턴스) 생성
    Student student = new Student(); // 학생한명의 정보를 클래스 하나의 담겠다

    System.out.println(student); // ch4.Student@5ca881b5 주소
    System.out.println(student.id); // null
    System.out.println(student.name); // null
    System.out.println(student.addr); // null
    System.out.println(student.hp); // null
    System.out.println(student.id);

    // 생성된 인스턴스에 값 할당

    student.id = "20241212";
    student.name = "홍길동";
    student.addr = "서울시 종로구";
    student.hp = "010-1234-4567";

    System.out.println(student); // ch4.Student@5ca881b5 주소
    System.out.println(student.id); // null
    System.out.println(student.name); // null
    System.out.println(student.addr); // null
    System.out.println(student.hp); // null

    // 다른 학생의 대한 값 할당

    Student student2 = new Student(); // 생성자 호출 new Student();

    student2.id = "20241213";
    student2.name = "성춘향";
    student2.addr = "서울시 구로구";
    student2.hp = "010-1234-7897";

    System.out.println(student2);
    System.out.println(student2.id);
    System.out.println(student2.name);
    System.out.println(student2.addr);
    System.out.println(student2.hp);
  }
}
