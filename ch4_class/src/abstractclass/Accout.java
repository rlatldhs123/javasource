package abstractclass;

// 추상 클래스
// 미완성 설계도 => 자식 클래스에서 완성
// 추상 클래스는 인스턴스(객체)를 생성할 수 없다

// 클래스 : 완성 설계도

public abstract class Accout {

  // 멤버 변수
  private String accountNo;

  // 생성자
  public Accout(String accountNo) {
    this.accountNo = accountNo;
  }

  // 디폴트 생성자
  public Accout() {}

  // 멤버 메소드
  public void deposit() {}

  // 추상 메소드 추상클래스와 추상 메소드는 항상 같이 존재 해야 한다
  public abstract void print();
  // 추상 메소드 특징 은  {} 가 없다

}
