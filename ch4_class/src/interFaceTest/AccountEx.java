package interFaceTest;

public class AccountEx {

  public static void main(String[] args) {
    // 인스턴스 생성 불가
    // Account account = new Account();

    Account account = new CheakingAccount();
    // 왼쪽부모 오른쪽 자식으로는 상속과 마찬가지로
    // 똑같이 쓸 수 있다
  }
}
