package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Bokkselect {

  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null; // 셀렉트 할때만 필요

    try {
      // 1. 드라이버 로드
      Class.forName("oracle.jdbc.OracleDriver");

      // 2. 커넥션 얻기
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "c##test2";
      String password = "test";
      con = DriverManager.getConnection(url, user, password);

      // 3. sql 구문 작성

      //   String sql = "SELECT * FROM BOOKTBL b  WHERE code = 1000;";
      String sql = "SELECT * FROM BOOKTBL";
      // sql 구문 전송
      pstmt = con.prepareStatement(sql);
      // sql 구문 실행

      rs = pstmt.executeQuery();
      // ResultSet : sql 실행 결과가 담긴 객체 ( 테이블 모양)
      //   rs.next() : ture 일 떄 읽어올 결과가 있음
      // Ex)
      // rs.getString(컬럼번호) : 가져 올 컬럼 데이터가  varchar2 , nvarchar2 면 String 타입으로
      // rs.getString(컬렴명) :
      // rs.getInt(컬럼번호or 컬럼명) : 가져올 컬럼 데이터가  number 타입이라면 getInt 타입으로 사용
      //
      //
      //
      //   ResultSet = 자바 객체 테이블 모양
      //
      //

      // 뽑아 오기
      while (rs.next()) {
        int code = rs.getInt(1);
        String title = rs.getString(2);
        String writer = rs.getString(3);
        int price = rs.getInt(4);

        System.out.printf(" %d %s %s %d", code, title, writer, price);
        //

      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if (rs != null) rs.close();
        if (pstmt != null) pstmt.close();
        if (con != null) con.close();
        // Connection con = null;
        // PreparedStatement pstmt = null;
        // ResultSet rs = null; // 셀렉트 할때만 필요 닫아준다 마지막에

      } catch (Exception e) {}
    }
  }
}
