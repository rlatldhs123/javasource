package interFaceTest;

public class SoundableEx {

  public static void main(String[] args) {
    // printSound(new Cat());
    Cat cat = new Cat(); // 위와 같은 코드이다
    printSound(new Dog());
  }

  public static void printSound(Soundable soundable) {
    System.out.println(soundable.sound());
  }
}
