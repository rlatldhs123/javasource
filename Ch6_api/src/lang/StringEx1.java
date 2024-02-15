package lang;

//java.lang.String : 문자열 클래스
// - 변경이 불가능(immutable)한 클래스 : 읽기만 가능한

public class StringEx1 {

  public static void main(String[] args) {
    // 인스턴스 생성

    String str = new String("abc");
    String str2 = "abc";
    String str3 = "abc";

    System.out.println(str2 == str3 ? "같음" : "다름"); // 같음
    System.out.println(str2 == str ? "같음" : "다름"); // 다름 ???!
    // 저장방식의 차이  new 를 하게되면 힙 저장공간을 만들기 때문이다
    // 여기서   == 주소비교이다 str2 와 str3 은 서로 같은 값이기 때문에
    // 주소를 하나로 묶어버린다
    // 그래서 문자열 비교는 무조건 equlas 를 쓴다

    System.out.println("띄어쓰기");

    // String 클래스가 equals 를  오버라이딩 해놓았다 : 값 비교

    System.out.println(str2.equals(str3) ? "같음" : "다름"); // 같음
    System.out.println(str2.equals(str) ? "같음" : "다름"); // 같음

    String a = "a";
    String b = "b";
    a = a + b; // 문자열 결합횟수 많다면  효율성이 떨어질 수 있음 => StringBuffer , StringBuolder 클래스 사용

    for (int i = 0; i < 10; i++) {
      System.out.println();
    }

    String qustn1 = new String("abc");
    String qustn2 = "abc";
    String qustn3 = "abc";

    System.out.println(qustn1 == qustn2 ? "같음" : "다름"); //
    System.out.println(qustn2 == qustn3 ? "같음" : "다름"); //

    System.out.println(qustn1.equals(qustn2) ? "같음" : "다름");
  }
}
