package util;

import java.util.ArrayList;
//

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Arrays : 배열을 다루는데 유용한 메소드가 정의 되어 있음
// static 요소로 구성 되어 있음
public class ArraysEx {

  public static void main(String[] args) {
    int[] arr = { 3, 2, 1, 0, 4, 5 };

    System.out.println(arr); // 주소 값

    System.out.println(Arrays.toString(arr)); // 값 출력

    int[] arr2 = new int[6];
    Arrays.fill(arr2, 9); // 배열을 하나의 값으로 채우는 메소드

    System.out.println(Arrays.toString(arr2));

    System.out.println(" 배열 요소 비교 : " + Arrays.equals(arr, arr2)); // boolean 형태로 값 반환
    // 배열을 List 구로조 변경 하는 법 aslist()
    List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });
    List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
    //
    //
    //

    // list.add(6); // UnsupportedOperationException : 반환된 List 크기를 변경 할 수 없음 원래 배열이였기 때문에

    //

    List<Integer> list3 = new ArrayList<>(
      Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 })
    ); // 이런 식으로 하게되면 add() 메소드로 추가가 가능하다
    // 기존 배열을 리스트로 바꾸어서 하고싶다면 새로 생성하자

    list3.add(6);
    System.out.println(list3);

    // sort() 오름차순 정렬

    Arrays.sort(arr); // 디폴트가 오름차순 정렬
    //
    //
    System.out.println(Arrays.toString(arr)); // 배열 정렬

    // binarySearch() : 검색 [2진 검색] 검색할때 가장 빠른 { 무조건 정렬된 상태여야 한다 꼭 오름차순으로 정렬되있어야 한다}
    // 못찾으면 음수로 결과가 나옴
    // linear Search() : 순차 검색 첫번쨰 요소부터 하나씩 검색/ 정렬 상관 없음

    System.out.println(" 2의 위치 : " + Arrays.binarySearch(arr, 2));

    // 내림차순 정렬
    //T[]  : 배열이 객체 타입이여야 한다는 뜻
    // Map<K,V> : K, v  == > 객체 타입
    // Collection<E> == > 객체 타입
    // Int ==> Interger 와 같은 형태로 바꾸어야 함
    Integer arr3[] = { 27, 55, 15, 6, 9, 75 };, 
    Arrays.sort(arr3, Comparator.reverseOrder());

    String[] strarr = { "Cat", "Dog", "lion", "tiger", " apple", "zoo" };

    Arrays.sort(strarr);
    System.out.println(Arrays.toString(strarr));

    Arrays.sort(strarr, Comparator.reverseOrder()); // 내림차순
    Arrays.sort(strarr, Comparator.naturalOrder()); // 오름차순
  }
}
