package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class IoEx {

  public static void main(String[] args) {
    try (
      Scanner sc = new Scanner(System.in);
      FileWriter fw = new FileWriter("c:\\temp\\output5.txt");
      BufferedWriter bw = new BufferedWriter(fw)
    ) {
      System.out.println("파일에 작성할 데이터를 입력하세요");
      System.out.println("Q 를 누르면 중단됩니다");

      String str = null;

      do {
        System.out.print(">> ");
        str = sc.nextLine();

        if (!str.equalsIgnoreCase("q")) {
          bw.write(str);
          bw.newLine();
        }
      } while (!str.equals("q"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
// 사용자에게 입력 받기 => q 라는 문자열이 입력되면 종료
// 받아 드린걸 파일에 쓰기 사용자에게 입력 받은 문자  FileWriter,BufferedWriter
// Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
// String str = sc.nextLine(); // 입력
// File f1 = new File("c:\\temp\\ioEx.txt"); // 파일 객체 생성
// String filename = f1.getName();
// try (FileWriter io = new FileWriter("c:\\temp\\ioEx.txt", true)) {
//   do {
//     io.write(sc.nextLine());
//   } while (!str.equals("q"));
// } catch (Exception e) {
//   e.printStackTrace();
// }
