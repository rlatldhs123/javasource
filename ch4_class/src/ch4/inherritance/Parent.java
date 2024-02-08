package ch4.inherritance;

public class Parent {

  private static int age;
  protected String name = "성춘향";

  public Parent(int age) {
    this.age = age;
  }

  public static int getAge() {
    return age;
  }

  public void print() {
    System.out.println("나이는" + age + "입니다");
  }
}
