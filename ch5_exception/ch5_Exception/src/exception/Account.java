package exception;

public class Account {

  private int balance;

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public void withdraw(int money) throws BalancesufficienException {
    if (balance < money) {
      throw new BalancesufficienException("잔액부족");
    }
    // new Exception() : 컴파일 예외

    // new RuntimeException() : 런타임 예외
  }
}
