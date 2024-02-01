package ch1;

public class VarByteEx1 {

  public static void main(String[] args) {
    // 기본타입 (primitive type)
    // 정수형, 실수형, 불린형, 문자형
    // 초기화가 반드시 필요함

    // 인코딩(ASCII, 유니코드(UTF-8, UTF - 16))
    // A ===> 65

    // 디코딩
    //65 ===> A
    //

    byte age = 10, maxSpeed = 10;
    short age1 = 10, maxSpeed1 = 10;
    int age2 = 15, maxSpeed2 = 20;
    long age3 = 123456789L, maxSpeed3 = 1000000000000L;
    System.out.println(age + maxSpeed); //더해달라
    System.out.println(age + " , " + maxSpeed); //연결해서 출력해달라
    System.out.println("나이 : " + age1 + ", 최고속도 :" + maxSpeed1);
    System.out.println("나이 : " + age2 + ", 최고속도 :" + maxSpeed2);
    System.out.println("나이 : " + age3 + ", 최고속도 :" + maxSpeed3);
    char name = 'j';
    char var1 = 'A';
    char var2 = '가';
    System.out.println("var1 = " + var1);
    System.out.println("var1 = " + var1);
    System.out.println("var2 = " + var2);

    // 3. 논리형 - boolean {1byte} (ture , false 값만 따짐)

    boolean flag = false;
    System.out.println("결과 =" + flag);

    // 4. 실수형 - float ( 4byte) , double (8byte)

    float score1 = 90.17F; // f , F

    System.out.println("score1 =" + score1);
    //System.out.println("score2 =" + score2);
    float var3 = 0.1234567890123456789f;
    double var4 = 0.1234567890123456789d;
    //공간의 차이로 (byte 수) 정밀도의 차이가 있다

    System.out.println("var3 =" + var3);
    System.out.println("var4 =" + var4);

    age = 33; // 값은 변할 수 있다
    System.out.println(age);

    //String name2 = "ja";

    System.out.println("나의 이름은 " + name);
    //2. 문자형 -char
    //'' 사용
    //문자 (한 글자)  vs 문자열 (한글자 이상)
    //       ''                ""
    //char 는 쌍따옴표를 쓰는 char 타입을 쓰지 못한다 문자와 문자열은 다른 개념이다
    // 문자열 (" ")부분은 String 을 써야 한다
    // 문자에는 코드값이 정의 되어 있음
    //char var1 = 65;
    // System.out.println("var1 = " + var1);

    /* 변수 : 하나의 값을 저장하기 위한 공간
     *       저장하는 것에 따라 타입 지정이 필요한다 - 정수형, 문자형, 불린형, 실수형
     *       값은 변할 수 있다 (변수인 이유)
     *       1 BYTE = 8 BIT == 256개 (0~255 까지 표현) 음수도 포함이라 정의를 하자면 (-128~ +127 까지만 가능하다)
     *        정수형은 일반적으로 int 를 쓰면 해결 된다
     * 상수 : 값을 한 번만 저장하는 공간
     *        final int WIDTH = 20;
     *
     */
    int var10 = 35, var20 = 25;
    boolean falg = true;

    System.out.println(var10 + ", " + var20 + " ," + falg);

    System.out.println("성명    주소    전화번호");
    System.out.println("성명\t주소\t전화번호");
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("재미있는\\자바");
    System.out.println("\n");
    System.out.println("escape 문자");

    System.out.printf("var10=%05d, var20=%05d, flag=%05b", var10, var20, falg);

    float f1 = 3.141592f;
    double d1 = 31.1592d;

    System.out.printf("f1 = %f\n", f1);
    System.out.printf("d1 = %d\n", d1);

    // printf 에는 쓸 수 있는 지시자가 정해져있다
    // %d : 10진 정수 형태로 출력
    // %b : boolean 형태로 출력
    // %c : char 형태로 출력
    // %s : 문자열 (string) 형태로 출력
    // %f : 부동소수점 (float , double ) 형태로 출력

    //화면 출력 구문
    // System.out.print(): 엔터 개념이 없다 붙어서 출력된다 하지만 \n 을 넣게되면 println 과 같이 출력물이 엔터되서 나온다
    // System.out.println(): 각 행에 빈 상태로 쓰면 엔터의 개념이다
    // System.out.printf():
    // 탭 ==\t, 엔터 == \n

    // 변수의 유효 범위
    // local (지역) 변수 :  변수는 본인이 속해 있는 블록 {} 안에서만 의미가 있다 벗어나게 되면 오류가 난다
    //  The local variable v4 may not have been initialized 로컬변수 v4 가 초기화 되지 않았음 (공간만 잡고 값이 없어서 뜨는 오류)
    //  변수의 개념
    //      1. 변수 선언
    //      2. 값 할당(초기화)

    //

    {
      int v1 = 15;
      System.out.println("v1 =" + v1);
      System.out.println(v1);

      int v2 = 30;
      int v3 = v1 + v2;
      System.out.println("v3 =" + v3);
    }

    // 자동 형 (type) 변환
    // 정수형, 문자형/실수형/논리형

    byte v1 = 10;
  }
}
//타입(자료형) 변수명 (소문자로 시작해야 함 무조건/ 두개의 단어가 합해진 변수명은 두번쨰 단어 시작을 대문자로 함)
//  1. 정수형 - byte(1byte 만 할당), short(2byte 만 할당) ,int,long(8byte 만 할당)
// max +speed = 오라클 : max_speed , 자바 : maxSpeed
// 데이터 타입과 관계 없이 변수 이름은 항상 달라야 한다
// Duplicate local variable age 변수 이름이 중복 되었다(빨간줄)
//The value of the local variable maxSpeed1 is not  사용하지 않은 변수(노란줄)
// 자바는 대소문자를 구분(중요)
//System.out.println("나이 : "+ age1 +", 최고속도 :" + maxSpeed1);
//출력 값  나이 : 10, 최고속도 :10
