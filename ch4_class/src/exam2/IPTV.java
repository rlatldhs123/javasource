package exam2;

public class IPTV extends ColorTv {

  private String ip;

  public IPTV(int size, int color, String ip) {
    super(size, color);
    this.ip = ip;
  }

  @Override
  public void printProperty() {
    System.out.printf(
      "나의 IPTV는 %s  주소의 %d  인치  %d 컬러",
      ip,
      getSize(),
      getColor()
    );
  }
}
