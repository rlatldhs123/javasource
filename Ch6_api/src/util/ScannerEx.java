package util;

import java.util.Scanner;

// java.lang
// java.util

// java.util.Scanner : 화면, 파일, 문자열과 같은 입력 소스로부터 문자 데이터 읽어오기
// System.in : 키보드
// System.out : 화면

public class ScannerEx {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] argArr = null; // 배열 하나 선언 공간 및 값은 없다

    while (true) {
      String prompt = ">>";
      System.out.println(prompt);

      String input = sc.nextLine();

      input = input.trim(); // trim 공백제거
      // 정규식(Regular expression) : regExp 줄여서 쓴다
      argArr = input.split(" +"); // 공백+ (공백(스페이스바 한번)이 최소 1~무제한) / 모든 공백을 전부다 trim 으로 잘라서 넣어라 공백이 얼마가 들어오든 전부 잘라서 대입 하라는 뜻
      String commmand = argArr[0].trim();

      if ("".equals(commmand)) continue;
      commmand = commmand.toLowerCase();
      if (commmand.equals("q")) {
        System.exit(0);
      } else {
        for (int i = 0; i < argArr.length; i++) {
          System.out.println(argArr[i]);
        }
      }
    }
  }
}
