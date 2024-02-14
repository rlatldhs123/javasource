package shop;

public class Cellphone extends Product {

  public Cellphone(String pname, int price, String carrier) {
    super(pname, price);
    this.carrier = carrier;
  }

  private String carrier;

  @Override
  public void printExtral() {
    System.out.println("통신사 : " + carrier);
  }
}
