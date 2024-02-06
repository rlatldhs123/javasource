package Exam;

public class GoodsStock {

  // 상품을 관리하는 상품 클래스

  // 속성

  // 상품코드(p1011) , 재고수량(300),

  private String goodscode;
  private int stockNum;

  // 빈상태로 ok 만 누름

  public GoodsStock() {} // << =default 생성자

  // 2개다 선택후 만듬

  public GoodsStock(String goodscode, int stockNum) {
    this.goodscode = goodscode;
    this.stockNum = stockNum;
  }

  // 생성자 ( 객체 초기화를 위해 필요)

  // 재고 수량 추가 메소드 추가 (addStock)   (int amount) 리턴

  int addStock(int amount) {
    stockNum += amount;

    System.out.println("입고후 재고 수량" + stockNum);
    return stockNum; // 입고 된 후 재고 수량 리턴
  }

  // 재고 수량 감소 메소드 (subtrackStock) (int amount) 리턴

  int subtrackStock(int amount) {
    stockNum = -amount;
    System.out.println("출고 후 재고 수량" + stockNum);

    return stockNum; // 출고 된 후 재고 수량 리턴
  }
}
