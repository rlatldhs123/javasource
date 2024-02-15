package lang;

public class Person {

  String id;
  String name;

  public Person(String id, String name) {
    this.id = id;
    this.name = name;
  }

  // id  와 name 의 값이 같으면  true
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person) {
      Person p = (Person) obj;
      if (this.id.equals(p.id) && this.name.equals(p.name)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return "Person [id=" + id + ", name=" + name + "]";
  }
  // 항상 미리 만들어 놓으면 편하다

}
