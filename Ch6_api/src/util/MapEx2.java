package util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import javax.sound.midi.SysexMessage;

public class MapEx2 {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();

    map.put("myId", "1234");
    map.put("asdf", "1111");
    map.put("asdf", "1234");
    // 키 값은 중복이 허용되지 않으며 키가 중복이라면 나중 것이 키 값의 적용 된다

    Set<String> keys = map.keySet();
    System.out.println(keys);

    // value 값 모두 가져오기

    Collection<String> values = map.values();
    System.out.println(values);

    Scanner sc = new Scanner(System.in);
    //
    //
    // 아이디와 비밀번호를 입력 받아서 map 의 들어 있는지 확인 하는 것을 만들기

    while (true) {
      System.out.println("아이디와 비밀번호를 입력하세요");
      System.out.println("아이디 : ");
      String id = sc.nextLine().trim(); // trim 으로 혹여나 모를 공백값 입력시 공백 제거
      System.out.println("비밀번호 : ");
      String pass = sc.nextLine().trim();

      if (!map.containsKey(id)) { // containskey 로가지고 있는지 물어보기 {
        System.out.println(
          "입력하신 아이디는 가지고 있지 않습니다 다시 입력해주세요"
        );
        continue;
      } else {
        // 비밀번호가 일치하는지 확인
        // value 값 중 비밀번호가 일치하는지 확인
        if (!values.equals(pass)) {
          System.out.println("비밀번호가 일치하지 않습니다 다시 입력해주세요");
          continue;
        }
        if (!map.get(id).equals(pass)) {
          System.out.println(
            "입력하신 아이디와 비밀번호는 존재하지 않습니다 다시 입력해주세요"
          );
        } else {
          System.out.println("아이디와 비밀번호는 일치합니다");
          break;
        }
      }
    }
  }
}
