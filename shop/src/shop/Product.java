package shop;

public abstract class Product {

  private String pname;
  private int price;

  public Product(String pname, int price) {
    this.pname = pname;
    this.price = price;
  }

  public void printDetail() {
    System.out.println("제품명 : " + pname);
    System.out.println("가격 : " + price);
    printExtral();
  }

  //
  public abstract void printExtral();

  public String getPname() {
    return pname;
  }

  public int getPrice() {
    return price;
  }
}
