package operator;

public class LogicalEx1 {

  public static void main(String[] args) {
    //x  는  10보다 크고 20 보다 작다

    int x = 15;

    System.out.println(x > 10 && x < 20); // 비교 연산자 이기에 true or false 로 나온다  추신 : && and 의 의미를 가진다

    int charcode = 'A';

    if ((charcode >= 65) && (charcode <= 90)) {
      System.out.println("대문자");

      // and(&&) 는 조건을 주는 앞 항과 뒤에 항이 둘다 참이여야 결과가 오류 없이 뜬다
      // or (||) 는 조건을 주는 앞 항과 뒤에 항이 둘중 하나가 참이여야 결과가 오류 없이 뜬다

      char charCode2 = 'a';

      System.out.println(charCode2 >= 'a' && charCode2 <= 'z');
    }

    // i는 2의 배수 또느 3의 배수이다

    int i = 6;

    System.out.println(i % 2 == 0 || i % 3 == 0);

    int i1 = 6;

    System.err.println((i % 2 == 0 || i % 3 == 0) && i % 6 != 0);
  }
}
