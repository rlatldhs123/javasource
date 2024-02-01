package condition;

import java.util.Scanner;

public class IfEx5 {

  public static void main(String[] args) {
    // 점수를 입력 받은 후 점수에 따라 출력
    // 당신의 점수는  100입니다.
    // 당신의 학점은 A+ 입니다

    // 점수가 90 이상이면 A 점수가 98 이상일떄는 A+ , 90>= 점수 <94 A- , 나머지는 A

    // 점수가 80 이상이면 B 점수가 88 이상일떄는 B+ , 90>= 점수 <94 B- , 나머지는 B
    // 그 외 점수는 모두 C

    Scanner sc = new Scanner(System.in);

    System.out.print("점수를 입력하세요");
    int score = sc.nextInt();

    if (score >= 90) {
      if (score >= 98) {
        System.out.println("당신의 점수는 A+ 입니다");
      } else if (score >= 94) {
        System.out.println("당신의 점수는 A 입니다");
      } else {
        System.out.println("당신의 점수는 A- 입니다");
      }
    }
  }
}
