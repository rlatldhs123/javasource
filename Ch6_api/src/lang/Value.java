package lang;

// 모든 클래스는  object 를 상속 받은 상태이고 기본 값이다
public class Value {

  int value;

  public Value(int value) {
    this.value = value;
  }

  //obj instanceof Value = obj 가 Vlaue 객체를 가르키고 있는지 물어봄
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Value) {
      Value v = (Value) obj;
      if (this.value == v.value) {
        return true;
      }
    }
    return false;
  }

  // 멤버 변수들의 값을 출력하는 용도로 재정의를 한다 (오버라이딩)
  @Override
  public String toString() {
    return "Value [value=" + value + "]";
  }
}
