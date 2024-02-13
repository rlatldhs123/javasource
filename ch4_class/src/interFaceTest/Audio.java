package interFaceTest;

public class Audio implements RemoteControl {

  private int volume;

  @Override
  public void turnON() {
    System.out.println("오디오를 켭니다");
  }

  @Override
  public void turnOff() {
    System.out.println("오디오 끕니다");
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
    System.out.println("현재  오디오 볼륨" + this.volume);
  }
}
