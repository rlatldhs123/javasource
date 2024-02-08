package account;

// 기존 은행 기능 + 체크카트 기능을 추가 요청  이때 상속 기능을 활용 (재사용)
public class CheckingAccount extends Account {

  public String cardNo;

  public CheckingAccount(
    String accountNo,
    String owner,
    int balance,
    String cardNo
  ) {
    super(accountNo, owner, balance);
    this.cardNo = cardNo; // 내꺼의 생성자가 필요
    //TODO Auto-generated constructor stub
  } // super 가 필요함

  //pay (String cardNo , int amount) 2개의 타입을 받을 메소드를 만들어보자
  //카드 번호가 일치하는지 확인  cardNo 사용 금액이 잔액보다 적은지도 확인
  // 일치 하지 않으면 지불불가 메세지 출력
  // 일치하고  금액이 작으면 잔액 - 사용금액 출력

  void pay(String cardNo, int amount) throws Exception {
    if (!this.cardNo.equals(cardNo) || getBalance() < amount) {
      throw new Exception("지불 불가");
    }
    // 잔액 = 잔액 = 사용액
    withdraw(amount);
  }
}
