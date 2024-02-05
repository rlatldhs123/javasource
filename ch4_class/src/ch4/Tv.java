package ch4;

public class Tv {

  // 색상, 전원상태, 채널, 볼륨, 크기, 제조사....

  String color; // 색상
  int channel; // 채널
  boolean power; // 전원상태

  //  가지고 있는 멤버변수의 값을 변경하고 싶다면 메소드

  void channelDown() {
    channel--;
  }

  void channelUp() {
    channel += 3;
    //  생성자
    // Tv (){}

    // 클래스 : 설계도
    // 객체 : 설계도를 통해서 만든 실제 존재

  }
}
