package Exam;

import java.util.Scanner;

public class AccountEx2 {

  public static void main(String[] args) {
    // Account 객체를 담을 배열 생성 3개

    // 입력 받을 수 있는 코드

    Account account1[] = new Account[3]; // 계좌번호 잔액 계좌주인

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < account1.length; i++) {
      account1[i] = new Account(); // heap 을 가르키는 객체 구문 외워야 함 set 메소드를 사용하려면 필요하다

      System.out.println("계좌 번호 입력");
      String accountNum = sc.nextLine();
      account1[i].setAccountNum(accountNum);

      System.out.println("잔액 입력");
      int accountMoney = Integer.parseInt(sc.nextLine());
      account1[i].setAccountMoney(accountMoney);

      System.out.println("은행사 입력");

      String accountOwner = sc.nextLine();
      account1[i].setAccountOwner(accountOwner);
    }
  }
}
