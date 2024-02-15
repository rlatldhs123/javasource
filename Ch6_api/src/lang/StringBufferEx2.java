package lang;

public class StringBufferEx2 {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    // StringBuffer sb2 = "Hello";  string 처럼 간략한 선언은 안된다 (x)

    //append() : 원몬 문자열 뒤에 추가 하는
    // System.out.println("append() : " + sb1.append("Hello World"));
    // sb1.append("123").append(456).append(12.3f);
    // System.out.println(sb1);

    // charAt()

    System.out.println(sb1.charAt(3));

    // delete() StringBuffer 에서만 존재함
    // : 끝 위치 문자 제외

    // sb1.delete(3, 6);
    // System.out.println(sb1);

    // insert()

    sb1.insert(4, " 012345 ");
    System.out.println(sb1);

    // length()

    //repalce()
    // 0번에서 3번위치에 있는 문자를 "AB" 로 바꿔줘

    sb1.replace(0, 3, "AB");
    System.out.println(sb1);

    String str2 = "0123456789";
    //9876543210 으로 출력하기
    for (int i = str2.length() - 1; i > 0; i--) {
      System.out.print(str2.charAt(i));
    }
    System.out.println();

    StringBuffer sb3 = new StringBuffer("0123456789");
    System.out.println(sb3.reverse());

    // String => StringBuffer 로 바꾸는법 메소드로는 바꿀 수 없다

    // 생성자로 바꾸어 주어야 한다

    String qwe = "123456";
    StringBuffer qwe1 = new StringBuffer(qwe);
    System.out.println(qwe1.reverse());

    StringBuffer sb4 = new StringBuffer(str2);
    System.out.println(sb4.reverse());

    sb1.setCharAt(1, 'K');
    System.out.println(sb1);

    //StringBuffer 에도 있는건 StringBuilder 에도 있다 차이점은 안정성 차이
    StringBuilder sBuilder1 = new StringBuilder("Hello");
  }
}
