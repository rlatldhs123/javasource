package exception;

public class ThrowsEx {

  public static void main(String[] args) throws Exception {
    method1();
  }

  public static void method1() throws Exception {
    method2();
  }

  public static void method2() throws Exception {
    throw new Exception();
  }
}
