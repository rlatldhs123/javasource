package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 컬렉션 프레임워크의 함수형 인터페이스를 매개 변수로 사용하는 메소드 존재

public class LambdaEx4 {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }
    //list 값을 사용
    // for(int i =0; i<list.size() i++), // 잘 안씀
    // for(int i :list) // 많이씀
    // forEach(Consmer<Integer> action) // 많이씀
    // forEach(Consmer<Interger> action)
    list.forEach(i -> System.out.println(i));

    // list 에서 2또는 3 배수 제거
    //removeIf(Predicate <? super e> filter)
    list.removeIf(i -> i % 2 == 0 || i % 3 == 0);
    for (Integer integer : list) {
      System.out.println(list);
    }

    // list 각 요소에 10을 곱한다
    list.replaceAll(i -> i * 10);
    System.out.println(list);

    Map<String, String> map = new HashMap<>();
    map.put("1", "ㄱ");
    map.put("2", "ㄴ");
    map.put("3", "ㄷ");
    map.put("4", "ㄹ");
    // map  모든 요소를  { key ,value} 로 출력

    map.forEach((k, v) -> System.out.printf("{%s , %s}\n", k, v)); // bi 펑션이라 변수 2개이상 선언 필요 람다로 정리
  }
}
