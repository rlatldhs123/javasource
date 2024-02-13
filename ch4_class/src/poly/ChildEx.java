package poly;

public class ChildEx {

  public static void main(String[] args) {
    Child child = new Child(); // 양쪽이 동일한 인스턴스
    //  // child 으로 접근 가능한 범위
    // field1 ,field1,  method1(), method2(),method3() 도 접근 가능
    //
    //
    //
    Parent child1 = new Child(); // 상속 관계라면  왼쪽이 부모가 오는게 가능
    // child 1 으로 접근 가능한 범위
    // field1 , method1(), method2()
    // 범위는 더 좁다

    child1.method2();
    // 오버라이딩 된 메소드라면 자식 메소드가 실행 됨

  }
}
