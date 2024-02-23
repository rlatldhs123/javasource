package lambda;

public class LambdaEx {

  public static void main(String[] args) {
    // My Funtion 사용
    MyFuunction1 lambda = () -> System.out.println("함수적 인터페이스");
    lambda.metod();

    MyFuunction1 lambda2 = () -> {
      int i = 10;
      System.out.println(i * i);
    };
    lambda2.metod();

    MyFuunction2 lambda3 = x -> System.out.println(x);
    lambda3.metod(10);

    lambda3 = x -> System.out.println(x * x);
    lambda3.metod(100);

    MyFuunction3 lambda4 = (x, y) -> x > y ? x : y;
    lambda4.metod(10, 15);
    System.out.println(lambda4.metod(10, 15));
  }
}
