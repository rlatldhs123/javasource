package lang;

import java.util.Date;
import java.util.Scanner;

public class StringEx2 {

  public static void main(String[] args) {
    // 생성자

    String str1 = new String("Hello");
    char[] chars = { 'h', 'e', 'l', 'l', 'o' };
    String str2 = new String(chars);

    String str3 = "Hello";

    // 메소드
    //return type = > 변수 담기 or sort

    // charAt() : 인덱스 위치 문자 반환
    char ch = str3.charAt(2);
    System.out.println("charAt9(0) : " + ch);

    // concat()
    // 문자 열 연결 뒤에 연결

    String result = str1.concat("     World");
    System.out.println("concat() " + result);

    //compareTo() : 0, -1 ,1 리턴 주로 정렬할때 쓴다
    // 문자열을 사전 순서로 비교 (A,B,C,D ....)
    // 같으면  0, 사전순으로 이전이면 음수, 이후면 양수
    // a 97, b 98 ( 97-98)

    System.out.println("compareTo()" + str1.compareTo(str3));
    System.out.println("compareTo()" + "aaa".compareTo("bbb"));
    System.out.println("compareTo()" + "bbb".compareTo("aaa"));
    System.out.println("compareTo()" + "bbb".compareTo("baa"));

    //contains()
    // 특정문자열이 포함되어 있는지 검사
    System.out.println("contains()" + str1.contains("e"));

    //endWith()
    // 지정된 문자열로 끝나는지 검사

    System.out.println("endWith(0) " + str3.endsWith("t"));
    System.out.println("endWith(0) " + "Hello.txt".endsWith("txt"));
    // 위 예시와 같이 확장자를 검색하는 용도로 쓸 수 있다

    //startWith()
    // 지정된 문자열로 시작하는지 검사

    System.out.println("h 로 시작하니? " + str3.startsWith("H"));

    // equals() / equalsIgnoreCase()
    //  Hello == HELLO ( 문자는 대소문자를 구별함)

    //equalsIgnoreCase() 는 대소문자를 구분하지 않고 비교가 가능한 메소드이다
    //

    System.out.println("equalsIgnoreCase()" + str1.equalsIgnoreCase("HELLO"));
    System.out.println("equals()" + str1.equals("HELLO"));

    //indexOf() : 주어진 문자가 문자열에 존재하는지 확인하여 위치 반환
    //            있으면 위치 인덱스 , 없으면  -1 반환

    System.out.println("indexOf()" + str1.indexOf("s"));
    System.out.println("indexOf()" + str1.indexOf('s'));
    System.out.println("indexOf()" + str1.indexOf('e'));
    // 2번을 시작위치로 지정
    System.out.println("indexOf()" + str1.indexOf('e', 2));

    // lastIndexOf() : 지정된 문자를 문자열의 오른쪽 끝에서부터 찾아서 위치를 반환

    String str4 = "java.lang.String";

    System.out.println("lastIndexOf()" + str4.lastIndexOf(".")); // 9
    System.out.println("indexOf()" + str4.indexOf(".")); // 4

    //length() : 문자열 길이 반환

    // replace() // 기존 문자를 받아서 사용자가 원하는 새로운 문자로 바꾸고 문자열을 반환

    String repalceStr = str1.replace('H', 'h');
    System.out.println("repalce()" + repalceStr);

    str2 = str2.replace("ll", "LL");
    System.out.println(str2);
    str2 = str2.replace("LL", "ll");
    System.out.println(str2);
    // String 불변 : 원본은 바뀌지 않기에 다시 바꾸려고 했던 변수를 불러와서
    // 대입연산자로 담아야 한다

    str4 = "Hellollo";
    System.out.println("replace()" + str4.replace("ll", "LL"));
    System.out.println("replaceAll()" + str4.replaceAll("ll", "LL"));
    System.out.println("replaceFirst()" + str4.replaceFirst("ll", "LL"));

    // split() 문자열 분리한 (기준에 따라)후 배열로 리턴

    String[] strArr = str1.split("");

    for (String string : strArr) {
      System.out.println(string);
    }

    str4 = "dog,cat,bear";
    strArr = str4.split(",");

    for (String string : strArr) {
      System.out.println(string);
    }
    //  오버로딩된 split 문자열 전체를 지정된 숫자로 자른다
    strArr = str4.split(",", 2);

    for (String string : strArr) {
      System.out.println(string);
    }

    //subString()
    // 시작 위치부터 끝위치에 포함된 문자열 추출

    System.out.println("subString() : " + str1.substring(2));
    System.out.println("subString() : " + str1.substring(1, 4)); // endIndex인 끝 위치는 포함하지 않는다라는 뜻

    //toLowerCase() // 모든 문자를 소문자로 반환
    //toUpperCase() // 모든 문자를 대문자로 반환

    System.out.println("toLowerCase()" + str1.toLowerCase());
    System.out.println("toUpperCase()" + str1.toUpperCase());

    // toString()
    System.out.println(str1);
    System.out.println(str1.toString());
    //
    //
    //
    // 공백 하나 하나 다 문자로 취급

    //trim() 앞 , 뒤 공백을 제거한다

    str4 = "    Hello      World      ";
    System.out.println("trim() 전" + str4);
    System.out.println("trim() 후" + str4.trim());

    //valueOf() : 지정된 값을 문자열로 변환하여 반환
    int num = Integer.parseInt("100"); // 인티저와는 반대가 되는 역할을 한다 int => String = Integer.parseInt("100") , String => int =valueOf()
    String num1 = String.valueOf(100);

    Date d = new Date();
    String num2 = String.valueOf(d);

    int i = 100; //=> "100" 변수로 만들어버리면 더 담다

    String type = String.valueOf(i); // 더 쉬운 방법
    type = i + ""; // 더더더 쉬운방법

    //
    //double 타입도  이와 같은 값 변환 메소드가 존재한다
    float f = 10.3f;
    double d1 = Double.parseDouble("10.3");

    float f1 = Float.parseFloat("10.3");

    type = f + "";
  }
}
