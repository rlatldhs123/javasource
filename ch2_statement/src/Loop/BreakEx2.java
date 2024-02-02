package Loop;

public class BreakEx2 {

  public static void main(String[] args) {
    //break; =>> switch 구문에서 사용
    // 말그대로 멈추는 구문
    // 주사위를 굴려서 6일때만 반복문 종료

    int i = 0;

    while (true) {
      i = (int) (Math.random() * 6) + 1; // 주사위 코드

      System.out.println(i);

      if (i == 6) break;
    }

    System.out.println("종료");
  }
}
