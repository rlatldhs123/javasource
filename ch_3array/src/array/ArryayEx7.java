package array;

import java.util.Arrays;

public class ArryayEx7 {

  public static void main(String[] args) {
    int numArr[] = new int[10];

    for (int i = 0; i < numArr.length; i++) {
      numArr[i] = i;
    }
    System.out.println(Arrays.toString(numArr));

    // 무작위로 숫자의 자리를 임의 배치 하려고 함

    for (int i = 0; i < 100; i++) {
      // 0~9 임의의 숫자 추출
      int pos = (int) (Math.random() * 10);

      int temp = numArr[0];
      numArr[0] = numArr[pos];
      numArr[pos] = temp;
      // 서로 교환하는 방법

    }
    System.out.println(Arrays.toString(numArr));
  }
}
