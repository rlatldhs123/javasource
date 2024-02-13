package interFaceTest;

public class DataEx {

  public static void main(String[] args) {
    // DateAcccessObject obj = new Oracle();

    // dbWork(obj);
    // obj = new MySql();
    // dbWork((obj)); //늘려서 하는 방식

    dbWork(new Oracle());
    dbWork(new MySql());
    // 간소화한 방식

    // 익명 클래스 구현 방법 : 1회용 클래스(선언과 생성 동시에)
    // 생성 이유는 메모리를 잡아먹기에 한번만 쓰고 버릴 용도로 쓴다
    // Oracle 이나  Mysql 처럼 따로 클래스를 만들 필요는 없다
    DateAcccessObject Object = new DateAcccessObject() {
      @Override
      public void select() {
        System.out.println("PostgreSQL 검색");
      }

      @Override
      public void insert() {
        System.out.println("PostgreSQL 삽입");
      }

      @Override
      public void update() {
        System.out.println("PostgreSQL 수정");
      }

      @Override
      public void delete() {
        System.out.println("PostgreSQL 삭제");
      }
    };

    dbWork(Object);
  }

  // 호출 방법

  public static void dbWork(DateAcccessObject dao) {
    dao.select(); // \오라클 디비에서 검색 or 마이에스큐엘 디비에서 검색 이 나오게 출력
    dao.insert(); /// \오라클 디비에서 검색 or 마이에스큐엘 디비에서 삽입 이 나오게 출력
    dao.update(); /// \오라클 디비에서 검색 or 마이에스큐엘 디비에서 수정 이 나오게 출력
    dao.delete(); /// \오라클 디비에서 검색 or 마이에스큐엘 디비에서 삭제 이 나오게 출력
  }
  // public static void dbWork (DateAcccessObject dao) 자식을 객체로 생성해서 던진다
  // dbWork( new Oracle());
  // dbWork( new MySql());

  // 그후 public static void dbWork (DateAcccessObject dao) 해당 코드에서  () 이부분이
  // 부모의 메소드가 자식들의 객체에서 오버라이드가 되어 있는 상태여야만 가능하다 다형성 조건
  //

}
