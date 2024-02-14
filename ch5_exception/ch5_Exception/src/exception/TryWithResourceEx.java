package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceEx {

  public static void main(String[] args) {
    // FileInputStream fis = null;

    // try {
    //     fis = new FileInputStream("Test.txt");
    // } catch (FileNotFoundException e) {
    //     // TODO Auto-generated catch block
    //     e.printStackTrace();
    // }finally{
    //     if(fis!=null){
    //         try {
    //             fis.close();
    //         } catch (IOException e) {
    //             // TODO Auto-generated catch block
    //             e.printStackTrace();
    //         }
    //     }

    // }

    // try 안에는  close 할 객체들이 들어감
    // 자동으로 닫아줌  (finally) 를 명시하지 않아도 됨

    //try with resource 자동 자원 반환
    try (FileInputStream fis = new FileInputStream("test.txt")) {
      fis.read();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
