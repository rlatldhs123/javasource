package lang;

//java.lang.StringBuffer : mutable (변경 가능한)    클래스 ,thread-safe
//java.lang.StringBuilder : mutable (변경 가능한)    클래스
public class StringBufferEx {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    StringBuffer sb2 = new StringBuffer("Hello");
    //
    // String 버퍼를 받는 것을 하기
    // String str1 = new String(sb1);
    // String str2 = new String(sb2);

    // equals() toString()  오버라이딩 확인
    // String 으로 변환해서 equals() 사용하기

    System.out.println(sb1.equals(sb2) ? " 같음" : "다름"); // 오버라이딩이 되어있지 않아 주소비교로 나온다
    System.out.println(sb1);
  }
}
