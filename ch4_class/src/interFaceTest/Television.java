package interFaceTest;

public class Television implements RemoteControl {

  private int volume;

  @Override
  public void turnON() {
    System.out.println("티비를 켭니다");
  }

  @Override
  public void turnOff() {
    System.out.println("티비를 끕니다");
  }

  @Override
  public void setVolume(int volume) {
    if (volume > RemoteControl.MAX_Volume) {
      this.volume = RemoteControl.MAX_Volume;
    } else if (volume < RemoteControl.MIN_Volume) {
      this.volume = RemoteControl.MIN_Volume;
    } else {
      this.volume = volume;
    }
    System.out.println("현재  tv 볼륨" + this.volume);
  }
}
