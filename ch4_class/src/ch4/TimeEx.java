package ch4;

public class TimeEx {

  public static void main(String[] args) {
    Time time = new Time();

    time.setHour(15);
    time.setMinute(40);
    time.setSecond(11.12f);

    // 인스턴스마다 다른값 저장 가능
    // 인스턴스 변수에 소멸 시기
    // 참조변수가 없을때 가비지 컬렉터에 의해 자동 제거 됨

    Time time2 = new Time();

    time2.setHour(16);
    time2.setMinute(38);
    time2.setSecond(13.12f);
  }
}
