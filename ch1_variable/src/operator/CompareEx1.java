package operator;

public class CompareEx1 {

  public static void main(String[] args) {
    int num1 = 10, num2 = 10;

    System.out.println(num1 == num2);
    System.out.println(num1 != num2);
    System.out.println(num1 <= num2);

    char ch1 = 'A', ch2 = 'B';

    System.out.println(ch1 == ch2);
    System.out.println(ch1 != ch2);
    System.out.println(ch1 <= ch2);

    double f1 = 0.1d;
    double d1 = 0.1d;

    System.out.printf("f1==d1 =%b\n", f1 == d1);
  }
}
