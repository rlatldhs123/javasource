package lang;

import static java.lang.Math.*; // 이 한줄을 써놓으면 Math 생략가능 바로 메소드를 부를 수 있다

// math : 구성 요소가 모두 static 상태
//
public class MathEx2 {

  public static void main(String[] args) {
    System.out.println(Math.PI);
    System.out.println(Math.random() * 10);
    // math.random 은 0~1미만인 임이의 숫자  소수로 나온다는 뜻

  }
}
