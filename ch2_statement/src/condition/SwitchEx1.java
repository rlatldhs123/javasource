package condition;

public class SwitchEx1 {

  public static void main(String[] args) {
    //if ~else if 처리 대체

    char ch1 = 'a';

    switch (ch1) {
      case 'a':
        System.out.println("a 입니다");
        break;
      case 'b':
        System.out.println("b 입니다");
        break;
      default:
        break;
    }
  }
}
