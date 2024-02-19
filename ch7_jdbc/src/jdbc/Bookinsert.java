package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Bookinsert {

  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement pstmt = null;

    try {
      // 1. 드라이버 로드
      Class.forName("oracle.jdbc.OracleDriver");

      // 2. 커넥션 얻기
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "c##test2";
      String password = "test";
      con = DriverManager.getConnection(url, user, password);

      // 3. sql 구문 작성 후 db 서버로 전송

      String sql =
        "INSERT INTO BOOKTBL (code,title,writer,price) values(1000,'자바 프로그래밍 입문','박은종',28500)"; // 데이터 넣기

      pstmt = con.prepareStatement(sql);

      // 4. sql 구문 실행
      // executeUpdate() - 실행할 sql 구문이 insert , update,dlete 일때 호출 ( 리턴 값 int)
      // executeQuery() - 실행할 sql 구문이 selcet 일때 호출 ( 리턴 값 Resultset)

      int result = pstmt.executeUpdate();
      // result 가  0 보다 크면 성공

      if (result > 0) {
        System.out.println("성공이요");
      } else {
        System.out.println("실패요 다시 하세요");
      }
    } catch (SQLException | ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally { // 자원 해제 con을 맨 나중에
      try {
        if (pstmt != null) {
          pstmt.close();
        }
        if (con != null) {
          con.close();
        }
      } catch (Exception e) {
        // TODO: handle exception
      }
    }
  }
}
