package ch4;

public class Student2 {

  // / 멤버 변수( = 인스턴스 변수, property, 속성 , 필드) - 학생 객체가 가져야 하는 특징
  // 학번(20241011), 이름(홍길동), 주소(서울시 종로구), 주민번호(071215 - 2011237). 핸드폰(010-1234-1234)
  //

  private String id; // 학번
  private String name; // 이름
  private String addr; // 주소
  private String hp; // 핸드폰번호

  // 멤버 메소드(= 인스턴스 메소드,기능,동작) - //
  //  속성을 변경시킬 수 있도록 메소드 작성
  // 메소드 작성 규칙
  // 타입

  void changerAddr(String addr) {
    // apaqjqustn addr 의 값을 변경
    // 리턴 값은 없음 { 리턴 값이 없기 때문에 void 로 만듬}
    this.addr = addr;
    //리턴 값은 없음

  }

  void changerHp(String hp) {
    this.hp = hp;
  }

  // 생성자 ( constructor) << == 멤버 변수 초기화가 목적이다 (초기화를 하지 않으면 기본 값으로 셋팅이 된다)
  // 클래스를 객체로 생성할 때 필수로 필요
  //    클래스는 한번만 만들어 놓으면 재사용의 개념이 적용

  Student2() {} // <<<=== 생성자 이걸로 만들면 기본 값이 들어간다  (null)

  //클래스는 여러개의 객체를 생성 할 수 있으나 () 안은 달라야 한다

  // 메인이 있는 메소드만 run 이 가능

  public Student2(String id, String name, String addr) {
    this.id = id;
    this.name = name;
    this.addr = addr; // 우클릭  > 소스액션 > 제네레이터 const 로 만들기
  }

  Student2(String id, String hp, String name, String addr) {
    this.id = id;
    this.name = name;
    this.addr = addr;
    this.hp = hp; // 오른쪽에 있는 것을 왼쪽에 담으라는 구문이다
  } // <<<=== 생성자 생성자는 여러개 들어 올 수 있다 (단,  괄호가 달라야 한다)

  @Override
  public String toString() {
    return (
      "Student2 [id=" +
      id +
      ", name=" +
      name +
      ", addr=" +
      addr +
      ", hp=" +
      hp +
      "]"
    );
    // 마우스 오른쪽 소스 액션  to String  (무조건 만드는 것)

  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public String getHp() {
    return hp;
  }

  public void setHp(String hp) {
    this.hp = hp;
  }
  //   하나의 생성자를 생성자를 여러개 만드는 것은 오버로딩이라고 한다

}
