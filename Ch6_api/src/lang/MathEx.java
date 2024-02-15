package lang;

//java.lang.Math : 기본적인 수학 계산에 유용한 메소드로 구성된 클래스
// Math   메소드 ,변수 => 클래스이름 .  을 찍고 쓰면 된다
// new 를 붙혀서 쓸 필요가 없다 static 이 붙어 있기 때문
public class MathEx {

  public static void main(String[] args) {
    System.out.println(Math.PI);
    System.out.println(Math.random() * 10);
    // math.random 은 0~1미만인 임이의 숫자  소수로 나온다는 뜻
  }
}
