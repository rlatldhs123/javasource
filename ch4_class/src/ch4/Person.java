package ch4;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class Person {

  private String name; // 멤버 변수는 private으로 생성 한다
  private final String nation;
  //
  //
  //
  // 객체끼리 공유하는 상수가 된다는 의미
  // private 접근을 외부에서 하려면 조건이 따르는
  // static 공유한다는 의미
  // final 고정된 고정값
  // 추가 : 상수는 대문자를 써야함
  private static final double PI = 3.141592;

  public static double getPi() {
    return PI;
  }

  // 멤버 변수의 final 이 붙으면
  // 초기화를 (값 지정) 반드시 해야한다
  // 선언 할때 or 생성자 안에서
  // final 이라는 키워드는 멤버변수 , 클래스 , 메소드 에서도 붙을 수 있다
  //
  //
  //

  // 클래스에 붙을시 - 상속금지
  // 메소드에 붙을시  -  오버라이딩 금지
  // 멤버 변수에 붙을시 -
  // 변수에 final 이 붙어 버리면 상수가 된다 (고정 값)

  public Person(String name, String nation) {
    this.name = name;
    this.nation = nation;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + "]";
  }
}
//  클래스 만드는 방법 (필수)
// 프라이빗 선언
// 기본모양 겟셋
// 투스트링
