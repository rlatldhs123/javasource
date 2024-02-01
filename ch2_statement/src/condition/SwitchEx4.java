package condition;

public class SwitchEx4 {

  public static void main(String[] args) {
    char grade = 'B';

    // grade = A or a
    // grade = B or b
    // 디폴트  : 손님

    switch (grade) {
      case 'A':
      case 'a':
        System.out.println("우수회원");
        break;
      case 'B':
      case 'b':
        System.out.println("일반회원");
        break;
      default:
        System.out.println("손님");
        break;
    }
  }
}
