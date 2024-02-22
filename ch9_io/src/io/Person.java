package io;

import java.io.Serializable;

// java.io.NotSerializableException: io.Person

// 객체를 주고받을땐 클래스에 implements Serializable 를 해줘야 한다

public class Person implements Serializable {

  private String name;
  private String job;
  private transient String tel; // transient : 직렬화 대상에서 제외

  // transient :
  //

  public Person(String name, String job, String tel) {
    this.name = name;
    this.job = job;
    this.tel = tel;
  }

  //
  //

  @Override
  public String toString() {
    return "Person [name=" + name + ", job=" + job + ", tel=" + tel + "]";
  }
}
