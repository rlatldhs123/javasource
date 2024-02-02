package Exam;

public class Star {

  public static void main(String[] args) {
    for (int i = 5; i >= 1; i--) {
      for (int j = i; j <= 5; j++) {
        if (j < i) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
