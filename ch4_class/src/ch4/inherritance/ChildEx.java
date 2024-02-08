package ch4.inherritance;

public class ChildEx {

  public static void main(String[] args) {
    // 부모, 자식 인스턴스 생성 가능함
    Parent parent = new Parent(15);
    Child child = new Child(20);
    Child2 child2 = new Child2(25);
    Grandchild grandchild = new Grandchild(30);

    System.out.println("부모의 멤버 변수 " + parent.getAge());
    System.out.println("부모가 물려준  멤버 변수 " + child.getAge());
    System.out.println("부모가 물려준  멤버 변수 " + child2.getAge());
    System.out.println("child 멤버 메소드");
    System.out.println("Parent 가 물려준 멤버 변수" + Grandchild.getAge());
    child.paly();

    parent.print();
    child.print();
    child2.print();
    grandchild.print();
  }
}
