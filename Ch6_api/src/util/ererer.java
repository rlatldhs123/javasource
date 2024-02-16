package util;

import java.util.ArrayList;

public class ererer {

  public static void main(String[] args) {
    ArrayList<String> ar12 = new ArrayList<>();

    for (int i = 1; i <= 50; i++) {
      int fname = i;
      ar12.add("kim" + fname);
    }
    for (String nameahdma : ar12) {
      System.out.println(nameahdma);
    }
  }
}
