package com.project;

// 접근 제어자  -클래스 , 멤버변수 , 메소드 , 생성자 (지역변수 제외)
//
// private : 같은 클래스내에서만 접근 가능
// default : 같은 패키지내에서만 접근 가능
// public  : 접근 제한 없음
// protected :  같은 패키지 + 다른 패키지의 자손 클래스
//
//
//  대상에 따라 사용 할 수 있는 접근 제어자
//
// 클래스 - public or default
// 메소드, 멤버변수 - private, default, protected, public

// public > protected > default > private 범위가 넓은 순

public class Time {

  public int hour;
  public int minute;
  public int second;

  // 내부에서만 사용 하는 메소드
  private void print() {}

  public void setHour(int hour) {
    if (hour < 0 || hour > 23) return;
    this.hour = hour;
  }
}
