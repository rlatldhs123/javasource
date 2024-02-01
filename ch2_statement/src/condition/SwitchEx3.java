package condition;

import java.net.Socket;
import java.util.Scanner;

public class SwitchEx3 {

  public static void main(String[] args) {
    // 가위 = 1 , 바위 = 2 , 보 = 3

    // 컴퓨터의 숫자를 하나를 임의로 결정 1~3부터

    int com = ((int) (Math.random() * 3) + 1);

    // 사용자의 숫자

    System.out.print(" 가위(1), 바위(2), 보 (3) 중 하나를 입력하세요>>>>>");

    Scanner sc = new Scanner(System.in);
    int user = sc.nextInt();

    // com :2  user:1 당신이 졌습니다
    // com :2  user:3 당신이 졌습니다
    // com :2  user:2 당신이 비겼습니다

    switch (com - user) {
      case -2: // 가위 vs 보
      case 0: // 가위 vs 가위
      case -1: // 가위 vs 주먹
      case 1: // 주먹 vs 가
      case 2: // 보 vs 가위
        System.out.printf("당신이 졌습니다", -2);
        System.out.printf("당신이 비겼습니다", 0);
        System.out.printf("당신이 이겼습니다", -1);
        System.out.printf("당신이 졌습니다", 1);
        System.out.printf("당신이 이겼습니다", 2);

        break;
      default:
        break;
    }
  }
}
