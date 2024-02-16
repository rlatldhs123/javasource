package lang;

//java.lang.Math : 기본적인 수학 계산에 유용한 메소드로 구성된 클래스
// Math   메소드 ,변수 => 클래스이름 .  을 찍고 쓰면 된다
// new 를 붙혀서 쓸 필요가 없다 static 이 붙어 있기 때문
// java. lang  : 기본 패키지여서 import 구문이 필요 없음
//
public class MathEx {

  public static void main(String[] args) {
    System.out.println(Math.PI);
    System.out.println(Math.random() * 10);
    // math.random 은 0~1미만인 임이의 숫자  소수로 나온다는 뜻

    double val = 90.7552;
    System.out.println("round() " + Math.round(val));
    val += 100;
    System.out.println("round() " + Math.round(val));

    System.out.println("round() " + Math.round(val) / 100);

    System.out.println("round() " + Math.round(val) / 100.0);
    System.out.println();

    // ceil() : 올림
    // floor() : 버림
    // rint() : 반올림 = > double 리턴 / round() : 반올림 => long or int 리턴
    System.out.printf("cceil(%3.1f) = %3.1f\n", 1.1, Math.ceil(1.1));
    System.out.printf("floor(%3.1f) = %3.1f\n", 1.5, Math.floor(1.5));
    System.out.printf("round(%3.1f) = %d\n", 1.1, Math.round(1.1));
    System.out.printf("round(%3.1f) = %d\n", 1.5, Math.round(1.5));
    System.out.printf("rint(%3.1f) = %f\n", 1.5, Math.rint(1.5));
    System.out.printf("round(%3.1f) = %d\n", -1.5, Math.round(-1.5));
    System.out.printf("rint(%3.1f) = %f\n", -1.5, Math.rint(-1.5));
    System.out.printf("cceil(%3.1f) = %f\n", -1.5, Math.ceil(-1.5));
    System.out.printf("floor(%3.1f) = %f\n", -1.5, Math.floor(-1.5));
  }
}
