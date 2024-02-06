package Exam;

public class Account {

  // 속성 게좌번호, 은행사, 잔액,

  private String accountNum;
  //   private String bank;
  private int accountMoney;
  private String accountOwner;

  public Account() {}

  public Account(String accountNum, int accountMoney, String accountOwner) {
    this.accountNum = accountNum;
    this.accountMoney = accountMoney;
    this.accountOwner = accountOwner;
  }

  //  예금하다 deposit

  int deposit(int amount) {
    accountMoney += amount;

    return accountMoney;
  }

  // 출금하다  withdraw

  int withdraw(int amount) {
    accountMoney -= amount;

    return accountMoney;
  }
}
