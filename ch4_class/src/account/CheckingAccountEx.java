package account;

public class CheckingAccountEx {

  public static void main(String[] args) {
    CheckingAccount cAccount = new CheckingAccount(
      "220-11",
      "홍길동",
      100000,
      "111-11"
    );

    try {
      cAccount.pay("222-22", 50000);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
