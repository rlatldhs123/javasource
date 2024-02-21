package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

// 2. 문자 기반 스트림(문자)
// Reader (추상 new 불가)
// writer (추상 new 불가)

//Charset 표준
// ISO-8859-1, UTF-8, UTF-16
public class ReaderEx1 {

  static Reader reader = null;
  static Writer writer = null;

  public static void main(String[] args) throws IOException {
    try {
      reader = new FileReader("c:\\temp\\file1.txt", Charset.forName("utf-8"));
      // reader.read(); : 하나의 문자 읽어오기
      // reader.read(Char[] cbuf); : 입력소스로부터 배열의 크기만큼 읽어서 배열에 저장
      // reader.read(Char[] cbuf,int off, int len); : 입력소스로부터 len (개) 만큼 읽어서 배열의 off 위치에 저장
      writer = new FileWriter("c:\\temp\\test1.txt");
      // writer.write(String str);
      // writer.write(int ch);
      // writer.writer(char[] cbuf);

      int data = 0;
      char[] cbuf = new char[1024];
      byte[] by = new byte[1024]; // 바이트 배열 생성
      try {
        while ((data = reader.read()) != -1) {
          //   System.out.print((char) data);
          writer.write(new String(cbuf)); // 캐릭터 배열을 스트링으로 바꾸는 법

          writer.write(new String(by));
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
      // 파일 읽어오기
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      reader.close();
      writer.close();
    }
  }
}
