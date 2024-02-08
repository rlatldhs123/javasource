package account;

public class BonusPointAccountEx {

  public static void main(String[] args) {
    BonusPointAccount bonusPointAccount = new BonusPointAccount(
      "111",
      "홍길동",
      10000,
      0
    );

    bonusPointAccount.deposit(1000000);
    System.out.printf(
      "계좌 주인 = %s   %d",
      bonusPointAccount.getOwner(),
      bonusPointAccount.getBonus()
    );
  }
}
