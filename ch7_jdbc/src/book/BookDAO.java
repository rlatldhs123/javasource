package book;

import static book.JdbcUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// ~~DAO : 자바와 데이터베이스와 연결하는 객체
//         데이터베이스 담당 객체

// static{} : 클래스가 메모리에 처음 로딩될 때 한 번만 수행

public class BookDAO {

  private Connection con;
  private PreparedStatement pstmt;
  private ResultSet rs;

  //C(insert)R(select)U(update)D(delete)
  public int insert(BookDTO dto) {
    con = getConnection();
    int result = 0;
    String sql =
      "INSERT INTO BOOKTBL(code, title, writer, price) VALUES(?,?,?,?)";
    try {
      pstmt = con.prepareStatement(sql); // sql 구문 전송
      //? 처리
      pstmt.setInt(1, dto.getCode());
      pstmt.setString(2, dto.getTitle());
      pstmt.setString(3, dto.getWriter());
      pstmt.setInt(4, dto.getPrice());
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }

    return result;
  }

  public BookDTO getRow(int code) {
    // 하나만 조회
    con = getConnection();
    String sql = "SELECT * FROM BOOKTBL WHERE code=?";
    BookDTO dto = null;
    try {
      pstmt = con.prepareStatement(sql);
      // ? 처리
      pstmt.setInt(1, code);
      rs = pstmt.executeQuery();
      // rs => BookDTO 옮겨 담기
      if (rs.next()) {
        // int code1 = rs.getInt("code");
        // String title = rs.getString("title");
        // String writer = rs.getString("writer");
        // int price = rs.getInt("price");
        // dto = new BookDTO();
        // dto.setCode(code1);
        // dto.setTitle(title);
        // dto.setWriter(writer);
        // dto.setPrice(price);

        dto = new BookDTO();
        dto.setCode(rs.getInt("code"));
        dto.setTitle(rs.getString("title"));
        dto.setWriter(rs.getString("writer"));
        dto.setPrice(rs.getInt("price"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return dto;
  }

  public List<BookDTO> getRows() {
    // 여러개 조회
    con = getConnection();
    String sql = "SELECT * FROM BOOKTBL";
    List<BookDTO> list = new ArrayList<>();
    try {
      pstmt = con.prepareStatement(sql);
      rs = pstmt.executeQuery();

      while (rs.next()) {
        // 행 하나 => BookDTO 로 생성
        BookDTO dto = new BookDTO();
        dto.setCode(rs.getInt("code"));
        dto.setTitle(rs.getString("title"));
        dto.setWriter(rs.getString("writer"));
        dto.setPrice(rs.getInt("price"));
        // BookDTO 리스트에 추가
        list.add(dto);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return list;
  }

  public int update(BookDTO dto) {
    con = getConnection();
    int result = 0;
    String sql = "UPDATE BOOKTBL SET PRICE = ? WHERE CODE = ?";
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setInt(1, dto.getPrice());
      pstmt.setInt(2, dto.getCode());
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }

    return result;
  }

  public int delete(int code) {
    con = getConnection();
    int result = 0;
    String sql = "DELETE FROM BOOKTBL WHERE code=?";
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setInt(1, code);
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }
    return result;
  }
}
