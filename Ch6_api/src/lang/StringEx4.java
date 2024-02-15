package lang;

public class StringEx4 {

  public static void main(String[] args) {
    String[] names = { "jgjgj", "dfdf", "Kim", "Choi" };
    System.out.println(findKim(names)); //Kim 의 위치를 찾아서  KIm 은 0번 위치에 있다 라고 출력 을 원함
  }

  public static String findKim(String[] arr) {
    // "Kim.".equals(arr[0]);
    // "Kim.".equals(arr[1]);
    // "Kim.".equals(arr[2]);
    // "Kim.".equals(arr[3]);
    // "Kim.".equals(arr[4]);
    int idx = 0;
    for (int i = 0; i < arr.length; i++) {
      if ("Kim.".equals(arr[i])) {
        idx = i;
        break;
      }
    }

    return "Kim은 " + idx + "번 위치에 있다";
  }
}
