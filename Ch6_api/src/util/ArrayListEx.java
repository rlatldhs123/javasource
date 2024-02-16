package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 컬렉션 프레임 워크 : 데이터 군을 저장하는 클래스들을 표준화한 설계

// Collection

// List (Collection 인터페이스를 상속 받은 "인터페이스")
// Set (Collection 인터페이스를 상속 받은 "인터페이스")

//Map (단독)

//List (인터페이스) : 순서가 있는 데이터의 집합 ( 데이터의 중복 허용)
//      구현 클래스 = ArrayList,LinkedList, Stack, Vector ....
public class ArrayListEx {

  public static void main(String[] args) {
    // initial capacity : 기본적으로 10개로 공간을 잡고 시작한다
    // List<Integer> list = new ArrayList<>(20); // 리스트 생성
    //  <> 객체타입만 받을 수 있다
    ArrayList<Integer> list = new ArrayList<>(20); // 이 방식으로도 진행 가능
    list.add(75);
    list.add(68);
    list.add(35);
    list.add(45);
    list.add(55);
    list.add(65); // 데이터 담기 순서대로 담김
    //toString () 오버 라이딩 여부

    System.out.println(list); //   [15, 25, 35, 45, 55, 65]
    // List 구조는 배열과 동일한 개념으로 움직임 { 좀더 간단하다}
    // 배열은   [] 안에 값이 정해져 있는 고정크기이기 때문에
    // 크기 변경시 다른 배열 생성 후  옮기는 작업이 필요했다
    // 크기 변경이 필요하다면 내부적으로 알아서 처리함

    // list.sort(Comparator.reverseOrder()); // 내림차순
    list.sort(Comparator.naturalOrder()); // 오름차순
    System.out.println(list);

    System.out.println("sort 메소드");

    ArrayList<String> list2 = new ArrayList<>();

    list2.add("java"); // append 개념 뒤로 덧붙히기
    list2.add("JSP");
    list2.add("HTML");
    list2.add("CSS");
    list2.add("JAVASCPRIPT");
    list2.add("PYTHON");

    // 메소드

    System.out.println(list2.size()); // 리스트안에 몇개가 들어있는지 int 형태로 알려줌 저장된 객체 갯수
    // 배열로 표현시 arr.length()
    System.out.println("get()" + list2.get(3)); // 지정된 위치에 있는 객체를 반환하게 됌
    // // 배열로 표현시 arr[3]

    System.out.println("indexOf() " + list2.indexOf("java")); // 리스스 안에 값이 몇번쨰 위치에 있는지 알려달라

    System.out.println("remove() : " + list2.remove("java")); // remove() 지정된 객체제거 하는 메소드
    System.out.println(list2);
    System.out.println("remove() : " + list2.remove(2)); // 인덱스 번호를 넣고 제거를 한다면 제거가 객체가 반환된다
    //
    //
    // ArrayList == > 배열로 변환해주는 메소드

    Object[] arr = list2.toArray(); // 배열로 전환
    // 왜 리턴 타입이 Object 인가?
    // 어떤 타입의 데이터를 받아도  받아들일 수 있게 설정

    for (Object object : arr) {
      System.out.println(object);
    }

    // 배열 ==> ArrayList 로 변환
    // Arrays 클래스 이용

    int[] arr2 = { 3, 5, 6, 7, 9 }; // 배열 생성

    List<int[]> list3 = Arrays.asList(arr2); // ArrayList<Integer> 형태로는 받지 못한다

    System.out.println("isEmpty()" + list2.isEmpty()); // ArrayList 가 비어 있는지 확인 하는 메소드 Boolean 타입으로 나온다

    list2.set(1, "Oracle"); // 특정 인덱스 위치에 내가 원하는 데이터를 집어 넣는 메소드  잦은 추가 및 삭제가 일어난다면 ArrayList 는 효율이 떨어진다
    // 그래서 나온데 linkdeList 이다
    System.out.println(list2);
  }
}
