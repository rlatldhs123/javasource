package ch4;

public class TvEx2 {

  public static void main(String[] args) {
    // Tv 인스턴스 3개 생성

    //     Tv tv1 = new Tv("balck", 3, false);
    //     Tv tv2 = new Tv("white", 5, false);
    //     Tv tv3 = new Tv("gray", 4, false); // 객체 3개 생성
    // //
    Tv tvarr[] = new Tv[3]; // 배열로 티비 3개 묶는 법

    tvarr[0] = new Tv("balck", 3, false);
    tvarr[1] = new Tv("white", 5, false);
    tvarr[2] = new Tv("gray", 4, false); // 만들어진 tv배열의 값 집어넣기

    int arr[] = { 12, 12, 13 };

    Tv tvarr2[] = {
      new Tv("balck", 3, false),
      new Tv("white", 5, false),
      new Tv("gray", 4, false),
    }; // tvarr2 로 새로 만들 배열의 값을 이미 알기에
    // 적용 가능
    //
    //
    //
    //
    //
    //
    // 첫번쨰 tv 전원 켜기
    tvarr[0].setPower(true);
    tvarr[0].setChannel(15);

    //세번쨰 tv

    tvarr[2].setPower(true);
    tvarr[2].setChannel(20);
  }
}
