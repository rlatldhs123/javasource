package ch4;

public class TvEx {

  public static void main(String[] args) {
    Tv tv = new Tv("balck", 3, true); // 생성자 호출 // Tv (){}

    // System.out.println(tv.color); //null (초기값)
    // System.out.println(tv.power); // flase ( 초기값)
    // System.out.println(tv.channel); // 0 ( 초기값)

    // // 멤버변수 초기값

    // // String : null
    // // int,long : 0
    // // float, double : 0.0
    // // char : ' '
    // // boolean : false

    // tv.channel = 20;
    // tv.color = "black";
    // tv.power = true;

    tv.channelUp();
    tv.channelUp();
    tv.channelUp();
    tv.channelUp();
    tv.channelUp();
    tv.channelUp();
    tv.channelUp();
    tv.channelUp();

    System.out.println("현재 채널" + tv.getChannel());
    // System.out.println("현재 채널 " + tv.channel);
    // // 채널 번호 직접 입력

    tv.setChannel(45);
    System.out.println("현재 채널" + tv.getChannel());

    tv.setPower(true);

    System.out.println("전원상태" + tv.isPower());
  }
}
