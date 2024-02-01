package operator;

public class ConditionEx1 {

  public static void main(String[] args) {
    // 조건 연산자 : 조건식 ? 식1 : 식;

    //x 가 y 보다 크면 x 값을 변수에 담고 , 그게 아니면  y 값을 담기

    int x = 5, y = 3;

    int result = (x > y) ? x : y;

    System.out.printf("result0 = %d\n", result);

    // 점수가  90 이상이면 a , 그외는  f

    int score = 80;

    System.out.println(score > 90 ? 'A' : 'F');
    // 점수가  90 이상이면 a , 80 이상이면 b 그외는 f

    System.out.println(score > 90 ? 'A' : (80 <= score ? 'b' : 'f'));
  }
}
