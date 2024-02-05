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

}
