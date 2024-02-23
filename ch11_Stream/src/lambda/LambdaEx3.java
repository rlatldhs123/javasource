package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// java.util.function  패키지 안에
// 함수형 인터페이스 제공

// 메소드
// 매개변수 없고, 반환값도 없음 : void run() == > java.lang.Runnable
// 매개변수 없고, 반환값 있음 : int run() == > Supplier<T> T get()
// 매개변수 있고, 반환값 없음 : void run(int A) ==> Consumer<T> void  accept(T t)
// 매개변수 있음, 반환값 있음 : void run(int A) {} retrun; == > Function<T,R>  R apply(T t)
// 조건식 표현할때 사용되는 메소드 : boolean test ( int a) ==> Predicate<T> boolean test ( T t)

// Bi~ : 매개 변수의 개수가 2개인 함수형 인터페이스
//void run (int a, Strong str)  == > BiConsumer<T,U> void  accpt (T t, U u)
//void run(String a , float f) ) == > BiFunction<T,R>  R apply(T t U u)
//  boolean test ( int a double d) ==> BiPredicate<T ,U> Predicate<T> boolean test ( T t  U u)

//Function 과 같은 역할
// 매개 변수 타입과 반환 타입이 모두 일치 한다 라는 조건이
// UnaryOperator<T>  T apply(T t)
// BinaryOperator<T> T apply(T t T u)

// void run( int a ,Streng str)
// 기본형을 이용하는 함수형 인터페이스
// ToIntFunction : int applyAsInt(T value)
public class LambdaEx3 {

  public static void main(String[] args) {
    Supplier<Integer> s = () -> (int) (Math.random() * 100 + 1);
    System.out.println("1~100 중 임의의 수" + s.get());

    Consumer<Integer> c = i -> System.out.println(i);
    c.accept(10);

    Function<Integer, Integer> f = i -> i / 10 * 10;
    System.out.println(f.apply(10));

    Predicate<Integer> p = i -> i % 2 == 0;
    System.out.println(p.test(10));

    // "5698" ==> 5698 + 30  리턴 값 = 5728 이 결과를 리턴 하는 메소드를 람다 형태로 만들기

    Function<String, Integer> f2 = s1 -> Integer.parseInt(s1) + 30;
    System.out.println(f2.apply("5678") + 30); // 왜 30을 하지

    // 문자열의 길이가  0 인지 판별

    Predicate<String> p2 = s2 -> s2.length() == 0;
    System.out.println(p2.test(""));

    // 문자열을 집어넣으면 그대로 리턴 하는

    Supplier<String> str3 = () -> "안녕하세요";
    System.out.println(str3.get());

    // 문자열을 받아서 문자열르 그대로 출력하는

    Consumer<String> str4 = s5 -> System.out.println(s5);
    str4.accept("rlatldhs");
    // 2개의 숫자를 받아서 더하기 한후 리턴
    BiFunction<Integer, Integer, Integer> bif1 = (s6, s7) -> s6 + s7;
    System.out.println(bif1.apply(50, 75));

    // 2개의 숫자를 받아서 큰 값 출력

    BiConsumer<Integer, Integer> bif2 = (s8, s9) ->
      System.out.println(s8 > s9 ? s8 : s9);
    bif2.accept(10, 70);

    // 두개의 문자열을 받아서 하나의 문자열로 리턴

    BiFunction<String, String, String> str5 = (str10, str11) ->
      str10.concat(str11);
    System.out.println(str5.apply("김", "시온"));
  }
}
