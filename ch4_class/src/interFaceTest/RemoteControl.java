package interFaceTest;

public interface RemoteControl {
  int MAX_Volume = 10;
  int MIN_Volume = 0;

  void turnON();
  void turnOff();
  void setVolume(int volume);
}
