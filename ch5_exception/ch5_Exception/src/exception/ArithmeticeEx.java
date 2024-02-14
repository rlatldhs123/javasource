package exception;

public class ArithmeticeEx {

  public static void main(String[] args) {
    int number = 100;
    int result = 0;

    for (int i = 0; i < 10; i) {
      try {
        result = number / (int) (Math.random() * 10);
        System.out.println(result);
      } catch (ArithmeticException e) {
        System.out.println("0");
        // TODO: handle exception
      } //실행을 시켜야 알 수있는 런타임 exception 이다
    }
  }
}
