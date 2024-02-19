package util;

import java.util.TreeSet;

// java.util.TreeSet

// TreeSet : (set 인터페이스 구현 클래스)
//           이진 검색 트리라는 자료구조의 형태로 데이터를 저장

// 이진 검색 트리: 정렬, 검색, 검색 범위검색에 높은 성능을 보이는 자료구조
// 모든 노드는 최대 두개의 자식 노드를 가짐
// 왼쪽 자식 노드의 값은 부모노드의 값보다 작고 오른쪽노드의 값을 부모 노드의 값보다 커야 한다
// 노드의 추가, 삭제에  ,시간이 걸린다.
// 검색과 정렬에 유리 = > Treeset  구조 채택
// 중복된 값을 저장하지 못함
public class TreeSetEx1 {

  public static void main(String[] args) {
    TreeSet<Integer> treeset = new TreeSet<>();
    // Treeset 객체 구현

    treeset.add(80);
    treeset.add(75);
    treeset.add(95);
    treeset.add(50);
    treeset.add(35);
    treeset.add(45);
    treeset.add(65);
    treeset.add(10);
    treeset.add(100);

    // Treeset 만의 메소드

    System.out.println(" 가장 낮은 점수" + treeset.first()); // 10
    System.out.println(" 가장 높은 점수" + treeset.last()); // 100
    System.out.println("50 보다 작은 값 ( 전체)" + treeset.headSet(50)); // 50 보다 작은 값 [10, 35, 45]
    System.out.println("50 보다 큰  값 (전체) " + treeset.tailSet(50)); // 50 보다 큰  값 [50, 65, 75, 80, 95, 100]
    System.out.println("50 보다 큰  값 (하나 )" + treeset.lower(50)); // 50 보다 큰  값 (하나)45

    System.out.println("50 보다 큰  값 ( 하나)" + treeset.higher(50)); // 50 보다 큰  값 (하나)65

    TreeSet<String> treeSet2 = new TreeSet<>();

    treeSet2.add("고양이");
    treeSet2.add("사자");
    treeSet2.add("타조");
    treeSet2.add("송아지");
    treeSet2.add("악어");
    treeSet2.add("다람쥐");
    treeSet2.add("양");

    // 문자열 정렬 ( 아스키 코드 순서) A= > Z, ㄱ = > ㅎ 영어는 ( 공백 > 숫자 >  대분자 >  소문자 >  순으로 정렬)
    System.out.println(treeSet2); // [고양이, 다람쥐, 사자, 송아지, 악어, 양, 타조]

    System.out.println(" 가장 낮은 단어" + treeSet2.first());
    System.out.println(" 가장 높은 단어" + treeSet2.last());
    System.out.println("사자 보다 작은 값 ( 전체)" + treeSet2.headSet("사자"));
    System.out.println("사자 보다 큰  값 (전체) " + treeSet2.tailSet("사자"));
    System.out.println("사자 보다 큰  값 (하나 )" + treeSet2.lower("사자"));

    System.out.println("사자 보다 큰  값 ( 하나)" + treeSet2.higher("사자"));

    while (!treeset.isEmpty()) {
      System.out.print(", " + treeset.pollLast()); // 내림 차순으로 객체 가져오기
    }
  }
}
