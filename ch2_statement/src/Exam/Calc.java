package Exam;

import java.util.Scanner;

public class Calc {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("+, -, *, /, % 중 하나를 입력하세요 >>>>>");

    String op = sc.nextLine();

    System.out.println("입력한 문자는 " + op);
    System.out.print("첫번째 숫자 >>> ");

    int num1 = sc.nextInt();

    System.out.print("두번쨰 숫자 >>> ");

    int num2 = sc.nextInt();

    switch (op) {
      case "+":
        System.out.println(num1 + num2);

        break;
      case "-":
        System.out.println(num1 - num2);
        break;
      case "*":
        System.out.println(num1 * num2);
        break;
      case "/":
        System.out.println(num1 / num2);
        break;
      case "%":
        System.out.println(num1 % num2);
        break;
    }
  }
}
