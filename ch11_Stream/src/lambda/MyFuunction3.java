package lambda;

// 함수형 인터페이스
// 람다식을 포함할 수 있음 ( 추상 메소드는 하나만 쓸 수 있다  <> 일반 인터페이스와 차이점)
// 람다식 == 익명 클래스 객체
@FunctionalInterface // 함수형 인터페이스를 하기 위한 장치
public interface MyFuunction3 {
  int metod(int x, int y); // 인터페이스에 들어오는 메소드는 public abstract 이 들어와 있는 상태
  // void print();

}
