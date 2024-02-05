package Exam;

public class Member {

  // 이름 나이 적립금 직업 빔리번호 아이디

  private String id;
  private String password;
  private String name;
  private int age;
  private String job;
  private String grade = "Silver";
  private int point;

  // 이름 나이 직업 (필수) 생성자
  public Member(String id, String password, String name) {
    this.id = id;
    this.password = password;
    this.name = name;
  }

  // 이름 나이 직업  나이(선택) 직업 (선택)
  public Member(String id, String password, String name, int age, String job) {
    this.id = id;
    this.password = password;
    this.name = name;
    this.age = age;
    this.job = job;
  }
}
