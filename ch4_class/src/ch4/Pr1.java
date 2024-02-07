package ch4;

public class Pr1 {

  private int num1;

  public Pr1(int num1) {
    this.num1 = num1;
  }

  int getnum() {
    return num1;
  }

  void setnum(int num1) {} // 직접

  public int getNum1() {
    return num1;
  }

  public void setNum1(int num1) {
    this.num1 = num1;
  } // 소스 액션
  // 리턴 메소드

  // 타입 기본형 : int, (정수형) double(실수형),boolean
  // 타입 참조형 : 배열 , 클래스

}
