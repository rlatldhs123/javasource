package Exam;

import java.util.Scanner;

public class MaxValue {

  public static void main(String[] args) {
    // 숫자 3개를 입력 받은 후 3개의 숫자중 가장 큰 숫자를 출력하는
    //  프로그램을 만들고 싶음

    Scanner sc = new Scanner(System.in);

    System.out.println("첫번째 숫자");
    int num1 = sc.nextInt();

    System.out.println("두번쨰 숫자");
    int num2 = sc.nextInt();

    System.out.println("세번째 숫자");
    int num3 = sc.nextInt();

    int max = num1;
    if (max < num2) {
      max = num2;
    }
    if (max < num3) {
      max = num3;
    }

    System.out.println("세 수 중 가장 큰 수", +max);
  }
}
