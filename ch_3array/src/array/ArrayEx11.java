package array;

public class ArrayEx11 {

  public static void main(String[] args) {
    //  String 배열

    String[] names = { "kim", "park", "choi" };

    for (String str : names) {
      System.out.println(str);
    }

    for (int i = 0; i < names.length; i++) {
      String str = names[i];

      for (int j = 0; j < str.length(); j++) {
        char ch = str.charAt(j); // charAt = 문자열의 하나의 문자만 가져오는 메소드

        System.out.printf("str.charat(%d) : %c\n", j, ch);
      }
    }

    String src = "ABCDE";

    char[] charr = src.toCharArray();
    System.out.println(charr);
    // char 배열로 바꾸는 메소드 // 문자열 배열을 쪼개지는 "문자" 형태로 바꾼다

  }
}
