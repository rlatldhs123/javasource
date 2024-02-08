package account;

public class CheckingTrafficCardAccountEx {

  public static void main(String[] args) {
    // // CheckingTrafficCardAccount checkingTrafficCardAccount = new CheckingTrafficCardAccount(
    // //   "110-11",
    // //   "김시온",
    // //   50000,
    // //   "1234",
    // //   true
    // // );

    // // try {
    // //   checkingTrafficCardAccount.payTrafficCard("1234", 3000, true);
    // // } catch (Exception e) {
    // //   // TODO Auto-generated catch block

    // //   e.printStackTrace();
    // // }
    // // System.out.println(
    // //   "현재 잔액 : " + checkingTrafficCardAccount.getBalance()
    // // );

    // // CheckingTrafficCardAccount checkingTrafficCardAccount1 = new CheckingTrafficCardAccount(
    // //   "110-12",
    // //   "김철수",
    // //   50000,
    // //   "1234",
    // //   true
    // // );

    // try {
    //   checkingTrafficCardAccount.payTrafficCard("1234", 4800, true);
    // } catch (Exception e) {
    //   // TODO Auto-generated catch block
    //   e.printStackTrace();
    // }

    // System.out.println(checkingTrafficCardAccount1.getBalance());

    CreditLinAccount creditLinAccount = new CreditLinAccount(
      "123",
      "김시온",
      10000,
      5000000
    ); // 마이너스 통장 개설 완료

    try {
      creditLinAccount.withdraw(2500000);
      System.out.println(
        creditLinAccount.getOwner() +
        " 현재 잔액" +
        creditLinAccount.getBalance()
      );
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
