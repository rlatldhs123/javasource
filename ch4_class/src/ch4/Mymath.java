package ch4;

public class Mymath {

  private long num1, num2;

  public Mymath(long num1, long num2) {
    this.num1 = num1;
    this.num2 = num2;
  } // 생성자 게더세터 중 제공방법은 만드는 사람 마음이다

  // 둘다 제공 하더라도 괜찮다

  long add() {
    return num1 + num2;
  }

  long subtrack() {
    return num1 - num2;
  }

  long multiply() {
    return num1 * num2;
  }

  long divide() {
    return num1 / num2;
  }

  static long add(long num1, long num2) {
    return num1 + num2;
  }

  static long subtrack(long num1, long num2) {
    return num1 - num2;
  }

  static long multiply(long num1, long num2) {
    return num1 * num2;
  }

  static long divide(long num1, long num2) {
    return num1 / num2;
  }
}
