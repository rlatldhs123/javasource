package account;

public class BonusPointAccount extends Account {

  private int bonus;

  public BonusPointAccount(
    String accountNo,
    String owner,
    int balance,
    int bonus
  ) {
    super(accountNo, owner, balance);
    this.bonus = bonus;
  }

  @Override
  public void deposit(int amount) {
    super.deposit(amount);
    this.bonus += (int) (amount * 0.001);
  }

  public int getBonus() {
    return bonus;
  }
}
