package Exam;

import java.util.Scanner;

public class BankApp {

  static Scanner sc = new Scanner(System.in);
  static Account accArr[] = new Account[100]; // 클래스 앞에 스태틱이 붙으면 클래스 변수

  public static void main(String[] args) {
    boolean run = true;

    while (run) {
      System.out.println("---------------------------------------");
      System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
      System.out.println("---------------------------------------");
      System.out.println("메뉴 선택 >>");
      int menu = Integer.parseInt(sc.nextLine());

      switch (menu) {
        case 1:
          createAccount();
          break;
        case 2:
          accountList();
          break;
        case 3:
          deposit();
          break;
        case 4:
          withdraw();
          break;
        case 5:
          run = false;
          break;
        default:
          break;
      }
    }
  }

  static void createAccount() {
    System.out.println("계좌번호 :");
    String accountNum = sc.nextLine();

    System.out.println("이름");
    String accountOwner = sc.nextLine();

    System.out.println("잔액");
    int accountMoney = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < accArr.length; i++) {
      if (accArr[i] == null) {
        accArr[i] = new Account(accountNum, accountMoney, accountOwner);
        System.out.println("계좌가 생성 되었습니다");
        break;
      }
    }
  }

  static void accountList() {
    for (int i = 0; i < accArr.length; i++) {
      if (accArr[i] != null) {
        System.out.println(accArr[i].toString());
      }
    }
  }

  static void deposit() {
    System.out.println("계좌 번호를 입력해주세요");
    String accountNum = sc.nextLine();

    System.out.println("예금액을 입력해주십시오");
    int amount = Integer.parseInt(sc.nextLine());

    Account account = findAccount(accountNum);
    if (account != null) {
      System.out.println("현재 잔액 : " + account.deposit(amount));
    } else {
      System.out.println("계좌를 찾을 수 없습니다.");
    }
  }

  static void withdraw() {
    System.out.println("계좌 번호를 입력해주세요");
    String accountNum = sc.nextLine();

    System.out.println("출금액을 입력해주세요");
    int amount = Integer.parseInt(sc.nextLine());

    Account account = findAccount(accountNum);
    if (account != null) {
      System.out.println("현재 잔액 : " + account.withdraw(amount));
    } else {
      System.out.println("계좌를 찾을 수 없습니다.");
    }
  }

  static Account findAccount(String accountNum) {
    for (Account account : accArr) {
      if (account != null && account.getAccountNum().equals(accountNum)) {
        return account;
      }
    }
    return null;
  }
}
