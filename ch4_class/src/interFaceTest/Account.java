package interFaceTest;

public interface Account {
  // accountNo; only public, static & final 만 가능 (1.8 버전부터 추가)

  // 인터페이스 는
  // 모든 멤버 변수는 public , staic, final 이어야 합니다
  // 모든 멤버 메소드는  public Abstract 임  (Abstract 은 생락가능)
  // 추상화가 높은 상태
  // 밑그림만 있는 상태
  // 인터페이스는 여러개 구현 가능하다
  // public class bonus implements Account Cheaking Account
  // public class bonus extends CreditLine implements Account , Cheaking Account 이렇게 여러개 추가도 가능

  // private String accountNo;

  public static final int SPADE = 4; // 상수(변하지 않는 수) 만 가능함

  // 인터페이스 클래스는 Abstract methods do not specify a body 메소드를 만들려고하면 이런 오류가 뜨며
  // 무조건 추상 메소드가 들어가야 한다

  public void deposit(); // 중괄호가 없으면 Abstract 이 들어가야 하지만

  // 인터페이스 함수는 무조건 추상 메소드만 들어올 수 있기에 Abstract이 생략 가능하다

  static void getCardKind() {} // 앞에 static 이 붙어 있다면 바디가{} 들어 올 수 있다

  //
  //
  //
  //

  default void getCard() {} // default 가 앞에 붙어 있다면 바디가 {} 들어올 수 있다
}
