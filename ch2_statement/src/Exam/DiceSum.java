package Exam;

import java.util.Scanner;

public class DiceSum {

  public static void main(String[] args) {
    //1. 잔액을 저장할 변수 생성한다.
    int myaccount = 0;

    //2. 입력을 위해 Scanner 객체 생성한다.
    Scanner sc = new Scanner(System.in);
    boolean status = true;

    //3. 프로그램이 반복되게 한다.
    while (status) { //status가 참일 때 반복 되도록 하였다.
      System.out.println("---------------------------------");
      System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
      System.out.println("---------------------------------");

      //4. 메뉴를 선택하여 메뉴 별로 진행되게 한다.
      //방법 2. switch 문을 활용한 방법
      int sel = sc.nextInt();
      switch (sel) { //switch문을 활용하여 메뉴를 선택할 수 있게 하였다.
        case 1: //1을 입력한 경우 예금을 할 수 있다.
          System.out.println("예금액 (원): ");
          int depositM = sc.nextInt();
          myaccount += depositM;
          System.out.println("예금 완료 ");
          break;
        case 2: //2을 입력한 경우 출금을 할 수 있다.
          System.out.println("잔액:" + myaccount);
          System.out.println("출금액");
          int withdrawalM = sc.nextInt();
          if (myaccount - withdrawalM >= 0) {
            myaccount -= withdrawalM;
            System.out.println("출금 완료");
            System.out.println("잔액:" + myaccount);
          } else {
            System.out.println("잔액이 부족 합니다.");
          }
          break;
        case 3: //3을 입력한 경우 잔액을  확인할 수 있다.
          System.out.println("잔액 :" + myaccount);
          break;
        //5. 반복문에서 빠져나와 프로그램이 종료되도록 한다.
        case 4: //4를 입력한 경우 프로그램이 종료되도록 한다.
          System.out.println("프로그램을 종료 하겠습니다.");
          status = false; //statue를 false로 만들어 while문이 종료된다.
          break;
        default: // 1~4 이외의 값을 입력 시 에러 문구를 출력한다.
          System.out.println("잘못된 접근");
          break;
      }
    }
  }
}
