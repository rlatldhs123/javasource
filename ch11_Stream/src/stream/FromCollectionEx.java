package stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import lambda.Student;

public class FromCollectionEx {

  static int sum = 0;

  public static void main(String[] args) {
    List<Student> students = Arrays.asList(
      new Student("홍길동", 90, 80),
      new Student("김길동", 90, 11),
      new Student("송진호", 80, 96)
    );

    // Stream 객체 변환
    Stream<Student> stream = students.stream(); // stream  변환 우리가 만든 클래스 객체도 스트림 변환이 가능함

    stream.forEach(student ->
      System.out.println(
        student.getName() + " :" + student.getKor() + "," + student.getMath()
      )
    );
    // stream.forEach(student -> {
    //     // 처리 해야할 코드가 많은 경우 중괄호 열기
    // });

    // java.nio.file
    //  nio = io 패키지를 향상 시킴 기능이 몇개 더 추가된
    Path path = Paths.get("c:\\temp");

    try (Stream<Path> stream2 = Files.list(path)) {
      // 파일명 출력

      stream2.forEach(file -> System.out.println(file.getFileName())); // 해당 경로에 파일명 확인 해보기
    } catch (Exception e) {
      e.printStackTrace();
    }

    // 1~100까지의 합
    // int sum = 0;
    // for (int i = 1; i < 101; i++) {
    //     sum += i;
    // }
    // System.out.println("1~에서 100까지의 합" + sum);

    // stream 으로 1~100 까지의 합 구하기

    // 특정 범위의 정수를 스트림으로 생성

    IntStream.range(0, 10).forEach(i -> System.out.print(i + " ")); //0~9 까지만 나옴
    System.out.println();
    IntStream.rangeClosed(0, 10).forEach(i -> System.out.print(i + " ")); // 0~10 까지 나옴 마지막 숫자도 포함
    System.out.println("dfdf");
    IntStream.rangeClosed(1, 100).forEach(i -> sum += i); // 5050

    System.out.println("sum = " + sum);
  }
}
