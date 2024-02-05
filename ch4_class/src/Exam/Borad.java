package Exam;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Borad {

  // 게시글 번호, 제목, 내용, 작성자, 작성날짜, 수정날짜

  private int boardNo; //게시글 번호
  private String boardname; //제목
  private String boardmain; // 내용
  private String boardid; // 작성자
  private LocalDateTime reDate; // 작성날짜
  private LocalDateTime lastModifedDate; // 수정날짜

  public Borad() {}

  public Borad(
    int boardNo,
    String boardname,
    String boardmain,
    String boardid
  ) {
    this.boardNo = boardNo;
    this.boardname = boardname;
    this.boardmain = boardmain;
    this.boardid = boardid;
  }
}
