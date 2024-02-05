import java.security.PublicKey;

public class Calss {


    private String accountInfo = "3333-10-8698692"; // 계좌번호


    private int balance = 0; // 현재 잔액 //

    public void printAccountInfo(){
        System.out.println("계좌 번호는 :  + " +accountInfo +" 입니다");
    } // 계좌번호를 알려주는 메소드





    public void printBalance (){
        System.out.println("현재 잔액은 : "+ balance + "입니다");
    } // 현재 잔액을 알려주는 메소드







    public void deposit (int amount) // 변수로 받는 데이터 타입 
    //  변수 지정
    {
        System.out.println(amount + "원을 입금 하셨습니다");
        balance+= amount; 

    } // 입금을 하는 메소드






    public void Withdraw (int amount)// 변수로 받는 데이터 타입
    {
        if (balance< amount) {
            System.out.println("잔액보다 많은 금액은 출금 하실 수 없습니다"+ amount);
           
            }
            else {
                System.out.printf("정상적으로 출금 되었습니다 남은 잔액은 : %d 원입니다",balance-amount);

                balance-= amount;
            
        }


    } // 출금을 하는 메소드

    public class ClassEx {public static void main(String[] args) {
    

        ClassEx account1 = new ClassEx(); // 파일 명을 따라가야 하기 때문에 이렇게 설정
        
        
        account1.printAccountInfo();
        account1.
        account1.
        account1.
        account1.
        account1.
        





     



        
    }





    
    

    
    
    

