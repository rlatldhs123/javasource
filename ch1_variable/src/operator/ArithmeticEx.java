package operator;

public class ArithmeticEx {

  public static void main(String[] args) {
    // 산술연산자 : + ,- ,*, / , %(나머지)

    int num1 = 5, num2 = 2;
    int result1 = num1 + num2;

    System.out.printf("%d + %d = %d\n ", num1, num2, result1);

    result1 = num1 - num2;
    System.out.printf("%d - %d = %d\n ", num1, num2, result1);

    result1 = num1 * num2;
    System.out.printf("%d +*%d = %d\n ", num1, num2, result1);

    result1 = num1 / num2;
    System.out.printf("%d / %d = %d\n ", num1, num2, result1); // 자바에서 정수 나눗셈을 하면 몫만 나온다 (나머지는  % 기호로 출력)

    result1 = num1 % num2;
    System.out.printf("%d %% %d = %d\n ", num1, num2, result1);

    double d1 = 6.0d;
    int d2 = 4;

    double result2 = d1 % d2;
    System.out.printf("%f %% %d = %f\n ", d1, d2, result2);

    result2 = d1 / d2;
    System.out.printf("%f / %d = %f\n ", d1, d2, result2);

    char ch1 = 'A' + 1;
    // char ch2 = ch1 + 1;
    System.out.printf("ch= %c", ch1);
  }
}
