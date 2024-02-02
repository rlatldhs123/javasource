package Exam;

import java.util.Scanner;

public class Bank {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean run = true;

    int balance = 0; // 잔액

    while (run) {
      System.out.println("--------------------------------------");
      System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
      System.out.println("메뉴 선택 >>   ");

      int menu = sc.nextInt();

      switch (menu) {
        case 1:
          // 예금액 입력 받은 후 잔액 추가

          System.out.print("예금액 >>>");

          balance += sc.nextInt();

          break;
        case 2:
          // 출금액 입력 받은 후 잔액 감소
          System.out.print("출금액 >>");
          balance -= sc.nextInt();

          break;
        case 3:
          // 잔액 출력

          System.out.print("잔액" + balance);

          break;
        case 4:
          // 프로그램 종료

          System.out.println("프로그램 종료");
          run = false;

          break; // 스위치 구문을 빠져나가게 하는 하지만 while 문은 빠져 나가지 못함
        default:
          break;
      }
    }
  }
}
//1 예금액을 누루면 잔액  + 예금액을 더해서 값으 ㄹ나오게 하라
// 3번을 누르면 잔고를 보이게 한다
// 2번을 누르면 출금액을 입력할 수 있게 한다 잔액 - 출금이 나오게 한다
// 4번을 누르기 전까지는 프로그램이 유지되게 한다
