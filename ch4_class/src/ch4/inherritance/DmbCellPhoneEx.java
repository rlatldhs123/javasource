package ch4.inherritance;

public class DmbCellPhoneEx {

  public static void main(String[] args) {
    DmbCellPhone dmbCellPhone = new DmbCellPhone();

    dmbCellPhone.model = "삼성";
    dmbCellPhone.color = "balck";
    dmbCellPhone.chanel = 7;

    dmbCellPhone.turnOnDmb();
    dmbCellPhone.changeChannelDmb(14);

    dmbCellPhone.powerOn();
    dmbCellPhone.turnOnDmb();
    dmbCellPhone.changeChannelDmb(0);
    dmbCellPhone.turnOfDmb();
    dmbCellPhone.bell();
    dmbCellPhone.sendVoice ("안녕하세요");
    dmbCellPhone.receiveVoice("반갑습니다.");
    dmbCellPhone.hangUp();
  }
}
