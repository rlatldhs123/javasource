package ch4;

public class CarEx {

  public static void main(String[] args) {
    Car car = new Car();

    car.company = "현대";
    car.model = "그랜저";
    car.maxSpeed = 180;
    car.forward();

    Car car2 = new Car();

    car2.company = "기아";
    car2.model = "아반떼";
    car2.maxSpeed = 189;
    car2.backward();

    System.out.println(car.company);
    System.out.println(car.model);
    System.out.println(car.maxSpeed);

   void


  }
}
