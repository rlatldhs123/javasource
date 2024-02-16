package lang;

// 기본형 값을들 객체로 사용할 떄가 있음

//
// java.lang.Byte == > Byte의 객체
// java.lang.Short == > Short 객체
// java.lang.Character == > Character 객체
// java.lang.Integer == > Integer 객체
// java.lang.Long == > Long 객체
// java.lang.Float == > Float 객체
// java.lang.Double == > Double 객체
// java.lang.Boolean == > Boolean 객체

// 위 것들을   "Wrapper" 클래스라 통칭한다

public class WrapperEx {

  public static void main(String[] args) {
    int i = 10;

    Integer i2 = 10;
    Integer i3 = Integer.valueOf(20);

    // 객체로 지정 해놓으면 Integer 의 메소드를 불러서 사용가능

    // intValue() : Integer => int 로 전환
    int result = i2.intValue();
    int result2 = i2;
  }
}
