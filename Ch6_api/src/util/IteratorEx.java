package util;

// Iterator, Enumeration 인터페이스
// 컬렉션에 저장된 요소를 접근하는 데 사용되는 인터페이스
//

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    // list 요소 접근

    for (int i = 0; i < list.size(); i++) {
      String item = list.get(i); // get 으로 접근 리스트 요소 접근 방식 1번
    }

    for (String item : list) {
      // item

    }
    Set<String> set = new HashSet<>();

    //set 요소 접근

    for (int i = 0; i < set.size(); i++) {
      // String item = set.get(i);
      // get 메소드는 순서의 개념이 없기에 get 메소드 사용불가

    }

    for (String item : set) {
      // item for 이치는 사용 가능하다

    }

    // Map : get(key)

    // 데이터를 담는 자료구조에 따라서 가져오는 방식이 조금씩 다르다
    // 컬렉션 요소를 읽어오는 방법 표준화 = Iterator

    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.hasNext());
      // 여기까지 이터레이터를 선언하고 가져오는 방식이다

    }

    // set 구조도 가능하다
    iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.hasNext());
    }
  }
}
