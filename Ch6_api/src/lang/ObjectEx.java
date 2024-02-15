package lang;

public class ObjectEx {

  // java.lang.* = > 기본 패키지 ( import 구문 없이 사용가능)
  // java.lang.object : 모든 클래스의 조상
  //           equals() 는 ==  과 같은 역할
  //           toString() : 객체 자신의 정보를 문자열로 반환

  public static void main(String[] args) {
    // 인스턴스 생성
    Object obj1 = new Object();
    Object obj2 = new Object();

    if (obj1.equals(obj2)) {
      System.out.println("두 객체는 같다");
    } else {
      System.out.println("두객체는 다르다");
    }

    if (obj1 == (obj2)) {
      System.out.println("두 객체는 같다");
    } else {
      System.out.println("두객체는 다르다");

      System.out.println("obj1 toString() " + obj1.toString());
      System.out.println("obj1 toString() " + obj2.toString());
    }

    Value value1 = new Value(10);
    Value value2 = new Value(10);
    //
    //
    //
    // 현재 equals() 는 주소를 비교하는 중
    // Value 클래스에서 오버라이딩한 equals 를 값의 비교로 "재정의"함
    if (value1.equals(value2)) {
      System.out.println("두 객체는 같다");
    } else {
      System.out.println("두객체는 다르다");
    }

    Member member1 = new Member("hong123");
    Member member2 = new Member("hong123");

    Person person1 = new Person("qwer", "홍길동");
    Person person2 = new Person("qwer", "홍길동");

    System.out.println("value1 toString() " + value1.toString());
    System.out.println("value1" + value1);
    // toString  이 오버라이딩 되어있는 상태면 둘이 같은 코드이다 [.toString 생략가능]
    //value1 toString() lang.Value@85ede7b

  }
}
