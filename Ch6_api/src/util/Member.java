package util;

import java.util.Objects;

public class Member {

  private String id;
  private String name;

  //
  //
  //

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Member [id=" + id + ", name=" + name + "]";
  }

  @Override // 중복을 판별하기위한 이퀄즈 오버라이딩
  public boolean equals(Object obj) {
    if (obj instanceof Member) {
      Member member = (Member) obj;

      return name.equals(member.name) && id.equals(member.id);
    }

    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id); // Objects 와 Object 구분 잘하기
  }
}
