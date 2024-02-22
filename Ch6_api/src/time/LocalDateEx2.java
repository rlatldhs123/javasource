package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// java.time.LocalDate : 날짜
// java.time.LocalTime : 시간
// java.time.LocalDateTime 날짜/시간

public class LocalDateEx2 {

  public static void main(String[] args) {
    // 오늘날짜
    LocalDate today = LocalDate.now();
    // 현재시간
    LocalTime now = LocalTime.now();

    System.out.println(today); // 2024 -02 -22
    System.out.println("윤년/평년 " + today.isLeapYear());
    System.out.println(now); // 15:01:14.766612400

    // 특정 날짜 지정
    LocalDate birth = LocalDate.of(1955, 11, 30);
    LocalTime birthTime = LocalTime.of(23, 11, 30);

    // 날짜 덧셈
    System.out.println(birth.plusDays(1));

    // 날짜 뺄셈

    System.out.println(birth.plusDays(-1));
    System.out.println(birth.plusWeeks(1));
    System.out.println();

    LocalDateTime date = LocalDateTime.now();
    System.out.println(date); // 2024-02-22T15:09:49.754290700
    System.out.println(date.getHour());
    System.out.println(date.getMinute());
    System.out.println(date.getSecond());
    System.out.println(date.getYear());
    System.out.println(date.getMonth().getValue()); // getVlaue() 를 붙여야지  월을 숫자로 돌려받을 수 있다
    System.out.println(date.getDayOfMonth());
    System.out.println(date.getDayOfMonth());
  }
}
