package ch4;

public class StudentEx2 {

  public static void main(String[] args) {
    // student 객체 생성

    Student2 obj = new Student2(
      "20231212",
      "010-2222-2222",
      "김철수",
      "서울시 구로구" ///<<== 객체 생성
    );

    // obj.id = "20241223"; // The field Student2.id is not visible <= 오류가 뜸 제한이 걸려있다 이유는 private 때문
    // 외부에서 건들일 수가 없다 ( 직접 접근을 막는다) .찍어서 접근하는 것

    // 주소변경
    obj.changerAddr("서울시 중랑구"); // 위와 같이 실행 한다
    obj.setAddr("서울시 중랑구"); // set.addr 도 똑같은 역할을 한다

    // void changerAddr(String addr) {
    //     // apaqjqustn addr 의 값을 변경
    //     // 리턴 값은 없음 { 리턴 값이 없기 때문에 void 로 만듬}
    //     this.addr = addr;
    //     //리턴 값은 없음

    //  void 와 타입을 맞추지 않으면 오류가 난다
    // 주소 변경 확인
    System.out.println(obj);
    Student2 obj2 = new Student2(); //<<== new 라는 구문은 생성자를 호출 한다는 뜻
    obj2.setId("20241252");
    obj2.setHp("010-5385-9803");
    obj2.setName("박지성");
    obj2.setAddr("경기도 성남시"); // get set 생성자로 편리하게 바꿀수 있다

    Student2 obj4 = new Student2(); // 디폴트 생성자를 일단 만든다 1_

    System.out.println(obj2); // 데이터를 넣지 않았기에  null 값이 뜬다

    obj.changerHp("010-5385-9803"); // 위와 같이 실행 한다
    obj.setHp("010-5385-9803"); // 위와 같이 실행 한다

    //   void changerHp(String hp) {
    //     this.hp = hp;

    // 생성자는 멤버 변수의 값을 초기화 하는게 목적이다

    Student2 obj3 = new Student2("20231254", "김진수", "경기도 수원시");

    System.out.println(obj3); // 생성당시 hp 의 값을 넣지 않는 틀로 만들었으므로 hp 는 null 값으로 세팅
  }
}
