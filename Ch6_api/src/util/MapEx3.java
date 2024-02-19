package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx3 {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();

    map.put("id_0123", "홍길동");
    map.put("id_0124", "박보검");
    map.put("id_0125", "송중기");
    map.put("id_0126", "현빈");

    // Itrerator  사용하여 요소 접근시

    // 키 값만 모두 가져오기
    Set<String> set = map.keySet();
    //키 값을 Iterator  구조로 변경
    Iterator<String> iterator = set.iterator();

    while (iterator.hasNext()) {
      String key = iterator.next();
      String value = map.get(key);
      System.out.println(key + " : " + value);
    }

    System.out.println("___________________________________________");

    // Map  = > Map ,Entry 내부 인터페이스로 가지고 있음
    //

    Set<Entry<String, String>> entries = map.entrySet();

    Iterator<Entry<String, String>> inIterator2 = entries.iterator();
    while (inIterator2.hasNext()) {
      Entry<String, String> entry = inIterator2.next();
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
}
