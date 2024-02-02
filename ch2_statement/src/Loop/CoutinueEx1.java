package Loop;

public class CoutinueEx1 {

  public static void main(String[] args) {
    for (int i = 0; i < 101; i++) {
      if (i / 2 != 0) continue; //  continue 란 조건문에 맞는 조건을 건너띄고 나머지 루프를 수행 하는 역활이다
      //  특정 구문을 실행 시키지 않게 하는 목적으로 쓰는 코드이다

      {
        System.out.println(i);
      }
    }
    System.out.println("\n\n");

    for (int i = 0; i < 10; i++) {
      if (i % 2 != 0) continue; //  continue 란 조건문에 맞는 조건을 건너띄고 나머지 루프를 수행 하는 역활이다
      //  특정 구문을 실행 시키지 않게 하는 목적으로 쓰는 코드이다 // 변수 i 를 2로 나눴을때 나머지가 0이 아닌 것들 (홀수)

      //건너뛰고 출력하라

      {
        System.out.println(i);
      }
    }
  }
}
