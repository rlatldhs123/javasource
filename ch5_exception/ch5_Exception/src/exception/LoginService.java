package exception;

public class LoginService {

  private String id = "tldhs";
  private String pass = "tldhs123";

  // 로그인 메소드

  public void login(String id, String pass) throws NotExisitIdException {
    if (!id.equals("tldhs") || !pass.equals("tldhs123")) {
      throw new NotExisitIdException("아이디 또는 비밀번호를 확인해주세요");
    } else {
      System.out.println("로그인이 정상적으로 진행 되었습니다");
    }
  }
}
