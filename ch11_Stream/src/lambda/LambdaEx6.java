package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

// 메소드 참조
// 람다식을 더욱 간결하게 사용하는 방식
// 람다식이 하나의 메소드만 호출하는 경우 사용
// 클래스이름 :: 메소드명 = > 메소드 참조

public class LambdaEx6 {

  public static void main(String[] args) {
    // "5698" ==> 5698 + 30  리턴 값 = 5728 이 결과를 리턴 하는 메소드를 람다 형태로 만들기

    Function<String, Integer> f2 = Integer::parseInt;

    // 두 개의 문자열을 받아서 문자열이 동일한지 리턴

    // BiFunction<String, String , Boolean> f1 = (s1,s2)-> s1.equals(f2);
    BiFunction<String, String, Boolean> f1 = String::equals; // 동일한 이름

    // Supplier<Student> s = () -> new Student(); // 위와 동일 하다
    Supplier<Student> s = Student::new;
  }
}
