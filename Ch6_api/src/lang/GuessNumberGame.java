package lang;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int secretNumber = random.nextInt(100) + 1; // 1부터 100까지의 임의의 숫자 선택
    int attempts = 0;
    boolean guessedCorrectly = false;

    System.out.println("1에서 100 사이의 숫자를 맞혀보세요.");

    while (!guessedCorrectly) {
      System.out.print("추측한 숫자를 입력하세요: ");
      int guess = scanner.nextInt();
      attempts++;

      if (guess < secretNumber) {
        System.out.println("입력한 숫자가 너무 작습니다.");
      } else if (guess > secretNumber) {
        System.out.println("입력한 숫자가 너무 큽니다.");
      } else {
        guessedCorrectly = true;
        System.out.println("축하합니다! 정답입니다.");
        System.out.println("시도 횟수: " + attempts);
      }
    }

    scanner.close();
  }
}
