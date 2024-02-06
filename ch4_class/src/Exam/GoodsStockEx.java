package Exam;

public class GoodsStockEx {

  public static void main(String[] args) {
    GoodsStock goodsStock = new GoodsStock("p1011", 150);

    int stockNum = goodsStock.addStock(20); // 재고 수량 추가
    System.out.println("현재 재고 수량" + stockNum);

    goodsStock.subtrackStock(100);
    System.out.println("현재 재고 수량 " + stockNum);
  }
}
