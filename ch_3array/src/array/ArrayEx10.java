package array;

import java.util.Arrays;

public class ArrayEx10 {

  public static void main(String[] args) {
    int arr[] = { 5, 2, 1, 3, 4 };
    int temp = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] > arr[i]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
    // 자바가 제공하는  sort
    // Arrays.sort(arr);  = 오름자순 sort [배열 정렬]
  }
}
