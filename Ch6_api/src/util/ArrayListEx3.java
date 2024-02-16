package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx3 {

  public static void main(String[] args) {
    // Member 객체를 사용자 입력을 받아서 ArrayList 로 구현

    List<Member> list = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 4; i++) {
      System.out.println("아이디 입력 >> ");
      String id = sc.nextLine();

      System.out.println("이름 입력 >> ");
      String name = sc.nextLine();

      Member member = new Member();
      member.setId(id);
      member.setName(name);
      list.add(member);
    }
  }
}
