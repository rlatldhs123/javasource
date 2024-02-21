package generics;

// Generics (지네릭스)
// 다양한 타입의 객체들을 다루는 메소드나 컬렉션 크래스 컴파일 시 타입체크를 해주는 기능
// 장점
//
// 1.) 타입 안정성 제공
// 2.) 타입체크와 형변환 생략 가능하므로 코드간결

public class Box2<T> {

  private T item;

  // Object 선언시 모든 클래스의 부모인 클래스이기에 아무 타입이나 전부 담을 수 있다 모든 객체의 부모

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  } // 지네릭스 적용 코드 Object 로 타입을 지정한 타입을  T 로 바꾼다
}
