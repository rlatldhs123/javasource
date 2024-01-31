package ch1;

public class CastingEx1 {
    
    public static void main(String[] args) {
    
// 강제 형변환 : casting  

// 큰 타입을 작은 타입으로 강제로 바꾸는 것
// 값의 손실이 일어날 수 있다
// System.out.println("bytevalue = " + bytevalue); //-127이 뜬다 왜?? 강제로 형변환을 하게되면 값의 손실이 나온다
// 손실이 일어나도 괜찮은 정도 파일이면 타입변환을 시켜도 좋다


int intvalue = 129;
 byte bytevalue = (byte) intvalue;

 int intValue = 129;
 byte byteValue = (byte) intValue;
 
 intValue = 44032;
 char charValue = (char) intValue;
 System.out.println("charValue = " + charValue);

 

 double doublevalue = 3.1514d;
 intvalue = (int) doublevalue;
 System.out.println("intvalue = " + intvalue);

 int num1 = 123456780, num2 = 123456780;
// 자동 형변환
 float num3 = num1;
 double num4 = num2;
 System.out.println("num3 = " + num3+ "num4 = " +num4);






 num2 =(int) num3;
 num1 = (int) num4;
 
 System.out.println("num1 = " + num1+ "num2 = " +num2);

 int result = num1 - num2;
 System.out.println( "result = " + result);




}
    
}
