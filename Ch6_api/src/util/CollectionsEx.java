package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//
// Collections 클래스
// Collection 인터페이스 서로다르니 주의
//  Collections 클래스 : 전부 static 요소로만 구성되어 있음

// 컬렉션 ( List, Set, Map)과 관련된 메소드 제공
// 동기화, fill() copy(),sort(), binarySarch() 유용한 메소드 제공

public class CollectionsEx {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    System.out.println(list);

    Collections.rotate(list, 2);
    Collections.sort(list, Comparator.naturalOrder());
    System.out.println(list);

    Collections.swap(list, 0, 2);
    System.out.println(list);

    // Collections.sort(list, Collections.reverseOrder()); // 내림 차순 List 자체 메소드를 이용하든 Collections. 메소드를 사용하든 상관 없다
    System.out.println(list);

    System.out.println(
      "3이 저장된 위치를 찾고 싶어요 : " + Collections.binarySearch(list, 3)
    );

    System.out.println("최대 값: " + Collections.max(list));
    System.out.println("최소 값: " + Collections.min(list));

    Collections.fill(list, 9); // 원하는 숫자로 내가 전부 List 를 채울 수 있다

    System.out.println(list);
  }
}
