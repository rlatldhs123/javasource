package abstractclass;

public class FireEngine extends Car {

  void water() {
    System.out.println(" water!!!~~~");
  }

  @Override
  void drive() {
    System.out.println("소방차가 달린다");
  }
}
