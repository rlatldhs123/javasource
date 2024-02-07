package ch4;

public class FactorialEx {

  public static void main(String[] args) {
    System.out.println(factorial(10));
  }

  // 재귀 호출 : 메소드 자신을 호출
  static int factorial(int n) {
    int result = 0; // 팩토리얼 메소드

    if (n == 1) result = 1; else result = n * factorial(n - 1);
    return result;
    // 만약 n 이  1이라면 result 값이1이되고 아니라면 result 값은  n  * n-1
  }
}
