package thread;

public class DashThread extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 300; i++) {
      System.out.printf("%s", new String("_"));
    }
    System.out.println(
      "소요시간 2: " + (System.currentTimeMillis() - ThreadEx2.start)
    );
  }
}
