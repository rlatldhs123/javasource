package interFaceTest;

public class RemoteEx {

  public static void main(String[] args) {
    Television tv = new Television(); // 왼쪽 오른쪽이 똑같은 경우
    tv.turnON();
    tv.setVolume(9);
    tv.turnOff();

    Audio audio = new Audio();

    audio.turnON();
    audio.setVolume(8);
    audio.turnOff();

    exec(new Television());
    exec(new Audio());
  }

  public static void exec(RemoteControl rc) {
    rc.turnON();
    rc.setVolume(8);
    rc.turnOff();
  }
}
