package generics;

public class BoxEx {

  // T, E  : 객체

  public static void main(String[] args) {
    Box box = new Box();
    box.setItem(new String("홍길동"));
    box.setItem(Integer.valueOf(10));
    box.setItem(Float.valueOf(3.14f));
    // String name = (String) box.getItem(); // 아무거나 담았기에 형변환을 해야 한다

    // Integer num = (Integer) box.getItem(); // 아무거나 담았기에 형변환을 해야 한다

    // Float f = (Float) box.getItem(); // 아무거나 담았기에 형변환을 해야 한다 // 지네릭스 미적용

    Box2<String> b2 = new Box2<>();
    Box2<Integer> b3 = new Box2<>();
    Box2<Float> b4 = new Box2<>();
    Box2<Double> b5 = new Box2<>(); // 지네릭스 적용

    b2.setItem("홍길동");
    b3.setItem(10);
    b4.setItem(10.0f);
    b5.setItem(10.0d);

    String str = b2.getItem();

    Box3<Fruit> fruitBox = new Box3<>();
    Box3<Apple> appleBox = new Box3<>();
    Box3<Grape> grapeBox = new Box3<>();
    Box3<Toy> toyBox = new Box3<>();

    //
    // 부모 타입으로 설정 시 자식 객체 담는 것 허용

    fruitBox.add(new Fruit());
    fruitBox.add(new Apple());
    fruitBox.add(new Grape());
    //    fruitBox.add(new Toy());

    appleBox.add(new Apple());
    // appleBox.add(new Fruit());  자식은 부모 및 다른 형제들을 담을 수 없다
    grapeBox.add(new Grape());

    FruitBox<Fruit> fruitBox2 = new FruitBox<>();
    fruitBox2.add(new Fruit());
    fruitBox2.add(new Apple());
    fruitBox2.add(new Grape());
    //
    // fruitBox2.add(new Toy());  toy 안됌 프루트 자손들만 허용
    System.out.println(Juicer.makeJuice(fruitBox2));
  }
}
