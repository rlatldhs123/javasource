package Exam;

public class Equation {

  public static void main(String[] args) {
    // 4X  +  5Y = 60 모든 해 구하기
    //단 X, y 는 10이하의 자연수

    int X = 1;
    int Y = 1;

    for (int i = X; i < 11; i++) {
      for (int j = Y; j < 11; j++) {
        if (4 * i + 5 * j == 60) {
          System.out.printf("X=%d    Y=%d", i, j);
        }
      }
    }
  }
}
