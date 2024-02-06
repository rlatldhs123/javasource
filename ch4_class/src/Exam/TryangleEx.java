package Exam;

import java.util.Scanner;

public class TryangleEx {

  public static void main(String[] args) {
    Tryangle tryangle = new Tryangle(10, 12);

    Scanner sc = new Scanner(System.in);

    tryangle.getArea();

    double getArea = tryangle.getArea(); // 해당 메소드를 메인에서 변수를 타입에 맞춰 변수를 지정해야한다

    System.out.println("삼각형 넓이" + getArea);
  }
}
