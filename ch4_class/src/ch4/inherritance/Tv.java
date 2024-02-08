package ch4.inherritance;

public class Tv {

  private boolean power;
  private int channel;

  // 멤버변수

  public Tv(boolean power, int channel) {
    this.power = power;
    this.channel = channel;
  }

  public Tv() {}

  // 디폴트 생성자
  void power() {
    power = !power;
  }

  void channelUP() {
    channel++;
  }

  void channelDown() {
    channel--;
  }

  public boolean isPower() {
    return power;
  }

  // isPower 로 한 것은 blooean 타ㅣ입이기 때문

  public int getChannel() {
    return channel;
  }
}
