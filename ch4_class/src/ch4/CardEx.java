package ch4;

public class CardEx {

  public static void main(String[] args) {
    Card card1 = new Card("heart", 2);
    Card card2 = new Card("spade", 5);

    // 스태틱으로 만들어진 변수의 접근
    // card1 , card2 처럼 객체로부터 접근이 아닌
    // 클래스이름인 Card 로 접근
    // 스태틱으로 선언된 모이는 저장 공간이 따로있다  heap이 아닌 곳임

    System.out.println("카드 크기" + Card.width);
    System.out.println("카드 크기" + Card.hieght);

    System.out.println("카드 크기" + Card.width);
    System.out.println("카드 크기" + Card.hieght);

    // 공유 값 변경
    Card.width = 80;
    Card.hieght = 50;

    // 클래스 변수 ( 공유의 의미가 있음)
    // 클래스가 로딩될 때 생성되고 프로그램이 종료될 때 소멸

    CardEx obj = new CardEx();
    obj.method1(); // 스태틱이 붙지 않은 메인에서 만들었기에 호출 불가능
    // 1) 호출 방법  메인 메소드내 스태틱을 붙힌다
    // 2) 호출 방법  인스턴스 생성 후 접근하기

  }

  public void method1() {
    System.out.println("인스턴스 메소드");
  }
}
