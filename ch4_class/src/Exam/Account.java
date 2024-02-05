package Exam;

public class Account {

  // 속성 게좌번호, 은행사, 잔액,

  private String accountnum;
  private String bank;
  private int accountmoney;
  private String accountowner;

  public Account() {}

  public Account(String accountnum, String bank, int accountmoney) {
    this.accountnum = accountnum;
    this.bank = bank;
    this.accountmoney = accountmoney;
    this.accountowner = accountowner;
  }
}
