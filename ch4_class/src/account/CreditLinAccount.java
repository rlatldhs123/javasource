package account;

// 은행 기능 클래스  : Account
// 은행 + 체크카드 클래스 : CheckingAccount
// 은행 + 체크카드 + 교통카드 기능도 추가 해달라고 함
// 은행 + 마이너스 통장 개념 추가
public class CreditLinAccount extends Account {

  private int creditLine; // 마이너스 한도

  public CreditLinAccount(
    String accountNo,
    String owner,
    int balance,
    int creditLine
  ) {
    super(accountNo, owner, balance);
    this.creditLine = creditLine; // 추가한건 초기화 진행
    //TODO Auto-generated constructor stub
  }

  @Override // 잔액 = 잔액 + 마이너스 한도를 더한 것
  public void withdraw(int amount) throws Exception {
    if (getBalance() + creditLine < amount) throw new Exception("인출 불가"); // 잔액 + 마이너스 한도 조건
    super.setBalance(super.getBalance() + creditLine);
    super.withdraw(amount); // 인출을 하는 메소드를 가져옴 (오버라이드)
  }
}
