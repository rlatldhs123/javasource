package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx14 {

  public static void main(String[] args) {
    //  1차원 배열 - 사용자의 입력 값으로 배열 초기화

    int arr1[] = new int[5];

    Scanner sc = new Scanner(System.in); // 스캐너 구문

    for (int i = 0; i < arr1.length; i++) { // 배열 길이만큼 반복
      System.out.println("숫자입력"); // 숫자입력을 표현하기 위한 프린트 구문

      int num = sc.nextInt(); // 입력 값

      arr1[i] = num; // 내가 입력한 값으로 숫자가 들어감
    }

    System.out.println("배열 요소 값" + Arrays.toString(arr1)); //  for 문이 끝난 후 배열 나열

    // 2차원 배열

    int arr2[][] = new int[2][3];

    Scanner sc1 = new Scanner(System.in); // 스캐너 구문

    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < arr2[i].length; j++) {
        System.out.println("숫자입력");
        arr2[i][j] = sc.nextInt();
      }
    }

    for (int[] is : arr2) {
      for (int num : is) {
        System.out.println(num + "\t");
      }
      System.out.println();
    }
  }
}
