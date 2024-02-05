package array;

import java.util.Scanner;

public class ArrayEx18 {

  public static void main(String[] args) {
    // 홍팍이는 매일 0.231kg씩 살이 찐다. 현재 체중이 72.4kg 일 때, 150일 후의 몸무게를 출력하도록 weight() 메소드를 완성하고, 적절한 입력값을 통해 출력 예와 같은 결과를 얻으시오.

    // 입력 예
    // 현재 몸무게를 W, 일자 수를 N이라 할 때, W N의 형식으로 입력. 아래는 입력 예는 72.4kg의 5개월 후를 의미한다.
    double hong = 72.4;
    Scanner sc = new Scanner(System.in);

    System.out.println("날짜를 입력하세요");
    int numofdate = sc.nextInt();

    for (int i = 0; i <= numofdate; i++) {
      hong += 0.231;
    }
    System.out.println(hong); // my
  }
}
