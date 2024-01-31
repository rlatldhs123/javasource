package ch1;

public class PromotionEx1 {public static void main(String[] args) {
    // 자동 형 (type) 변환      
            // 정수형, 문자형/실수형/논리형    
            // 타입 변환이 가능하지만 : 작은 타입 => 큰 타입으로만 가능하다 

            byte v1 = 10;
            int intvalue = v1;



            short s1 = 15;
            intvalue = s1;
            System.out.println("intvalue = " + intvalue);



            char ch1 = 'a'; // 
            intvalue = ch1;
            System.out.println("intvalue = " + intvalue);

            //8byte

            long longhvalue = intvalue;
            System.out.println("longvalue =  "+ longhvalue);

            double doublevalue = intvalue;
            System.out.println("doublevalue =  " + doublevalue); //intvalue 가 더블로 가게되면서 소수점이 자동으로 붙음
            
            //int 4byte => float 4byte
            // float 타입이 int 보다 더 정밀한 수를 표현 할 수 있음
            
            float floatvalue = intvalue;
            System.out.println("floatvalue = " + floatvalue);
            
            // int + duble
            intvalue = 55;
            doublevalue = 98.25d;

            double result =intvalue + doublevalue;
            System.out.println("int + duble = duble 타입으로 변환됨");
            System.out.println(result);

            // byte 와 byte 를 더하면 int 로 바꿔 버린다
            
            byte v2= 15;
            int bytevalue = v1 + v2;

            // 정수를 변수에 담는다면 int 를 사용하는게 편하다

            






         
}
    
}
