package lang;

public class StringEx5 {

  public static void main(String[] args) {
    System.out.println(count("12345AB12AB345AB", "AB"));
    // System.out.println(count("12345", "AB"));
  }

  // src 에 타겟 문자가 몇번 나오는지 세어서 반환
  public static int count(String src, String target) {
    int cnt = 0, pos = 0;

    // System.out.println("ondexOf : " + src.indexOf(target, 0)); // 5
    // System.out.println("ondexOf : " + src.indexOf(target, 7)); // 9 + target.laength
    // System.out.println("ondexOf : " + src.indexOf(target, 11)); // 14

    // while (true) {
    //   pos = src.indexOf(target, pos);
    //   if (pos != -1) {
    //     cnt++;
    //     pos = pos + target.length();
    //   } else {
    //     break;
    //   }
    // }

    while ((pos = src.indexOf(target, pos)) != -1) {
      cnt++;
      pos += target.length();
    }ㅏㅣㅏㅣ

    return cnt;
  }
}
