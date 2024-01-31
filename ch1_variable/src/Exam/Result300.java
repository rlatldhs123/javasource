package Exam;

public class Result300 {

  public static void main(String[] args) {
    int value = 356;
    int result = value - 56;

    System.out.printf("출력 결과%d  ", result);
    //출력 결과가 300이 나올 수 있도록 산술 연산 기호 사용

    //변수 num 의 값보다 크면서도 가장 가까운 10의 배수에서 변수num 의 값을 뺀
    //나머지를 구하시오, 예를 들어 24의 크면서도 가장 가까운 배수는 30이고
    //19의 경우 20 이고  81의 경우  90 입니다
    int num = 81;
    int numm = 30;
    int result2 = num - numm;

    System.out.println(10 - (num % 10));

    int num2 = 333;
  }
}
