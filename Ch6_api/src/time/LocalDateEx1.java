package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 날짜/ 시간 객체
// java.util 에 있는걸 쓴다
// 처음부터 제공되던 클래스 = > 단점이 존재
// 1.8 java.time 패키지 추가

public class LocalDateEx1 {

  public static void main(String[] args) {
    Date date = new Date(); // java.util
    System.out.println(date); // Thu Feb 22 14:36:53 KST 2024 (시스템 날짜를 가져옴)

    SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
    System.out.println(sdf.format(date)); // 24-02-22 형식을 지정해서 바꾸는 법

    Calendar calendar = Calendar.getInstance(); // Calender 는 new 를 쓰지 않음
    System.out.println("년도" + calendar.get(Calendar.YEAR));
    System.out.println("월(0~11), 0:1월" + calendar.get(Calendar.MONTH));
    System.out.println(
      "이 달의 몇 째 주" + calendar.get(Calendar.WEEK_OF_MONTH)
    );
    System.out.println("이 달의 몇 일" + calendar.get(Calendar.DATE));
    System.out.println("이 달의 몇 일" + calendar.get(Calendar.DAY_OF_MONTH));
    System.out.println("이 해의 몇 일" + calendar.get(Calendar.DAY_OF_YEAR));
    System.out.println(
      "시간(0~11 사이로 가져옴)" + calendar.get(Calendar.HOUR)
    );
    System.out.println(
      "하루의 몇 시간쨰(0~23 단위로 가져옴)" +
      calendar.get(Calendar.HOUR_OF_DAY)
    );
    System.out.println("몇 분" + calendar.get(Calendar.MINUTE));
    System.out.println("몇 초" + calendar.get(Calendar.SECOND));
  }
}
