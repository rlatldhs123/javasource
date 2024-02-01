package Exam;

import java.util.Scanner;

public class Degrees {

  public static void main(String[] args) {
    // 화씨온도 => 섭씨온도

    Scanner sc = new Scanner(System.in);

    System.out.print("화씨온도 입력");
    double num = sc.nextInt();

    double cc = (num - 32) * 5 / 9;

    System.out.printf("섭씨 온도 %.2f", cc);

    int intvalue = 123456789;
    byte nytevalue = (byte) intvalue;
  }
}
