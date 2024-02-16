package util;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenEx3 {

  public static void main(String[] args) {
    // 키보드로 문자열을 읽어서 분리하는 프로그램 작성
    // 입력) 아빠/엄마/수연/수희/수정  / 기준으로 잘라서 화면에 출력해주는 프로그램

    Scanner sc = new Scanner(System.in);

    System.out.println(" 가족이름을 입력하세요  Ex)엄마/아빠...>>>");
    String fam = sc.nextLine();

    StringTokenizer famst = new StringTokenizer(fam, "/");

    while (famst.hasMoreTokens()) {
      System.out.println(famst.nextToken());
    }
  }
}
