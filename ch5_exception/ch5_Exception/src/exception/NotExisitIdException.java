package exception;

public class NotExisitIdException extends Exception {

  public NotExisitIdException(String message) {
    super(message); // 왜 super 가 들어가나?
  }
}
