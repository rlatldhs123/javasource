package exception;

public class BalancesufficienException extends Exception {

  // 사용자 정의 예외
  public BalancesufficienException() {
    super();
  }

  public BalancesufficienException(String message) {
    super(message);
  }
}
