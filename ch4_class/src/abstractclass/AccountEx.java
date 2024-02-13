package abstractclass;

public class AccountEx {

  public static void main(String[] args) {
    // Accout accout = new Accout(); // Cannot instantiate = 인스턴스 생성 불가

    Accout accout = new CheckingAccount();
    //   추상 클래스는 반드시 자식이 있어야 한다 .0
  }
}
