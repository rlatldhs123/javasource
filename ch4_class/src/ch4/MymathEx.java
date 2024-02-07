package ch4;

public class MymathEx {

  public static void main(String[] args) {
    Mymath mymath = new Mymath(15, 5); // 생성자를 주었기에 이제부터 값을 줄 수 있다
    //
    // public Mymath(long num1, long num2) {
    //     this.num1 = num1;
    //     this.num2 = num2;
    //
    //non - static 메소드 호출
    System.out.println("num1의 값 : " + mymath.getNum1());

    System.out.println("add() " + mymath.add());
    System.out.println("sub() " + mymath.subtrack());
    System.out.println("mult() " + mymath.multiply());
    System.out.println("div() " + mymath.divide());

    // static 메소드 호출

    System.out.println("static add() " + Mymath.add(300l, 200l));
    System.out.println("static sub() " + Mymath.subtrack(300l, 200l));
    System.out.println("static mult() " + Mymath.multiply(300l, 200l));
    System.out.println("static div() " + Mymath.divide(300l, 200l));

    System.out.println(mymath.getNum1());
  }
}
