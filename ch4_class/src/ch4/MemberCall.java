package ch4;

public class MemberCall {

    int iv = 10;  // 인스턴스 변수
    static int cv = 20; // 클래스 변수

    // 메소드에도 static 이 붙을 수 있음
//
// 
// 
// 
// 클래스 메소드
// 클래스 메소드도 클래스가 로딩 될 때 생성된다

    static void staticMethod1() {

        System.out.println(iv);  // 인스턴스 변수  int iv 로 설정 되어 있을떄 오류가 뜬다
                                 // 인스턴스 변수는 인스턴스를 생성 해야 올라 온다
                                 // main Ex 에서 클래스 변수 = new 클래스 를 생성해야 함

          
                                 
       
                                 
                                 System.out.println(cv); // 스태틱은 해당 구문인 cv 만 입력해도 올라옴

           
           void instanceMethod1() {
            System.out.println(iv);
            System.out.println(cv);

           }                      


    }


    
    

