package Exam;

public class DiceSum {

  public static void main(String[] args) {
    //주사위 2개를 굴려
    // 나오는 숫자를 (숫자 1, 숫자 2 ) 형태로 출력
    // 주사위 2개의 값의 합이 5일때 중단

    int dice1 = 1, dice2 = 1;

    while (true) {
      dice1 = (int) (Math.random() * 6) + 1; // 주사위 1
      dice2 = (int) (Math.random() * 6) + 1; // 주사위 2

      System.out.printf("(%d  ,  %d)", dice1, dice2);

      if (dice1 / dice2 == 1) break;
    }
  }
}
