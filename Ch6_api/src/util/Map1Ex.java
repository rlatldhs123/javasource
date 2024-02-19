package util;

import java.text.CollationKey;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1Ex {

  public static void main(String[] args) {
    // Map 인터페이스
    // key, value 를 하나의 쌍으로 묶어서 저장
    // key 는 중복 불가, value는 중복 가능
    // 구현 클래스 : Hashtable, hashmap,treemap, ..., 등등이 있다
    // Map은 컬렉션 클래스가 넘겨준게 아니라서 map 만의 메소드가 따로 존재한다
    // map 은 내부 인터페이스를 가지고 있다 Map.Entry

    Map<String, String> map = new HashMap<>(); // Map 생성  key 값 타입 & value 지정 타입

    // 요소 추가 .put(); key 값 & value 지정

    map.put("id_0123", "홍길동");
    map.put("id_0124", "박보검");
    map.put("id_0125", "송중기");
    map.put("id_0126", "현빈");

    map.get("id+0123");

    System.out.println(
      " key 값의 해당하는 value 가져오기 : " + map.get("id_0123") //홍길동
    );
    System.out.println("key 존재 여부 묻기 : " + map.containsKey("id_0123")); // true

    System.out.println("vlaue 존재 여부 묻기 : " + map.containsValue("송중기"));
    System.out.println("map 요소의 크기  size(): " + map.size());
    System.out.println("key 값 삭제 : " + map.remove("id_0126"));
    System.out.println("Map 요소  삭제 : " + map.remove("id_0126", "")); // 벨류 키 모두 삭제 가능
    //
    //
    // 주요 메소드

    //  키 값 모두 가져오기
    Set<String> keys = map.keySet();
    System.out.println(keys);

    //
    //
    //  밸류 값 모두 가져오기

    Collection<String> values = map.values();
    System.out.println(values);
  }
}
