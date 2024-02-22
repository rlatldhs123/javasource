package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class IoEx1 {

  public static void main(String[] args) {
    try (
      Scanner sc = new Scanner(System.in);
      FileWriter fw = new FileWriter("d:\\qwer\\qwert.txt");
      BufferedWriter bw = new BufferedWriter(fw)
    ) {
      System.out.println("파일에 작성할 데이터를 입력하세요");
      System.out.println("종료를 입력하면 중단합니다");

      String str = null;
      do {
        System.out.println(" >> ");
        str = sc.nextLine();

        if (!str.equals("종료")) {
          bw.write(str); // 쓰는 구문
          bw.newLine();
        }
      } while (!str.equals("종료"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
