package ch4.inherritance;

public class DmbCellPhone extends CellPhone {

    


  
  int chanel;

  void turnOnDmb() {
    System.out.println("채널" + chanel + " 번 dmb 방송 시작");
  }

  void changeChannelDmb(int chanel) {
    this.chanel = chanel;
    System.out.println("채널" + chanel + " 번으로 변경");
  }

  void turnOfDmb() {
    System.out.println("채널" + chanel + " 번 dmb 방송 종료");
  }
}
