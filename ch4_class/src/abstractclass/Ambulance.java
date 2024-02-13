package abstractclass;

public class Ambulance extends Car {

  void siren() {
    System.out.println("siren~~!!!");
  }

  @Override
  void drive() {
    System.out.println("앰뷸런스가 달린다");
  }
}
