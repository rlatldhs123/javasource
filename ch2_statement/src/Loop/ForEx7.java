package Loop;

public class ForEx7 {

  public static void main(String[] args) {
    //1~100 까지 숫자 중에서 3의 배수만 더하고 싶다,단 9의배수는 뺴고싶다

    int sum = 0;

    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 && i % 9 != 0) {
        sum += i;
      }
    }
    System.out.println("3의 배수 더한 값" + sum);

    //1~100까지 숫자중 3과 5의 배수의 합

    sum = 0;

    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += 1;
      }
    }
    System.out.println("3과 5의 배수의 합 " + sum);
  }
}
