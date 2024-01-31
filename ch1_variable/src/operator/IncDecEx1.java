package operator;

public class IncDecEx1 {

  public static void main(String[] args) {
    // 연산자 단항 연산자 :++, --

    //++ 는 변수+1의 증가
    //-- 는 변수-1의 감소

    int x = 10, y = 20;
    System.out.println("x = " + (x++)); // x++ = x=x; x=x+1;
    System.out.println("y = " + (y++)); // x-- = x=x; x=x-1;

    System.out.printf("x=%d, y=%d\n", x, y);

    System.out.println("x = " + (++x)); // x=x+1;
    System.out.println("y = " + (++y)); // y=y+1;
    System.out.printf("x=%d, y=%d\n", x, y);
  }
}
