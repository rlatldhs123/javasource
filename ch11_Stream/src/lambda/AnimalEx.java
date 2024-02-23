package lambda;

public class AnimalEx {

  public static void main(String[] args) {
    // 일반적인 인터페이스 활용 방법
    Animal animal = new Lion();
    animal.eat();

    // 람다식으로 활용하기 ( 라이온 클래스가 필요 없음)
    Animal animal2 = () -> System.out.println("풀을 먹는다");
    animal2.eat();
  }
}
