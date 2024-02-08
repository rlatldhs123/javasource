package ch4.inherritance;

public class CaptionTv extends Tv {

  // CaptionTv() {super();} // 컴파일러가 자동으로 만들어 줌

  boolean caption;

  public CaptionTv(boolean power, int channel, boolean caption) {
    super(power, channel);
    this.caption = caption;
  }

  public CaptionTv(boolean caption) {
    this.caption = caption;
  }

  public int get;

  void displayCaption(String text) {
    // if (caption!= true) == if(!caption)
    //
    //
    // if (caption == true)
    if (caption) {
      System.out.println(text);
    }
  }
}
