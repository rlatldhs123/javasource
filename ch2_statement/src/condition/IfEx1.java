package condition;

// 제어문 -1) 조건문 2) 반복문

// 1) 조건문 : 조건에 따라 다음 문장 수행 여부 결정
//    if, switch

public class IfEx1 {

  public static void main(String[] args) {
    // 1) 조건문 : 조건에 따라 다음 문장 수행 여부 결정
    //    if, switch

    // if (조건식) {조건식이 참일떄 수행될 문장들 나열} 조건식에는 비교 연산자 , 논리 연산자를 넣어서 처리하면 된다
    // if 다음 나오는 괄호는 무조건 true or false 로 나오는 것을 넣어야 한다

    // {} 생략 가능 => 수행할 구문이 한 개일때만 가능

    int x = 0;

    if (x == 0) {
      System.out.println("x == 0");

      if (x != 0) System.out.println("x != 0");

      if (!(x == 0)) {
        System.out.println("!(x != 0)");
      }
    }
  }
}
