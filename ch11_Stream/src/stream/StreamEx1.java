package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림 연산

// 1) 중간 연산 : 연산 결과가 스트림인 연산(연속해서 중간 연산 가능)
// 필터링, 정렬, 그룹핑
// 2  최종 연산 : 연산 결과가 스트림이 아닌 연산(스트림의 요소를 소모하므라 단 한번만 가능)
// 합계구하기, 평균구하기, 카운트, 최소값, 최대값

public class StreamEx1 {

  public static void main(String[] args) {
    List<String> strList = Arrays.asList(
      "사과",
      "배",
      "포도",
      "귤",
      "수박",
      "바나나",
      "포도",
      "귤",
      "수박"
    );
    String[] strArr = {
      "비행기",
      "자동차",
      "자전거",
      "버스",
      "오토바이",
      "지하철",
    };

    Stream<String> stream1 = strList.stream(); // 객체 변환
    Stream<String> stream2 = Arrays.stream(strArr);

    // 중간 연산
    //skip() , limit() : 스트림 자르기
    // stream1.skip(2).forEach(item -> System.out.println(item)); // 포도 귤 수박 바나나:  배열 첫 순서부터 2개 건너띄고 출력 // 중간 연산

    stream1.skip(2).forEach(System.out::println); // 어차피 해야할 동작이 하나면 간략하게 줄이기 가능
    System.out.println();
    stream2.skip(2).limit(1).forEach(System.out::println); // 자전거 : 2개를 건너띄고 리미티를 걸어 나오는 갯수는 1개로 제한 즉 자전거만 나오게 된다 // 중간연산

    //IllegalStateException: stream has already been operated upon or closed
    // 스트림은 1회용이기에 한번 사용하고 닫히므로 사용이 안된다
    // Arrays.asList() 를 이용해서 리스트 생성시 수정(추가 , 삭제) 불가

    // strList.add("파인애플"); // UnsupportedOperationException
    strList
      .stream()
      .distinct()
      .collect(Collectors.toList())
      .forEach(System.out::println);

    strList
      .stream()
      .distinct()
      .collect(Collectors.toList())
      .forEach(System.out::println);

    // distinct*() : 스트림의 중복 요소 제거

    IntStream intStream = IntStream.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);

    // filter() : 조건에 맞지 않는 요소는 제외
    System.out.println("\nfileter()");
    IntStream intStream2 = IntStream.of(15, 16, 17, 18, 19);
    // 2로 나눈 나머지가 0이 아니고 3으로 나눈 나머지가 0이 아닌

    intStream2
      .filter(i -> i % 2 != 0 && i % 3 != 0)
      .forEach(System.out::println);
  }
}
