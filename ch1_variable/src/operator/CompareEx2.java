package operator;

public class CompareEx2 {

  public static void main(String[] args) {
    String str1 = "홍길동";
    String str2 = "홍길동";
    String str3 = new String("홍길동");

    System.out.println(str1 == str2);
    System.out.println(str1 == str3);
    System.out.println(str1.equals(str3));
    // 문자열의 대한 비교는 equals() 를 쓴다

    //논리 연산자 : &&(amd), || (or), ! (not)

  }
}
