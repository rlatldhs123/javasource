package thread;

public class ThreadSleepEx {

  public static void main(String[] args) {
    ThreadSleep1 th1 = new ThreadSleep1();
    ThreadSleep2 th2 = new ThreadSleep2();

    th1.start();
    th2.start();

    try {
      Thread.sleep(2000); // 일시정지 개념 밀리세컨드로 환산되어 2초 멈추는 것임
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("메인 종료");
  }
}
