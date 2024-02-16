package util;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackEx1 {

  public static void main(String[] args) {
    // Stack 나중에 들어간게 먼저나온다 LIFP(Last in First Out)- 수식 계산, 수식괄호검사,undo/redo 웹 브라우저의 뒤로 / 앞으로 구조
    // Queue 먼저 들어간 것이 먼저 나온다 FIFO(First In First Out) - 최근사용문서,인쇄작업 대기목록, 버퍼

    Stack<String> stack = new Stack<>();
    Queue<String> queue = new LinkedList<>();

    // Stack : push() / pop()
    stack.push("0");
    stack.push("1");
    stack.push("2");
    stack.push("3");
    stack.push("4");

    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }

    //offer()에 넣고  poll() 에서 꺼낸다

    queue.offer("사과");
    queue.offer("딸기");
    queue.offer("배");
    queue.offer("바나나");
    queue.offer("수박");

    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }
  }
}
