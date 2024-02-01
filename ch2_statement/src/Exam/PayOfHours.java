package Exam;

import java.util.Scanner;

public class PayOfHours {

  public static void main(String[] args) {
    System.out.print(" 근무 시간을 입력하세요");

    Scanner sc = new Scanner(System.in);
    double PayOfHours = sc.nextDouble();
    // 근무 시간을 "입력"받은 후

    // 시간 당 9800원의  시급을 지급 하는데

    //8시간이 넘어가는 시간은  시간외 수당을 받아서

    //원래 받는 금액의 1.5 배 를 더 준다고  오늘 받을 " 일당" 이 얼마인지 계산하는 프로그램을 만들어라

    // 출력 값 : 오늘 받을 임금은  : nnnnn 입니다

    double pay = 0, rate = 9800;

    if (PayOfHours > 8) {
      System.out.println("오늘 받을 임금은", PayOfHours * rate);
    }
  }
}
