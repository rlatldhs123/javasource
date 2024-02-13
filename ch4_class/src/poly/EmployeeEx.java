package poly;

public class EmployeeEx {

  public static void main(String[] args) {
    Employee employee = new Employee("홍길동", "사원");

    work(employee);

    // employee = new Ceo("김유신", "회장");
    // employee.work();
    Ceo ceo = new Ceo("김유신", "회장");
    // ceo.work();
    work(ceo); //  = employee = ceo; 이거와 같다

    // employee = new Admin("김동호", "관리자");
    // employee.work();

    Admin admin = new Admin("김동호", "관리자");

    // employee = new PartTime("정우성", "아르바이트");
    // employee.work();

    PartTime partTime = new PartTime("정우성", "아르바이트");
    // partTime.work();

    work(partTime); // = employee = parttime;
    //
    //
    //
    //   결과는 똑같다
  }

  public static void work(Employee employee) {
    // employee.work();
    // work 전용 메소드
    // 메인에서 참조한 메소드는 메인을 벗어나면 부를 수가 없다

  }
}
