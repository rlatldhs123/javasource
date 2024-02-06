package ch4;

public class Time {

  // 멤버변수, 속성 ,필드, 인스턴스 변수 (같은 의미)
  private int hour;
  private int minute;
  private float second;

  // 시, 분, 초 는 모두0보다 크거나 같아야 한다
  // 시의 범위는  0 ~ 23
  // 분 과 초의 범위는  0~59 이다

  //
  //
  //
  // 클래스 변수
  private static String max;

  public int getHour() {
    return hour;
  }

  // 메소드 내부에 선언된 변수 : 지역 변수
  //  지역변수 : 메소드 종료 후 소멸
  //  for, if => {} 블럭 내부에 선언된 변수는 블럭을 벗어나면 소멸
  //
  // 인스턴스 변수 : 인스턴스마다 다른 값 저장 가능
  //
  //

  public void setHour(int hour) {
    if (hour < 0 || hour > 23) return; // hour 0보다 크고 23보다 작으면 return 하라
    //  타입이 void 일때 return 을 쓸 수 있다 {리턴 값이 없기 때문}
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public float getSecond() {
    return second;
  }

  public void setSecond(float second) {
    this.second = second;
  }

  @Override
  public String toString() {
    return (
      "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]"
    );
  }
}
