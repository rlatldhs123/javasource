package ch4;

public class PersonEx {

  public static void main(String[] args) {
    Person person = new Person(); // 생성자

    person.setName("홍길동"); // set 을 이용한 값 입력

    System.out.println(person.getName()); // get 을 이용한 네임 값 출력

    System.out.println(person); //  ch4.Person@5ca881b5

    //
    //
    //
    //
    //

    Person person1 = new Person(); // 생성자

    person1.setName("성춘향"); // set 을 이용한 값 입력

    System.out.println(person1.getName());
  }
}
