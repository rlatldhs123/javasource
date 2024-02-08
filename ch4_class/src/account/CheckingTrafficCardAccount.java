package account;

// 은행 기능 클래스  : Account
// 은행 + 체크카드 클래스 : CheckingAccount
//

// 은행 + 체크카드 + 교통카드 기능도 추가 해달라고 함

// 예금, 출금 기능 = 부모(Account)가 제공하고 있음
// 체크카드 기능 = Account 한테 상속 받은  ChekingAccount 한테 있음 ( pay 메소드)
// 교통비 지불한다  잔액 - 교통비 메소드 이름  >>> payTrafficCard
public class CheckingTrafficCardAccount extends CheckingAccount {

  boolean hasTrafficCard;

  public CheckingTrafficCardAccount(
    String accountNo,
    String owner,
    int balance,
    String cardNo,
    boolean hasTrafficCard
  ) {
    super(accountNo, owner, balance, cardNo);
    this.hasTrafficCard = hasTrafficCard;
    // 생성자를 생성
  }

  // cardNo 카드 와 잔액이 필요 amount 교통 카드 기능 여부

  @Override
  void pay(String cardNo, int amount) throws Exception {
    if (hasTrafficCard) {
      super.pay(cardNo, amount);
    }
  }
}
