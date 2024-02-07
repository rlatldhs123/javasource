package Exam;

public class Account {

  // 속성 게좌번호, 은행사, 잔액,

  private String accountNum;
  //   private String bank;
  private int accountMoney;
  private String accountOwner;

  public Account() {} // 디폴트 생성자

  public Account(String accountNum, int accountMoney, String accountOwner) {
    this.accountNum = accountNum;
    this.accountMoney = accountMoney;
    this.accountOwner = accountOwner;
  }

  //  예금하다 deposit

  int deposit(int amount) {
    return accountMoney += amount;
  }

  // 출금하다  withdraw

  int withdraw(int amount) {
    return accountMoney -= amount;
  }

  //
  //
  //
  //
  //
  //

  public String getAccountNum() {
    return accountNum;
  }

  public void setAccountNum(String accountNum) {
    this.accountNum = accountNum;
  }

  public int getAccountMoney() {
    return accountMoney;
  }

  public void setAccountMoney(int accountMoney) {
    this.accountMoney = accountMoney;
  }

  public String getAccountOwner() {
    return accountOwner;
  }

  public void setAccountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
  }

  @Override
  public String toString() {
    return (
      "Account [accountNum=" +
      accountNum +
      ", accountMoney=" +
      accountMoney +
      ", accountOwner=" +
      accountOwner +
      "]"
    );
  }
}
