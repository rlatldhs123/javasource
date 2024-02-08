package ch4.inherritance;

// 원(Circle) 은 점(Point)이다 = > Circle is a Point    (상속)
// 원(Circle) 은 점(Point)을 가지고 있다 = > Circle has a Point ( 포함)

// public class Circle extends Point {

//     int x;               // 원점 x 의  좌표
//     int y;               // 원점 y 의  좌표
//     int r;               // 반지름

// }

public class Circle {

  Point p = new Point();
  int r;
  // 클래스 끼리 관계를 맺는 방법은 상속과 포함 관계가 있다

  // 상속관계 (isa) :
  // public class Circle extends Point {

  //     int x;               // 원점 x 의  좌표
  //     int y;               // 원점 y 의  좌표
  //     int r;               // 반지름

  // }

  // 포함관계 (hasa): 한 클래스의 멤버변수로 다른 클래스의 타입의 참조 변수를 선언

  // Point p =new Point();
  // int r;

}
