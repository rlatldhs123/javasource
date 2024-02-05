package Exam;

public class Circle {

  // 선언된 생성자가 하나도 없다면
  // 컴파일러는 default 생성자를 만들어 줌 (중요@@)

  // 반지름 (3.5)

  private double redius;

  public Circle() {}

  public Circle(double redius) {
    this.redius = redius;
    // 반지름 * 반지름 * 3.14 결과값 리턴

  }

  double gerArea() {
    return this.redius * this.redius * 3.14;
  }
}
