package Loop;

public class BreakEx1 {

  public static void main(String[] args) {
    //break; =>> switch 구문에서 사용
    // 말그대로 멈추는 구문

    int sum = 0, i = 0;

    while (true) {
      if (sum > 100) break; // break 의 역할은 본인이 속해 있는 반복문을 탈출 할수 있게 해주는 구문이다
      ++i;
      sum += i;
    }

    System.out.printf("I=%d , sum=%d\n  ", i, sum);
  }
}
