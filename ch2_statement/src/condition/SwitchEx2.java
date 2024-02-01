package condition;

import java.util.Scanner;

public class SwitchEx2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("월을 입력하세요");
    int month = sc.nextInt();

    switch (month) {
      case 3:
      case 4:
      case 5:
        System.out.println("현재 계절은 봄입니다");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("현재 계절은 여름입니다");
        break;
      case 9:
      case 10:
      case 11:
        System.out.println("현재 계절은 가을입니다");
        break;
      case 12:
      case 1:
      case 2:
        System.out.println("현재 계절은 겨울입니다");
        break;
      default:
        System.out.println("월을 확인해 주세요");
        break;
    }

    if (month == 3 || month == 4 || month == 5) {
      System.out.println("봄입니다");
    } else if (month == 3 || month == 4 || month == 5) {
      System.out.println("여름입니다");
    }
  }
}
