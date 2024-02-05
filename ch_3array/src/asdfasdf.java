import java.util.Arrays;

public class asdfasdf {

  public static void main(String[] args) {
    int num[] = { 3, 5, 2, 4, 1 }; 2 5 3 4 1   1 5 3 4 2       5  1  3 4 2      5 1 3 4 2 15342 51342 
    int temp = 0;

    for (int i = 0; i < num.length; i++) {
      for (int j = 0; j < num.length; j++) {
        if (num[j] < num[i]) {
          temp = num[j];
          num[j] = num[i];
          num[i] = temp;
        }
        System.out.println(Arrays.toString(num));
      }
    }
    System.out.println(Arrays.toString(num));
  }
}
