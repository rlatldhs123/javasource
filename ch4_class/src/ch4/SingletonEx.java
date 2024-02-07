package ch4;

public class SingletonEx {

  public static void main(String[] args) {
    // Singleton singleton = new Singleton(); // 기존 Singleton.java 에 생성자가
    // private 이 붙어 객체를 생성 할 수 없다

    //

    Singleton singleton = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    // static 이기에 가능하다  스태틱은
    // 클래스 이름으로 접근하다

  }
}
