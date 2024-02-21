package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamEx1 {

  public static void main(String[] args) {
    InputStream in = null; // 오른쪽은 연결할 대상
    OutputStream out = null;

    // io 를 이용해서 연결하는법

    try {
      in = new FileInputStream(new File("c:\\temp\\file1.txt"));
      //   out = System.out; // 화면이랑 연결
      out = new FileOutputStream("c:\\temp\\file1_copy.txt"); // 카피 파일본 하나게 생김 복붙 개념
      int data = 0;
      byte b[] = new byte[1024];
      while ((data = in.read(b)) != -1) {
        out.write(b);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        in.close();
        out.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
