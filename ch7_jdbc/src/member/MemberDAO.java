package member;

import static member.JdbcUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

  private Connection con;
  private PreparedStatement pstmt;
  private ResultSet rs;
  private MemberDTO dto;

  public int insert(MemberDTO dto) {
    //

    String sql = "INSERT INTO MEMBERTBL m (userid,password,name,email) ";
    sql += "VALUES (?,?,?,?)";

    int result = 0;
    con = getConnection();
    try {
      pstmt = con.prepareStatement(sql);
      // ? 처리
      pstmt.setString(1, dto.getUserId());
      pstmt.setString(2, dto.getPassword());
      pstmt.setString(3, dto.getName());
      pstmt.setString(4, dto.getEmail());
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt); // 자원 닫아 주기
    } //sql 구문 전송
    return result;
  }

  public MemberDTO getRow(MemberDTO dto) {
    con = getConnection();
    MemberDTO memberDTO = null;

    // 개별 회원 조회
    String sql = "SELECT * FROM MEMBERTBL WHERE USERId = ? AND PASSWORD = ?";

    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, dto.getUserId());
      pstmt.setString(2, dto.getPassword());
      rs = pstmt.executeQuery();
      if (rs.next()) {
        memberDTO = new MemberDTO();
        memberDTO.setUserId(rs.getString("userid"));
        memberDTO.setPassword(rs.getString("password"));
        memberDTO.setName(rs.getString("name"));
        memberDTO.setEmail(rs.getString("email"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return memberDTO;
  }

  //   public MemberDTO getRow(MemberDTO dto) {
  //     con = getConnection();
  //     MemberDTO memberDTO = null;

  //     // 개별 회원 조회
  //     String sql = "SELECT * FROM MEMBERTBL WHERE USERID = ? AND PASSWORD = ?";

  //     try {
  //       pstmt = con.prepareStatement(sql);
  //       pstmt.setString(1, dto.getUserId());
  //       pstmt.setString(2, dto.getPassword());
  //       rs = pstmt.executeQuery();
  //       if (rs.next()) {
  //         memberDTO = new MemberDTO();
  //         memberDTO.setUserId(rs.getString("userid"));
  //         memberDTO.setPassword(rs.getString("password"));
  //         memberDTO.setName(rs.getString("name"));
  //         memberDTO.setEmail(rs.getString("email"));
  //       }
  //     } catch (SQLException e) {
  //       e.printStackTrace();
  //     } finally {
  //       close(con, pstmt, rs);
  //     }
  //     return memberDTO;
  //   }

  public List<MemberDTO> getRows() {
    // 전체 회원 조회

    // 1. 실행 할 sql 구문 작성
    // insert, update, delete = > executeUpdate() = > 리턴 타입 int
    // select
    // 1). 결과 값이 하나라면 : executeQuery() = > ~~DTO
    // 2). 결과 값이 여러개라면 : List<~~ DTO> 이건 고정 양식이다

    List<MemberDTO> list = new ArrayList<>();
    con = getConnection();
    String sql = "SELECT  * FROM MEMBERTBL;"; // 명령어 오타시 특히 ";" 입력시"
    // java.sql.SQLSyntaxErrorException: ORA-00933: SQL 명령어가 올바르게 종료되지 않았습니다
    // sql 구문이 길어진다면
    try {
      pstmt = con.prepareStatement(sql);
      rs = pstmt.executeQuery();
      while (rs.next()) {
        MemberDTO mDto = new MemberDTO();
        mDto.setUserId(rs.getString("userid"));
        mDto.setPassword(rs.getString("password"));
        mDto.setName(rs.getString("name"));
        mDto.setEmail(rs.getString("email"));

        list.add(mDto);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return list;
  }

  public int update(String userid, String password) {
    String sql = "UPDATE MEMBERTBL  SET PASSWORD =? WHERE USERID  = ?";
    int result = 0;

    try {
      con = getConnection();
      pstmt = con.prepareStatement(sql);

      pstmt.setString(1, "userid");
      pstmt.setString(2, "password");
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace(); // // sql 구문전송
    } finally {
      close(con, pstmt);
    }

    return result;
  }

  public int delete(String deleteid) {
    String sql = "DELETE  FROM MEMBERTBL m  WHERE  userid = ?";

    int result = 0;

    con = getConnection();
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, dto.getUserId());
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }

    return result;
  }

  public MemberDTO getRow(String upid, String uppass) {
    
    throw new UnsupportedOperationException("Unimplemented method 'getRow'");
  }
}
