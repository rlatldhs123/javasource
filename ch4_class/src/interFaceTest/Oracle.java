package interFaceTest;

public class Oracle implements DateAcccessObject {

  @Override
  public void select() {
    System.out.println("Oracle db 에서 검색");
  }

  @Override
  public void insert() {
    System.out.println("Oracle db 에서 삽입");
  }

  @Override
  public void update() {
    System.out.println("Oracle db 에서 수정");
  }

  @Override
  public void delete() {
    System.out.println("Oracle db 에서 삭제");
  }
}
// DateAcccessObject 에서 받은 추상 메소드를 가공
