package io;

import java.io.FileInputStream;

// 보조스트림 : 스트림의 기능 보완
//             데이터 입출력 기능 없음

// 1) 바이트 기반
//     BuffredInputStream / BuffredOutputStream: 버퍼를 이용햔 입출력 향상
//     DataInputStream / DataOutputStream : 기본형 단위로 데이터를 처리
//                       PrintStream : 버퍼 사용하며, print,println, printf()

// 2) 문자 기반
//     BuffredReader/ BuffredWriter: 버퍼를 이용햔 입출력 향상
//
//  브릿지 스트림
// InputStreaReader / OutputStreaReader
// 바이트 스트림 => 문자스트림    / 문자 스트림 => 바이트 스트림

public class InputStreamReader {

  public static void main(String[] args) {
    try (
      FileInputStream fis = new FileInputStream("c:\\temp\\test1.txt");
      InputStreamReader ir = new InputStreamReader(fis)
    ) {
      int data = 0;
    //   byte b[] = new byte[1024];
    //   while ((data = fis.read()) != -1) {
    //     System.out.println((char) data);
    //   }

    char cbuf[] = new char[1024];
    while (data = ir.) {
        
    }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
