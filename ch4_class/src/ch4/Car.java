package ch4;

public class Car {

  // 자동차

  // 제조사, 이름, 옵션, 최대속도,   => 필요한 것들만 변수로 작성
  // 전진한다, 후진한다 = 메소드로 작성
  // 멤버 변수의 값을 변경 => 메소드로 작성

  String company;
  String model;
  int maxSpeed;

  void forward() {
    System.out.println("전진한다");
  }

  void backward() {
    System.out.println("후진한다");
  }
}
