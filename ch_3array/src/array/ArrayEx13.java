package array;

public class ArrayEx13 {

  public static void main(String[] args) {
    //  2차원 배열

    int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } }; // 2행 3열
    int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } }; // 2행 3열 // \이미 정해져 있다면 new int (타입) 생략가능

    int sum = 0;

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[i].length; j++) {
        System.out.println(arr[i][j] + "\t");

        sum += arr1[i][j];
      }

      System.out.println();
    }

    System.out.println("배열 합" + sum);
  }
}
