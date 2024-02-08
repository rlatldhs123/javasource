//페키지 구문
package com.project.book;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

// import java.util.Scanner;

// import javax.xml.crypto.Data;

//import 구문 => 다른 패키지에 있는 클래스 사용 시

// 클래스 선언
public class Book {

  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date.toString());
    System.out.println(date);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
    System.out.println(sdf.format(date));

    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println(dateTime);

    Scanner sc = new Scanner(System.in);
  }
}
