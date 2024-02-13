package interFaceTest;

public abstract class Calclator implements Calc {

  // times 와 divide 는 여전히 추상 메소드
  @Override
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  @Override
  public int substract(int num1, int num2) {
    return num1 - num2;
  }
}
