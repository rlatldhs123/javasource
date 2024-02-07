package ch4;

public class HumanEx {

  public static void main(String[] args) {
    Human human = new Human("김시온", 12, "456464", 187);

    System.out.println(human.gethieght());

    human.sethieght(150);

    System.out.println(human.gethieght());
  }
}
