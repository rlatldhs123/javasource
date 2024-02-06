package ch4;

public class Card {

  // 멤버변수
  private String kind; // 무늬 (하트 , 클로버 ,,,,)
  private int num; // 숫자
  //
  //
  //
  //
  // 클래스 변수 ( 공유의 의미가 있음)
  // 클래스가 로딩될 때 생성되고 프로그램이 종료될 때 소멸
  static int width = 100; // 카드 밑변
  static int hieght = 150; // 카드 높이  //

  // 카드 객체를 생각해 봤을때 카드의 크기 변수가 변하지 않는 값이므로
  // static을 앞에 넣어준다 이것을 클래스 변수라고 한다

  public Card(String kind, int num) {
    this.kind = kind;
    this.num = num;
  }
}
