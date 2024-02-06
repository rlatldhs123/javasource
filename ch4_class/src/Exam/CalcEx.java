package Exam;

public class CalcEx {

  public static void main(String[] args) {
    // 객체 생성

    Calc calc = new Calc();

    calc.subtract(15, 20);
    calc.multiply(15, 20);
    calc.divide(15, 20);

    int result1 = calc.divide(25, 5);
    int result2 = calc.add(25, 5);
    int result3 = calc.multiply(25, 5);
    int result4 = calc.subtract(25, 5);

    System.out.println("덧셈 결과 : " + result1); // 앞에가 void 가 아니라면 !) result 를 통한 결과 값 출력

    System.out.println("곱셈 결과 : " + calc.multiply(15, 20)); // 앞에가 void 가 아니라면 2) 프린트 구문에 바로 메소드를 넣기

    System.out.println("나눗셈 결과 : " + calc.divide(30, 2));
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
  }
}
