package exam2;

public abstract class Odd {

  private int odd;

  public Odd(int odd) {
    this.odd = odd;
  }

  public int getOdd() {
    return odd;
  }

  abstract boolean isOdd();
}
