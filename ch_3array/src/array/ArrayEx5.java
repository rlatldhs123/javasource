package array;

import java.util.Arrays;

public class ArrayEx5 {

  public static void main(String[] args) {
    // 배열명 arr 선언 , 생성

    // 숫자 12345 담기

    int arr[] = { 1, 2, 3, 4, 5 };

    // 기존 배열의 arr 크기의 2배를 가지는 새로운 배열 생성

    // 배열이름은 tmp 로 생성

    int tmp[] = new int[arr.length * 2];

    for (int i = 0; i < arr.length; i++) {
      tmp[i] = arr[i]; // 배열 복사
    }

    int tmp2[] = new int[arr.length * 2];

    System.arraycopy(arr, 2, tmp2, 5, arr.length);

    System.out.println(Arrays.toString(tmp2));
  }
}
