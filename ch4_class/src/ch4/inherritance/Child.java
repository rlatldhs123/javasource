package ch4.inherritance;

public class Child extends Parent {

  public Child(int age) {
    // 부모의 생성자 호출 해달라는 뜻(super)
    super(age);
    //TODO Auto-generated constructor stub
  }

  void paly() {
    System.out.println("play!!!");
  }

  @Override
  public void print() {
    super.print(); // 해당 유무 에 따라 super.print(); 부모  것도 출력이 되냐 안되냐가 결정

    System.out.println("내 이름은" + name + "입니다");
  }
}
// TODO Auto-generated method stub           /// <ㅡ<<< 오버라이딩 : 부모랑 똑같은 메소드를 만들어내는 것
/// 굳이 오버라이딩을 쓰는 이유 : 뜻은 비슷하나 다른 작업을 하고 싶을때 한다
/// 부모 메소드 재정의 (부모가 넘겨주는 메소드를 조금 다르게 하고 싶을떄 사용)
//  패키지 : 클래스 묶음
//           모든 클래스는 하나의 패키지에 속해야 한다
//           점을 구분자로 하여 계층 구조로 구성
//
//
//
//
//
//
// 상속은 항상 자식이 더 크다
// 상속은 항상 자식이 더 크다
// ----- 상속에서는 단일 상속만 가능하다 여러개 합치는거 불가
//
// 상속 : 기존의 클래스를 재사용하여 새로은 클래스 작성
//        적은 양의 코드로새로운 클래스를 작업 할 수 있고 코드를 공통적으로 관리 때문에
//        코드의 추가 및 변경이 용이함 = > 코드의 재사용성 증가 및 중복 제거
//        상속의 결정 시점 ==>> 설계 시점
//        모든 클래스는 Object 클래스를 상속 받음 ( 무조건 받음 )
//
//
// Parent : 부모 클래스 , 상위(super) 클래스 base 클래스
// Child  : 자식 클래스, 하위 (sub) 클래스 , 파생 클라스
// 오버라이딩 : 상속에서만 나오는 개념
// ----부모의 메소드와 동일한 시그니처(리턴타입, 메스도명 , 인자)를 가진다
// ----오버라이딩 메소드는 부모보다 접근 제한자를 좁게 가져서는 안됨
// ---- 새로운 예외를 throws 할 수 없음
