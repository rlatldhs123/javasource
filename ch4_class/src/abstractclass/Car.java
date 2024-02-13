package abstractclass;

public abstract class Car {

  String color;

  //abstract 으로 구현한 이유는 자식 클래스들이 다 다르게 구현하기 때문에
  //
  //
  //
  abstract void drive();

  // 중괄호가 없는 메소드는 abstract 을 붙힌다
  // abstract 는 클래스에도 들어가야 한다
  // 드라이브하더라도 어차피 완전히 바꿀꺼라면 abstract 으로 추상 메소드로 내려서
  // 사용한다

  void stop() {
    System.out.println("stop!!!~~~");
  }
}
