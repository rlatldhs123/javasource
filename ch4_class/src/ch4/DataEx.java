package ch4;

public class DataEx {

  public static void main(String[] args) {
    Data d = new Data();
    //x 변수 초기화

    d.x = 15; // 초기화 진행

    // change(d.x);
    System.out.println("x의 값 " + d.x);
  }

  // 메소드를 호출 할 떄 매개변수로 지정한 값을
  //메소드의 매개변수에 복사
  // 매개변수의 타입 => 1) 기본형 2) 참조형
  // 기본형 매개변수 : 변수의 값을 읽기만 가능 // 값만 넘어감
  // 참조형 매개변수 : 변수의 값을 읽고 변경 가능 // 그 값을 읽고 원본을 수정 할 수 있음
  static void change(int x) {
    x = 20;
  }

  static void change2(Data obj) {
    obj.x = 20;
  }
}
