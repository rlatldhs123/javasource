package Exam;

public class Tryangle {

  // 밑변 높이(bassLine), 높이 ( hieght)

  private int bassLine;
  private int stochieghtkNum;

  public Tryangle() {} //defalut 생성자

  public Tryangle(int bassLine, int stochieghtkNum) {
    this.bassLine = bassLine;
    this.stochieghtkNum = stochieghtkNum;
  }

  //   메소드 삼각형의 넓이를 구하는

  //  밑변  * 높이 /2    메소드 이름  get area   소수점타입

  double getArea() {
    return bassLine * (double) stochieghtkNum / 2;
  }
}
