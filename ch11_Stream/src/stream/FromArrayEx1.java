package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 같은 종류의 데이터를 다룰 때 사용했던 방법
// 배열, 리스트,set ,map
// for, iterator
// list.sort(), Collections.sort(), Arrays.sort()  정렬 메소드

// 같은 기능의 메소드들 중복, 컬렉션이나 배열을 다루는 방법이 제각각이고 해결하기 위해
// stream 을 사용해서 해결

// stream
// 데이터 소스를 추상화 시키고, 자주 사용하는 메소드를 정의해 놓음
// 데이터 소스를 변경하지 않음 원본을 건드리지 않음
// 일회용임 (스트림 한번 사용하면 닫힘)
// 작업을 내부 반복으로 처리
public class FromArrayEx1 {

  public static void main(String[] args) {
    // 기존 방법 - 배열, 리스트 여부에 따라 정렬 방법이 다르고 ,  원본 자체가 정렬이 일어남

    String[] strArr = { "ad", "abc", "aaa" };
    // Arrays.sort(strArr); // 기존방법은 원본 자체에 변겨이 일어난다
    System.out.println(Arrays.toString(strArr));
    List<String> list = Arrays.asList(strArr);
    // Collections.sort(list); // 기존방법은 원본 자체에 변겨이 일어난다
    System.out.println(list);

    // Stream 사용 방식 - 데이터 소스는 다르나 정렬/ 출력 방법 동일

    Stream<String> stream1 = Arrays.stream(strArr);
    Stream<String> stream2 = list.stream();

    stream1.sorted().forEach(item -> System.out.println(item));
    System.out.println();
    stream2.sorted().forEach(item -> System.out.println(item));

    // 만약 정렬된 결과가 필요하다면
    List<String> sortedList = stream2.sorted().collect(Collectors.toList()); // 이 함수를 통해서 받아야 한다

    System.out.println("정렬 후");
    System.out.println(Arrays.toString(strArr));
    System.out.println(list);
    //
    // 원본으로 찍어보면 변경이 안되어 있다 왜??
    //
  }
}
