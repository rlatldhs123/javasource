package ch4;

public class Singleton {

  private static Singleton singleton;

  private Singleton() {} // 생성자 private 으로 인해 외부에서 사용 할 수 없다

  static Singleton getInstance() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }
}
