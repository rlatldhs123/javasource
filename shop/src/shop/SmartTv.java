package shop;

public class SmartTv extends Product {

  public SmartTv(String pname, int price, String resoiution) {
    super(pname, price);
    this.resoiution = resoiution;
  }

  private String resoiution;

  @Override
  public void printExtral() {
    System.out.println("해상도 : " + resoiution);
  }
}
