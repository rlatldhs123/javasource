package Exam;

import ch4.Student;

public class CircleEx {

  public static void main(String[] args) {
    // Circle 객체 생성
    Circle circle = new Circle(3.5);
    // circle.redius = 3.5; 할 수 없음

    // 원의 면적 구하기 호출

    double result = circle.gerArea(); //호출  1.

    System.out.println("원의 넓이 = " + result); // 결과 (result) 출력
  }
}
