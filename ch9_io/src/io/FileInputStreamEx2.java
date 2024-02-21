package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamEx2 {

  public static void main(String[] args) {
    // InputStream in = null; // 오른쪽은 연결할 대상
    // OutputStream out = null;

    // io 를 이용해서 연결하는법

    // try {
    //   in = new FileInputStream(new File("c:\\temp\\wallpapers.jpg"));
    //   //   out = System.out; // 화면이랑 연결
    //   out = new FileOutputStream("c:\\temp\\wallpapers_copy.jpg"); // 카피 파일본 하나게 생김 복붙 개념
    //   int data = 0;
    //   byte b[] = new byte[1024];
    //   while ((data = in.read(b)) != -1) {
    //     out.write(b);
    //   }
    // } catch (FileNotFoundException e) {
    //   e.printStackTrace();
    // } catch (IOException e) {
    //   e.printStackTrace();
    // } finally {
    //   try {
    //     in.close();
    //     out.close();
    //   } catch (IOException e) {
    //     e.printStackTrace();
    //   }
    // }

    //
    //
    //  InputStream in = null; // 오른쪽은 연결할 대상
    //   OutputStream out = null;
    //
    //
    //
    //
    //try 옆에 괄호가 들어오면 : try -with - resource 닫아야 할 자원들을 선언하면 자동으로 닫아줌
    try (
      InputStream in = new FileInputStream(
        new File("c:\\temp\\wallpapers.jpg")
      );
    ) {
      OutputStream out = new FileOutputStream("c:\\temp\\wallpapers_copy.jpg");

      //   out = System.out; // 화면이랑 연결
      // 카피 파일본 하나게 생김 복붙 개념
      int data = 0;
      byte b[] = new byte[1024];
      while ((data = in.read(b)) != -1) {
        out.write(b);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
