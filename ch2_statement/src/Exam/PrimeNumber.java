package Exam;

public class PrimeNumber {

  public static void main(String[] args) {
    //1 에서 100사이의 숫자 중에서 소수를 찾아서 출력 및 개수 세기

    // 소수 : 1 보다 큰 자연수 중에서 1과 자기 자기 자신 만을 약수로 가지는 수

    //

    int count = 0, total = 0;
    for (int i = 2; i < 101; i++) {
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          // 나누어 떨어지는 숫자 개수 세기

          count++;
        }

        if (count == 2) {
          System.out.print(i + "\t");
          total++;
        }
        count = 0;
      }
      System.out.println();
      System.out.println("1~100 사이의 소수의 개수는" + total);
    }
  }
}
