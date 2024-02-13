package interFaceTest;

public interface Calc {
  // public static final 은 인터페이스로 선언하면 기본값으로 붙어 있기에 자동으로 생략된다
  double PI = 3.14;
  int ERROR = -99999999;
  // public abstract 도 마찬가지이다

  int add(int num1, int num2);
  int substract(int num1, int num2);
  int times(int num1, int num2);
  int divide(int num1, int num2);
}
