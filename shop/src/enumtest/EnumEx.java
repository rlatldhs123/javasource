package enumtest;

import java.time.DayOfWeek;
import java.time.LocalDate;

// Week 열거형 정의
enum Week {
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY,
  SUNDAY,
}

public class EnumEx {

  public static void main(String[] args) {
    Week today = null;

    // 오늘날짜 가져오기
    LocalDate now = LocalDate.now(); // 자바에서 오늘날짜 가져오는 방법
    System.out.println(now);

    // 오늘 날짜에 맞는 숫자 리턴(1(월요일)~ 7(일요일))
    DayOfWeek dayOfWeek = now.getDayOfWeek();

    switch (dayOfWeek) {
      case MONDAY:
        today = Week.MONDAY;
        break;
      case TUESDAY:
        today = Week.TUESDAY;
        break;
      case WEDNESDAY:
        today = Week.WEDNESDAY;
        break;
      case THURSDAY:
        today = Week.THURSDAY;
        break;
      case FRIDAY:
        today = Week.FRIDAY;
        break;
      case SATURDAY:
        today = Week.SATURDAY;
        break;
      case SUNDAY:
        today = Week.SUNDAY;
        break;
      default:
        break;
    }

    System.out.println("오늘요일: " + today);

    if (today == Week.SUNDAY) {
      System.out.println("휴식을 취합니다.");
    } else {
      System.out.println("열심히 자바 공부를 합니다.");
    }
  }
}
