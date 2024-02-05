package array;

public class ArrayEx3 {

  public static void main(String[] args) {
    // int score[]= new int[5]; // 5개를 담을 수 있는  int  배열 (인덱스 0 부터 시작)
    // // 초기 값은 0이다
    // //배열의 초기 값 변경 작업
    // // score[0] = 98;
    // // score[1] = 88;
    // // score[2] = 78;
    // // score[3] = 68;
    // // score[4] = 58;

    // 더 간단한 배열 생성 구문

    int score[] = new int[] { 98, 88, 78, 68, 58 }; // 이 구문은

    // int score[]= new int[5]; // 5개를 담을 수 있는  int  배열 (인덱스 0 부터 시작)
    // // 초기 값은 0이다
    // //배열의 초기 값 변경 작업
    // // score[0] = 98;
    // // score[1] = 88;
    // // score[2] = 78;
    // // score[3] = 68;
    // // score[4] = 58;

    // 위 구문과 같은 말이다
    // 배열의 초기 값이 정해진 경우라면  해당 방식으로 생성 가능

    // 초기값을 대괄호 안에 이미 정해 놓았다면 new 타입 앞 중괄호는
    // 숫자를 넣지 않는다

    int score2[] = { 98, 88, 78, 68, 58 }; // 초기 값을 정해 놓았다면
    // 가장 많이 쓰는 형식의 구문이다

    int score3[] = { 98, 88, 78, 68, 58 };

    System.out.println(score3[2]);

    // 배열 사이즈 변경 가능? = 배열은 처음에 생성된 크기를 변경 하는 것은
    // 불가능
    // 그러므로 더큰 배열을 생성  => 기존 배열을 새로운 배열에 복사 해야 한다

    //[]대괄호 하나인 배열을 1차원 배열

    int score4[][] = { { 78, 98 }, { 88, 68 } };

    for (int i = 0; i < score4.length; i++) {
      for (int j = 0; j < score4[i].length; j++) {
        System.out.print(score4[i][j] + "\t'");
      }
      System.out.println();

      int arr[] = new 


      for(int[]) arr : score4){
        for (int num  : arr) {
            System.out.print(num + "\t");
            
        }
      }

    }
  }
}
