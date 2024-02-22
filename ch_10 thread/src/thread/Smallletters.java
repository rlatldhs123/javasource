package thread;

public class Smallletters implements Runnable {

  @Override
  public void run() {
    for (char ch = 'a'; ch <= 'z'; ch++) {
      System.out.println(ch + "");
    }
    // 쓰레드로 실행할 코드 작성 run() 안에
  }
}
