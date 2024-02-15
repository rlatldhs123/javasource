package shop;

import java.util.Scanner;

public class MyShop implements IShop {

  private Customer customers[] = new Customer[5];

  private Product products[] = new Product[5];

  private String title;
  private int customerNo;
  // 장바구니
  private Product carts[] = new Product[5]; // 셀폰과 스마트티비 둘다 담아야 하기 때문에

  Scanner sc = new Scanner(System.in);

  @Override
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public void genUser() {
    Customer customer = new Customer();
    customer.setName("홍길동");
    customer.setPayType(PayType.CARD);
    customers[0] = customer;
    //

    customer = new Customer();
    customer.setName("이춘향");
    customer.setPayType(PayType.CARD);
    customers[1] = customer;
    //
    customer = new Customer();
    customer.setName("이순신");
    customer.setPayType(PayType.CARD);
    customers[2] = customer;
    //
    customer = new Customer();
    customer.setName("이정재");
    customer.setPayType(PayType.CARD);
    customers[3] = customer;
    //
    customer = new Customer();
    customer.setName("황신우");
    customer.setPayType(PayType.CARD);
    customers[4] = customer;
  }

  // 고객 생성

  @Override
  public void genProduct() {
    Cellphone phone = new Cellphone("갤럭시노트", 500000, "U+");
    products[0] = phone;
    phone = new Cellphone("z폴드", 2097000, "SKT");
    products[1] = phone;

    phone = new Cellphone("아이폰15", 15640000, "KT");
    products[2] = phone;

    SmartTv tv = new SmartTv("삼성 kq75", 54545454, "4K");
    products[3] = tv;
    tv = new SmartTv("LG OLED", 7878787, "UL");
    products[4] = tv;
  }

  @Override
  public void start() {
    // shop 이름 : 메인화면 - 계정선택
    //==================================

    //[0] 홍길동 (CARD)
    //[1]
    //[2]
    //[3]

    System.out.println(title + "shop 이름 : 메인화면 - 계정선택");
    System.out.println("===============================");
    for (int i = 0; i < customers.length; i++) {
      System.out.printf(
        "[%d] %s(%s) \n",
        i,
        customers[i].getName(),
        customers[i].getPayType()
      );
    }
    System.out.println("[x] 종료");
    // 사용자에게 고객번호 입력받기

    System.out.println("고객 번호 >> ");

    String cNo = sc.nextLine();
    System.out.println(" ###" + cNo + "고객 선택 ###");

    customerNo = Integer.parseInt(cNo);

    if (cNo.equals("X")) {
      System.exit(0);
    } else {
      productList();
    }
  }

  //shop 이름 : 상품목록 - 상품선택
  //   ===============================
  //
  // [0] 상품이름 : 갤럭시
  // 가격 : 10000
  //통신사 : SKT
  //[1]
  //[2]
  //[3]
  //[h] 메인화면
  //[c] 체크아웃

  public void productList() {
    System.out.println(title + "shop 이름 : 상품목록 - 상품선택");
    System.out.println("===============================");
    for (int i = 0; i < products.length; i++) {
      System.out.printf("[%d]", i);
      products[i].printDetail();
    }
    System.out.println(" [h] 메인화면");
    System.out.println(" [c] 체크화면");

    System.out.println("상품 번호 >> ");

    String menu = sc.nextLine(); // 0~4

    switch (menu) {
      case "h":
        start();

        break;
      case "c":
        chechOut();
        break;
      default: // 0~4에 해당하는 제품을 장바구니에 추가
        for (int i = 0; i < carts.length; i++) {
          if (carts[i] == null) {
            carts[i] = products[Integer.parseInt(menu)];
            break;
          }
        }

        productList();
        break;
    }
  }

  public void chechOut() {
    System.out.println("\n");
    System.out.println(title + ": 체크 아웃");
    System.out.println("=========================");

    int i = 0, total = 0;

    for (int j = 0; j < carts.length; j++) {
      //Product product = carts[i];
      if (carts[i] != null) {
        System.out.println(carts[i].getPname());
      }
    }

    for (Product product : carts) {
      if (product != null) {
        System.out.printf(
          "[%d]  %s  %d\n",
          i++,
          product.getPname(),
          product.getPrice()
        );
        total += product.getPrice();
      }
    }

    System.out.println("=======================");
    System.out.println("합계 : " + total);
    System.out.println("결제방법 : " + customers[customerNo].getPayType());
    System.out.println("[p] 이전");
    System.out.println("[q] 종료");
    String menu = sc.nextLine();
  }
}
