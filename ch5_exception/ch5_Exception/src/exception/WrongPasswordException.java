package exception;

import java.util.Scanner;

public class WrongPasswordException extends Exception {

  public WrongPasswordException() throws WrongPasswordException {
    super();
  }

  public WrongPasswordException(String message) {
    super(message);
  }
}
