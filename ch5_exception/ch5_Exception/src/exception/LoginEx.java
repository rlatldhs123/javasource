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
        login(id, pass);
    } catch (NotExisitIdException | WrongPasswordException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    sc.close();
  }


  public static void login(String id, String pass) throws NotExisitIdException, WrongPasswordException {
    if (!id.equals("tldhs") ) {
      throw new NotExisitIdException("아이디 를 확인해주세요");
    } 

    if(!pass.equals("12345")){
        throw new WrongPasswordException("비밀번호를 확인해주세요");
    }
  }
}
