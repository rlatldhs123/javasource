package array;

import java.util.Scanner;

public class ArrayEx17 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 문자열 비교 == (X)
    // equals  " name".equals("name")

    String[][] words = {
      { "chair", "의자", "의자2" },
      { "computer", "컴퓨터", "컴퓨터2" },
      { "integer", "정수", "정수2" },
    };

    for (int i = 0; i < words.length; i++) {
      System.out.printf("Q %d)  %s 의 뜻은\n", (i + 1), words[i][0]);
      String answer = sc.nextLine();

      if (words[i][1].equals(answer)) {
        System.out.println("정답입니다");
      } else if (words[i][2].equals(answer)) {
        System.out.println("정답입니다2");
      } else {
        System.out.println("틀렸습니다");
      }
    }
  }
}
