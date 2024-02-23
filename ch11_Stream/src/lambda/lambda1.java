package lambda;

// 람다 ( lambda Expression)
// 메소드(함수)를 하나의 식으로 표현한 것

// 반환타입 메소드명 ( 매게변수 선언){}
// (매게변수 선언) -> {}    <<  람다식
public class lambda1 {

  // 기본적인 메소드 선언 방식

  int max(int num1, int num2) {
    return num1 > num2 ? num1 : num2;
  }

  // 람다식

  // (int num1 , int num2) ->{ return num1 > num2 ? num1 : num2; }   // 람다식
  // (int num1 , int num2) ->  num1 > num2 ? num1 : num2;   // 람다식 축약 A 중괄호, 메소드명,  리턴 날림
  // ( num1 ,  num2) ->  num1 > num2 ? num1 : num2;   // 람다식 축약 B 중괄호, 메소드명,리턴 , 메게변수 타입(객체) 날림

  void print(String name, int i) {
    System.out.println(name + " = " + i); // 기본 구문
  }

  //   ( name,  i) -> System.out.println(name + " = " + i); // 람다로 축약

  int square(int x) {
    return x * x; // 기본식
  }

  // (x) -> x*x; // 람다 축약

  // 메게 변수가 없다면
  int roll() {
    return (int) (Math.random() * 6);
  }

  // () - > (int) ( Math.random() * 6);

  int sumArr(int[] arr) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    return sum;
  }
  //   (int[] arr) -> { int sum = 0;
  //     for (int i : arr) {
  //         sum +=i;
  //     }
  //     return sum;}  // 중 괄호가 날라가는 건 한줄일때만 생략 가능 나머지는 중괄호가 포함되어있어야 함

}
