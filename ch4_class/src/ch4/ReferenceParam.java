package ch4;

public class ReferenceParam {

  public static void main(String[] args) {
    int[] x = { 10 }; // 크기 1의 배열

    System.out.println("main () : x[0] = " + x[0]);
    change(x);

    System.out.println("change () 호출 후");
    System.out.println("main() : x[0] = " + x[0]);
  }

  // 참조형 타입

  public static void change(int[] x) {
    x[0] = 1000;
    System.out.println(" change () : x = " + x[0]);
  }

  public static void change2(int[] x) {
    x[0] = 1200;

    System.out.println("change () : x = " + x[0]);

    System.out.println("chnage2() 호출 후");
    System.out.println("main() : x[0]" + x[0]);
  }
}
