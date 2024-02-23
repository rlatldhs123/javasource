package lambda;

public class AdderEx {

  public static void main(String[] args) {
    InterAdder adder = (x, y) -> x + y;
    InterAdder adder1 = (x, y) -> x * y;
    InterAdder adder2 = (x, y) -> x - y;
    InterAdder adder3 = (x, y) -> x / y;

    adder.add(10, 20);
    System.out.println(adder2.add(10, 20));
  }
}
