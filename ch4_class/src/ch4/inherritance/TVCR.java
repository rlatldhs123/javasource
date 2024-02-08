package ch4.inherritance;

// Tv + vcr 을 다가지고 있는 기능

// 관계 상속의 관계
//-1. 상속 2.포함 두개가 있다
// 상속은 1대1 관계밖에 되지 않기 때문

public class TVCR extends Tv {

  Vcr vcr = new Vcr();
  int counter = vcr.counter;

  // 포함의 관계로 불렀다

  void play() {
    vcr.play();
  }

  void stop() {
    vcr.stop();
  }
}
