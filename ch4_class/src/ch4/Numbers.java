package ch4;

public class Numbers {

  private int num[];

  public Numbers(int[] num) {
    this.num = num;
  } // int 배열만 받기에  int 배열을 넣어줘야 한다

  int total = 0;

  int getTotal() {
    for (int i : num) {
      total += i;
    }
    return total;
  }

  int getAverage() {
    return getTotal() / num.length; // 상단에 getTotal 메소드를 바로 리턴 값으로 불러 배열 길이만큼
  }
}
