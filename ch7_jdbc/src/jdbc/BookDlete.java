package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDlete {

  // update 구문과 dlete 구문 코드는 똑같다

  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement pstmt = null;

    try {
      // 1. 드라이버 로드
      Class.forName("oracle.jdbc.OracleDriver"); // 필수 구문

      // 2. 커넥션 얻기
      String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 대부분의 포트 번호는 1521 이다
      String user = "c##test2";
      String password = "test"; // 필수 구문
      con = DriverManager.getConnection(url, user, password);

      String sql = "DELETE FROM BOOKTBL b WHERE code = 1004";
      // sql 구문 전송
      pstmt = con.prepareStatement(sql);

      int result = pstmt.executeUpdate();
      if (result > 0) {
        System.out.println("삭제 성공");
      } else {
        System.out.println("삭제 실패");
      } // updeate 구문 작성// 필수 구문
    } catch (Exception e) {
      e.printStackTrace(); // 필수 구문
    } finally {
      try {
        if (pstmt != null) {
          pstmt.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
