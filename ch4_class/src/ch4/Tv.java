package ch4;

public class Tv {

  // 색상, 전원상태, 채널, 볼륨, 크기, 제조사....

  private String color; // 색상
  private int channel; // 채널
  private boolean power; // 전원상태

  //  가지고 있는 멤버변수의 값을 변경하고 싶다면 메소드

  void channelDown() {
    channel--;
  }

  void channelUp() {
    channel++;
    //  생성자
    // Tv (){}
    // 생성자 오버로딩 (중요)

    // 클래스 : 설계도
    // 객체 : 설계도를 통해서 만든 실제 존재

  }

  public Tv() {}

  public Tv(String color, int channel, boolean power) { //  로컬변수
    this.color = color;
    this.channel = channel;
    this.power = power;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) {
    this.channel = channel;
  }

  public boolean isPower() {
    return power;
  }

  public void setPower(boolean power) {
    this.power = power;
  }
  //
}
