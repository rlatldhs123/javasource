package array;

import java.util.Arrays;

public class ArrayEx8 {

  public static void main(String[] args) {
    // // 45개의 정수 값을 저장하기 위한 배열 새엇ㅇ

    // int numarr[] = new int[45];

    // for (int i = 0; i < numarr.length; i++) {
    //   numarr[i] = i + 1;
    // }

    // System.out.println(Arrays.toString(numarr));

    //

    int numArr[] = new int[45];

    for (int i = 0; i < numArr.length; i++) {
      numArr[i] = i += 1;
    }

    //  i : 자리를 바꿀 대상 위치 번호
    // 무작위로 숫자 0~44가 나오게

    for (int i = 0; i < 6; i++) {
      int num = (int) (Math.random() * 45); // 0번부터 44까지 숫자 나오게 하는 코드
     
      int temp = numArr[i];
      numArr[i] = numArr[num];
      numArr[num] = temp;


    System.out.println(Arrays.toString(numArr));
  }
}
