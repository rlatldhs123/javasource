package ch4.inherritance;

public class CaptionTvEx {

  public static void main(String[] args) {
    CaptionTv cTv = new CaptionTv(false, 10, false);

    cTv.get = 10;
    cTv.channelUP();
    System.out.println("현재 채널 + " + cTv.getChannel());
    cTv.displayCaption("hello World");
    cTv.caption = true;
    cTv.displayCaption("hello World");
  }
}
