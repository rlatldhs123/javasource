package exception;

import java.util.Scanner;

public class LoginEx {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LoginService loginService = new LoginService();

    System.out.println("id 를 입력해주세요 : ");

    String id = sc.nextLine();
    // 사용자  id  를 입력 받는다

    System.out.println("비밀번호를 입력해주세요 :");

    String pass = sc.nextLine();

    try {
      loginService.login(id, pass);
    } catch (NotExisitIdException e) {
      e.printStackTrace();
    }

    sc.close();
  }
}
