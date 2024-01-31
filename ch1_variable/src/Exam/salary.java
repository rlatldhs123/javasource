package Exam;

import java.util.Scanner;

public class salary {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("월급 입력");
    int salary = sc.nextInt();

    int deposit = salary * 12 * 10;

    System.out.printf("입력한 숫자 %d");

    System.out.println("10년 저축 금액" + deposit);
    //10 년 저축 금액
  }
}
