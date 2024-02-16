package util;

import java.util.StringTokenizer;

public class StringTokenEx2 {

  public static void main(String[] args) {
    String str = "This is a test";
    // 기준을 주지 않으면 공백 하나가 기준이다 스페이스 바 한번을 기준으로 잘라줌

    StringTokenizer st = new StringTokenizer(str);
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }

    str = "x=100*(200+300)/2"; // 해당 구문을 자르려면 어떻게 해야 할까?
    //
    //
    StringTokenizer st2 = new StringTokenizer(str, "=*/+()", true);

    while (st2.hasMoreTokens()) {
      System.out.println(st2.nextToken());
    }

    str = "1,김천재,100,100|2,박수재,98,80,90|3,이자바,80,90,90";

    StringTokenizer st3 = new StringTokenizer(str, ",|");

    while (st3.hasMoreTokens()) {
      System.out.println(st3.nextToken());
    }

    System.out.println();
    st3 = new StringTokenizer(str, "|");

    while (st3.hasMoreTokens()) {
      String token = st3.nextToken(); // 1.김천재 ,100,100,100

      StringTokenizer st4 = new StringTokenizer(token, ",");
      while (st4.hasMoreTokens()) {
        System.out.println(st4.nextToken());
      }
    }
  }
}
