package ch4;

public class Student {

  // 멤버 변수( = 인스턴스 변수, property, 속성 , 필드) - 학생 객체가 가져야 하는 특징
  // 학번(20241011), 이름(홍길동), 주소(서울시 종로구), 주민번호(071215 - 2011237). 핸드폰(010-1234-1234)

  String id; // 학번
  String name; // 이름
  String addr; // 주소
  String hp; // 핸드폰번호

  // 멤버 메소드(= 인스턴스 메소드,기능,동작) - //
  //  속성을 변경시킬 수 있도록 메소드 작성

  void changerAddr() {}

  void changerHp() {}

  // 생성자 ( constructor)
  // 클래스를 객체로 생성할 때 필수로 필요
  //    클래스는 한번만 만들어 놓으면 재사용의 개념이 적용

  Student() {}
  // 메인이 있는 메소드만 run 이 가능
}
