package Exam;

public class Area {

  public static void main(String[] args) {
    // 사다리꼴의 넓이 구한 후 출력

    //윗변 + 아랫변 * 높이 /2  소수점 둘째자리까지 나오게 출력 숫자는 임의대로

    int hi = 7, lo = 10, L = 3;

    double result = ((hi + lo) * L) / 2;

    System.out.printf("넓이= %.2f", result);


    //이대로 계산하면 원래라면 25.50 이지만 정수형태로 나오기 때문에 결국은 정수인
    //25만 나오게 된다 하지만 이 함수에 캐스팅 (데이터타입), 을 쓰거나 정수 형태를 
    실수 형태로 바꿔버리면 답이 정확하게 나오게 된다
  }
}
