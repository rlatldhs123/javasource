package ch4;

import java.util.Scanner;

public class StudentEx3 {

  public static void main(String[] args) {
    Student2 stuArr[] = new Student2[3]; // 3명의 학생 객체 생성

    // 첫번째 학생 휴대폰 번호 등록

    stuArr[0].setHp("010-1234-5678");

    // 3번째 학생 주소 변경

    stuArr[2].setAddr("종로구");

    // 학생 정보 입력 받기

    Scanner sc = new Scanner(System.in); // 스캐너 기본 구문

    for (int i = 0; i < stuArr.length; i++) {
      System.out.print("input ID :");
      String id = sc.nextLine(); // 입력 구문

      System.out.print("input name :");
      String name = sc.nextLine(); // 입력구문

      System.out.print("input addr :");
      String addr = sc.nextLine(); // 입력 구문
      stuArr[i] = new Student2(id, name, addr); // 입력받고 난 후 배열의 회전수마다 값을 집어 넣는다
      //stuArr[0] = new Student2(id, name, addr);
      //stuArr[1] = new Student2(id, name, addr);
      //stuArr[2] = new Student2(id, name, addr);
      // 위 3개 구문을 반복
      //
    }

    for (Student2 student2 : stuArr) {
      System.out.println(student2); // 입력 받은 값을 확인
    }
  }
}
