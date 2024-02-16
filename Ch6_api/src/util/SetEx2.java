package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {

  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();

    //1~45 사이에 숫자를 임의로 새엇ㅇ

    // 랜덤 숫자 생성

    // for (int i = 0; i < 7; i++) {
    //   int num1 = (int) (Math.random() * 45) + 1;
    //   set.add(num1);
    // }
    // System.out.println(set);

    for (int i = 0; i < 7; i++) {
      int num1 = (int) (Math.random() * 45) + 1;
      set.add(num1);
    }
    System.out.println();
    //set == > List 로 갈 수 있을까?

    List<Integer> list = new ArrayList<>(set); // set  구조\안에 있는 로또 번호를 List 형태로 바꾸기

    list.sort(Comparator.naturalOrder()); // 바뀐 list 구조를 오름차순으로 정리
    System.out.println(list);

    ArrayList list2 = new ArrayList<>();
    list2.add(35);
    list2.add(45);
    list2.add(55);
    list2.add(55);

    Set<Integer> set2 = new HashSet<>(list2);
    System.out.println(set2);

    // 중복을 판별하기 위한 코드가 Member 에서는 없었다 그러므로 저장이 된거다
    // 중복을 판별해주기 위한 코드가 따로 필요하다
    // equals() , Hashcode() 를 오버라이딩 해야함
    Set<Member> set3 = new HashSet<>();

    Member member = new Member();
    member.setId("hong123");
    member.setName("홍길동");
    set3.add(member);

    member = new Member();
    member.setId("hong123");
    member.setName("홍길동");
    set3.add(member);

    for (Member mem : set3) {
      System.out.println(mem);
    }
  }
}
