package operator;

public class ArithmeticEx2 {

  public static void main(String[] args) {
    int apple = 1;
    int totalPieces = apple * 10;
    int number = 7;
    int temp = totalPieces - number;
    double result = temp / 10.0;
    // double result = apple - number * pieceUnit;
    //System.out.println(result);

    // Exception in thread "main" java.lang.ArithmeticException: / by zero  에러이다
    // 런타임 예외사항 (실행을 시켜봤는데 에러 빨간줄은 뜨지 않는다)

    System.out.println(10 / 0);
  }
}
