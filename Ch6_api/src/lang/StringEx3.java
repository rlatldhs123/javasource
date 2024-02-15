package lang;

public class StringEx3 {

  public static void main(String[] args) {
    String str1 = "Hello!! Java";

    // 문자열 => char  배열로 바꾸고 싶음

    // str1.length() : str1 의 길이 리턴

    char[] arr = new char[str1.length()]; // 배열 생성 문자 길이 만큼

    for (int i = 0; i < str1.length(); i++) {
      arr[i] = str1.charAt(i);
    }

    System.out.println(arr);

    String str2 = "자바 프로그래밍";

    // '프' 문자가 존재한다면 "들어있음" 으로 출력 없으면 " 없음" 으로 출력

    str2.contains("프"); // 문자안에 특정문자가 들어있는지 확인

    if (str2.contains("프")) {
      System.out.println("들어있음");
    } else {
      System.out.println("들어있지 않음");
    }

    System.out.println(str2.contains("프") ? "들어있음" : "없음");
    // 3항 연산자로 출력한 값
  }
}
