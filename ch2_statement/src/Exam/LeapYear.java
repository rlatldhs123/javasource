package Exam;

import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {
    // 연도를 입력 받은 후
    // 윤년인지 평년인지 출력
    // 윤년의 기준은 해당연도를 4를 나눈 나머지가 0과 같고 , 100으로 나눈 나머지가 0이 아니거나
    // 400 으로 나눈 나머지가 윤년
    System.out.print(" 연도를 입력하세요");
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println("윤년입니다");
    } else {
      System.out.println("평년입니다");
    }
  }
}
