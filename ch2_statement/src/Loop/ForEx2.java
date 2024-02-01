package Loop;

public class ForEx2 {

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
      //1~10 합계 구하기

    }

    //1~10 합계 구하기

    int sum = 0;

    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    System.out.println("1~10 까지 합" + sum);

    //1 ~ 10까지 출력, 하나는 10~ 1까지 출력

    for (int i = 1, j = 10; i <= 10; i++, j--) {
      System.out.printf("%d \t %d \n", i, j);
    }

    // 구구단 출력

    for (int i = 1; i < 10; i++) {
      System.out.printf("%d * %d = %2d \n", 3, i, (3 * i));
    }
  }
}
