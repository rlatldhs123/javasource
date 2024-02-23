package lambda;

public class LambdaEx2 {

  public static void main(String[] args) {
    MyFunction4 lambda = () -> System.out.println("메인에서 런");
    lambda.run();

    System.out.println();
    execute(getRun());
  }

  static void execute(MyFunction4 lambda) {
    lambda.run();
  }

  static MyFunction4 getRun() {
    MyFunction4 lambda = () -> System.out.println("MyFunction4");
    lambda.run();
    return lambda;
  }
}
