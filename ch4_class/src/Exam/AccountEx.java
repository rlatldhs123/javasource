package Exam;

import java.util.Scanner;

public class AccountEx {

  public static void main(String[] args) {
    Account account = new Account("3333-10-8698692", 100000000, "김시온");

    int accountMoney = account.deposit(0);

    System.out.println("김시온계좌" + accountMoney);

    accountMoney = account.withdraw(10111); // 위에서 변수명을 선언 했기에 데이터 타입은 생략

    System.out.println("김시온 계좌 " + accountMoney);
  }
}
