package Loop;

public class ForEx4 {

  public static void main(String[] args) {
    // 5행  10열의 별

    //1) int i = 1;
    //2) i < 6;
    //3)
    for (int i = 1; i < 6; i++) {
      for (int j = 1; j < 11; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 1; i < 10; i++) {
      for (int j = 0; j < args.length; j++) {}
    }
  }
}
