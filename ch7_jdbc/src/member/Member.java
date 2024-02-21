package member;

import lombok.AllArgsConstructor;
//~~DTO : 생성자, 게터, 세터, 투스트링 [ 맨날 해야 하는 것]
// @Data : toString, Getter, Setter, defalt 생성자, equals, 해쉬코드

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor  // 이렇게 개별도 가능
public class Member {

  // @Data
  

 
  private String id;

  private String name;
  private String password;
}
