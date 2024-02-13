package poly;

public class CarEx {

  public static void main(String[] args) {
    Car car = null;
    FireEngine fireEngine = new FireEngine();
    FireEngine fireEngine2 = null;
    Ambulance ambulance = null;

    // 자식 끼리는 아무런 상속관계가 없기 때문에 형변환이 불가능하다

    fireEngine.water();
    car = fireEngine; // 이미 자동 형변환이 일어 나는 것이다 // Car car = new Fireengine();

    fireEngine2 = (FireEngine) car;
    // cast : 강제 형변환

    fireEngine2.water();

    Car car2 = new Car();
    // Class Cast Exception : 실행 시 에러 발생 실행을 해봐야 아는 에러
    // FireEngine fireEngine3 = (FireEngine) car2;
    // fireEngine3.water();
    // 자식클래스보다 범위가 좁은 부모 클래스로 객체를 생성 것이기 때문에
    //  부모로 만들어진 객체를 자식 클래스에 형변환을 통해 우겨 넣을 수가 없다

    // 다형성
    // 부모클래스 타입의 참조변수로 자손 클래스의 인스턴스(객체) 참조
    // 형변환 : 자손타입-> 조상타입 (자동형변환)
    //         조상타입 -> 자손타입 ( 강제 형변환)
    //         참조 변수의 타입을 변환 하는 것으로 참조 할 수 있는 범위를 조절하는 개념
    //
    //

  }
}
