package exam2;

public class OddEx extends Odd {

  public static void main(String[] args) {
    Odd odd = new Odd(10);
    System.out.println(odd.isOdd());
  }

  @Override
  boolean isOdd() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isOdd'");
  }
}
