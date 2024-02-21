package io;

import java.io.File;
import java.io.IOException;

// java.io.File; 파일과 디렉토리를 다룰 수 있음
// 경로 구분자 : 윈도우는 => \, 유닉스(리눅스) => /
// \t, \n 역 슬래쉬만 사용 불가 = > 그래서  역슬래쉬  2개 \\
// 자바에서 이미 \t, \n 등등이 정해져 있다 그래서 못씀

public class FileEx1 {

  public static void main(String[] args) {
    //File 객체 생성

    File f1 = new File("c:\\temp\\test1.txt");
    File f2 = new File("c:\\temp", "test1.txt");

    File dir = new File("c:\\temp\\");
    File f3 = new File(dir, "Test.txt");

    String fileName = f1.getName();
    int pos = fileName.lastIndexOf(".");

    System.out.println("경로를 제외한 파일명" + f1.getName());
    System.out.println("확장자를 제외한 파일명" + fileName.substring(0, pos));
    System.out.println("확장자" + fileName.substring(pos + 1));
    // 경로에 관련한 메소드
    System.out.println("경로를 포함한 파일명" + f1.getPath());
    System.out.println("파일의 절대 경로" + f1.getAbsolutePath());
    try {
      System.out.println("파일의 정규 경로" + f1.getCanonicalPath());
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("파일이 속해 있는 디렉토리" + f1.getParent());
    System.out.println();
    System.out.println();
    System.out.println();

    // 경로 구분자
    // pathSeparator : 세미콜론
    System.out.println("File.pathSeparator" + File.pathSeparator);
    System.out.println("File.pathSeparatorChar" + File.pathSeparatorChar);
    // File.separato : 역슬래시
    System.out.println("File.separator" + File.separator);
    System.out.println("File.separatorChar" + File.separatorChar);
    System.out.println();
    // user.dir : 현재 작업 디렉토리
    System.out.println("user.dlr=" + System.getProperty("user.dir"));
  }
}
