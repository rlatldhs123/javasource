package array;

public class ArrayEx1 {

  public static void main(String[] args) {
    // 배열 ( array)  : 같은 타입의 변수를 하나의 묶음으로 처리 하는 것을 의미

    // 타입 [] 배열명 = new 타입[길이]
    // 배열 선언, 생성하면 초기화까지 일어남

    //int 타입의 변수를 5개 필요시
    int[] arr1 = new int[5]; // 0
    float arr2[] = new float[10]; // 0.0
    double arr3[] = new double[10]; // 0.0
    char[] arr4 = new char[10]; // " "

    // 정수타입 은 0( bytd, short,int,lomg
    // 실수 타입은 0.0(double, float)
    // 논리 타입은 blooean ( false)

    System.out.println(arr1); //[I@7a81197d << 메모리 주소 값
    System.out.println(arr1[0]); // 배열 값을 확인 배열 변수 접근 방법
    System.out.println(arr4[0]); // 배열 값을 확인 배열 변수 접근 방법

    int i; // 해당 변수는 반드시 값지정( 초기화) 필요하다
  }
}
