package ch4.inherritance;

public class Child2 extends Parent {

  public Child2(int age) {
    super(age); // 부모의 생성자 호출 해달라는 뜻(super)
    //TODO Auto-generated constructor stub
  }

  public void age() {
    System.out.println();
  }
  // 2명의 자식이 생긴 개념
  // 부모만 같을 뿐 자식끼리는 연관 성이 없다

}
