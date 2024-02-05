package Exam;

public class MemverEx {

  public static void main(String[] args) {
    //  회원 객체 생성 ==> 생성자가 호출 됩니다
    // 아이디, 비밀번호,이름 필수로
    // 아이디, 비밀번호,이름 ,나이 직업

    // grade , point 마트 규칙에 따라 변경

    Member member1 = new Member("member1", "member", "홍길동");

    Member member2 = new Member("member2", "member2", "성춘향", 20, "회사원");
    // Member member3 = new Member(); {디폴트는 무조건 만드는 것이 아니다} { 디폴트가 없을 수도 있다}

  }
}
