package ch4;

public class Person {

  private String name; // 멤버 변수는 private으로 생성 한다

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + "]";
  }
}
//  클래스 만드는 방법 (필수)
// 프라이빗 선언
// 기본모양 겟셋
// 투스트링
