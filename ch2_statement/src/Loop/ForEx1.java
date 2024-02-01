package Loop;

public class ForEx1 {

  public static void main(String[] args) {
    // 반복문

    // 반복문 : 어떤 작업이 반복적으로 수행 되도록  할 떄 사용
    // for , while , do-while

    //for (int i = 0; i < args.length; i++) {
    // int i = 0; 초기화(제일 처음만 실행)
    // i < args.length; 조건식(조건식이 참일 때까지만 반복)
    // i++ 증감식(반복문을 제어하는 변수의 값을 증가 혹은 감소)

    // I can do it. 5번 출력

    // System.out.println("I can do it.");
    // System.out.println("I can do it.");
    // System.out.println("I can do it.");
    // System.out.println("I can do it.");
    // System.out.println("I can do it.");

    // 1실행) int i = 0;
    // 2실행) i < 5;
    // 3실행) 반복문 안으로 진입 {} 안으로 들어감: syso 실행
    // 4실행) i++ ==> i=1
    // 5실행)  i < 5;
    // 6실행) 반복문 안으로 진입 : syso 실행
    // 7실행) i++ => i=2
    //......

    // 8실행) i++ => 5
    // 9실행) i < 5 조건이  false 가 되면 반복문은 종료

    for (int i = 0; i < 5; i++) {
      System.out.println("I can do it.");
    }

    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  }
}
