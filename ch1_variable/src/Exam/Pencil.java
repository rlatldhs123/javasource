package Exam;

public class Pencil {

  public static void main(String[] args) {
    //534 자루의 연필을 30명의 학생들에게 똑같은 개수로
    //나눌때 학생 한명당 몇개를 가질 수 있고 , 최종적으로 몇개 남는지 출력하시오
    // 변수 사용

    int Pencil = 534, st = 30;
    int result = Pencil / st;
    int remain = Pencil % st;

    System.out.printf("한명당 = %d", Pencil / st);
    System.out.printf("나머지= %d", Pencil % st);
  }
}
