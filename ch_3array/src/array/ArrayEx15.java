package array;

public class ArrayEx15 {

  public static void main(String[] args) {
    int[][] score = {
      { 100, 95, 98 },
      { 20, 20, 18 },
      { 30, 30, 38 },
      { 40, 55, 45 },
      { 50, 48, 67 },
    };

    int kortotal = 0, engtotal = 0, mathtotal = 0;

    // 학생들의 점수 총점과 평균 출력

    // 번호 국어 영어 수학 총점 평균
    //  1   100  95  98   293   97

    System.out.println("번호 국어 영어 수학 총점 평균");
    System.out.println("====================================");

    for (int i = 0; i < score.length; i++) {
      System.out.printf("%d ", (i + 1));
      int sum1 = 0; // 층수를 나타냄 // 개인별 총점
      float avg = 0.0f; // 개인별 평균

      kortotal += score[i][0];
      engtotal += score[i][1];
      mathtotal += score[i][2];

      for (int j = 0; j < score[i].length; j++) {
        sum1 += score[i][j];

        System.out.printf("%5d", score[i][j]); // 각 층의 방

        avg = sum1 / (float) score[i].length;
        System.out.printf("%5d  %5.1f\n", sum1, avg);
      }
    }
  }
}
