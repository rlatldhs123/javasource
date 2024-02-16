package util;

import java.util.StringTokenizer;

// java.util.StringTokenizer : 긴 문자열을 지정된 구분자를 기준으로 토큰이라는 여러개의 문자열로 분리
//                             구분자는 단하나의 문자만 사용 가능

public class StringTokenEx {

  public static void main(String[] args) {
    String result = "100,200,300,400";

    String[] dellmiter = result.split(",");

    for (String string : dellmiter) {
      System.out.println(string);
    }

    //
    //
    // 둘다 콤마기준으로 자르는 메소드
    StringTokenizer st = new StringTokenizer("100,200,300,400", ",");

    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }
}
