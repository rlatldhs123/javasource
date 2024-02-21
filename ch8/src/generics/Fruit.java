package generics;

// 한개의 파일에 여러 개의 클래스를 작성 가능
// 하지만  {public 이라는 키워드는 한개의 클래스만 붙힌다}
// 파일명은 public 클래스 명으로 작성

public class Fruit {

  @Override
  public String toString() {
    return "Fruit";
  }
}

class Apple extends Fruit {

  @Override
  public String toString() {
    return "Apple";
  }
}

class Grape extends Fruit {

  @Override
  public String toString() {
    return "Grape";
  }
}

class Toy {

  @Override
  public String toString() {
    return "Toy";
  }
}
