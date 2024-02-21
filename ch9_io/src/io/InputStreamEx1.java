package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

// java.io.*; : io(input/output)
// 기본 input : 키보드
// 기본 outout : 화면

// 스트림 : 입출력을 수행할 떄 어느 한 쪽에서 다른 쪽으로 데이터 전달시 두 대상을 연결하는 통로 같은 개념
// 스트림은 양방향이 안된다 입력은 입력만 출력은 출력만
// 단반향만 가능 (입력, 출력 = > 2개의 스트림 필요)

// 1. 바이트 기반 스트림(문자, 이미지, 동영상, ... [모든 종류의 파일 전부 다 가능])
// InputStream in(추상 클래스) : 입력 스트림 부모
// OutputStream in(추상 클래스) : 출력 스트림 부모
// 1. 문자 기반 스트림(문자)
// Reader (추상 new 불가)
// writer (추상 new 불가)

public class InputStreamEx1 {

  public static void main(String[] args) {
    InputStream in = System.in; // System.in; 키보드로부터 받아드릴거라는 명시
    // in.read();                   : 한 바이트씩 읽어와서  int로 리턴
    // in.read(byte[] b) ;          : byte 배열로 읽어와서  int로 리턴
    // in.read(byte[], 0, 100);     :  입력 스트림에서 100byte를 읽어와서 0번 위치부터 저장
    OutputStream out = System.out;
    //
    // out.write(int);
    // out.write(byte[] b);
    // out.write(byte[] b,0,100); :

    try {
      //   // 한바이트만 입력 시
      //   int input = in.read();
      //   out.write(input);
      //   System.out.println((char) input);
      //

      // 여러바이트 입력시
      //   int input = 0;
      //   while ((input = in.read()) != -1) {
      //     out.write(input);
      //   }

      byte b[] = new byte[100];
      in.read(b);
      out.write(b);
      //   System.out.println(Arrays.toString(b));
      //

      //
      in.close();
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
