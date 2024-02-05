package array;

public class ArrayEx2 {

  public static void main(String[] args) {
    int score[] = new int[5]; // 5개를 담을 수 있는  int  배열 (인덱스 0 부터 시작)
    // 초기 값은 0이다

    //배열의 초기 값 변경 작업

    score[0] = 98;
    score[1] = 88;
    score[2] = 78;
    score[3] = 68;
    score[4] = 58;

    // 배열 값 확인

    // System.out.println(score[0]);
    // System.out.println(score[1]);
    // System.out.println(score[2]);
    // System.out.println(score[3]);
    // System.out.println(score[4]);
    // System.out.println(score.length); // 배열의 길이를 알려주는 구문

    // 구문 개선 (반복문 이용) 배열은 무조건 for  문이 들어온다

    for (int i = 0; i < score.length; i++) {
      System.out.println(score[i]);
    } // 기본 for 구문

    System.out.println("\n\n\n\n");

    System.out.println(score.length);

    for (int i : score) {
      System.out.println(i);
    } // 차례대로 접근을 할거라면
  }
}
