package array;

import java.util.Arrays;

public class ArrayEx4 {

  public static void main(String[] args) {
    // a b c d char 1차원 선언 생성

    char charr[] = { 'a', 'b', 'c', 'd' };

    System.out.println(charr);

    int intarr[] = { 78, 88, 9, 86, 55 };

    System.out.println(intarr);
    System.out.println(Arrays.toString(intarr) + " ooo");

    // 배열 복사

    // 더 큰 배열을 생성 => 기존 배열 새로운 배열에 복사

    int temp[] = new int[intarr.length * 2];

    for (int i = 0; i < intarr.length; i++) {
      temp[i] = intarr[i];
    } // 더 큰 배열을 생성 => 기존 배열 새로운 배열에 복사

    intarr = temp;
    System.out.println(Arrays.toString(intarr) + " 복사 후");
    //ArrayIndexOutOfBoundsException (배열의 범위가 잘못 지정 되어있다)
    // (배열 번호는 4번 밖에 없는데 배열의 범위를 벗어나서 지정하게 하였다)

    //문자열을 담는 배열을 설정 하고 싶을때

    String strarr[] = { "abc", "def", "hij", "apple" };

    System.out.println(strarr);
    //문자열은 바로 출력을 변수로 걸었을떄 주소가 아닌 값이 나온다

    //

  }
}
