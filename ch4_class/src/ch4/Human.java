package ch4;

public class Human {

  String name;
  int age;
  String code;
  private int hieght;

  public Human(String name, int age, String code, int hieght) {
    this.name = name;
    this.age = age;
    this.code = code;
    this.hieght = hieght;
  }

  int gethieght() {
    return hieght;
  }

  void sethieght(int height) {
    this.hieght = height;
  }
}
