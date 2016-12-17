package QueueExample;

import java.util.Stack;

/**
 * Created by piyush.bajaj on 11/12/16.
 */
public class ReversingQueue {

    public void reverseQueue(QueueUsingLinkedList Que){
        Stack<Integer> stk = new Stack<>();
        while (!Que.isEmpty())
            stk.push(Que.deque());
        while (!stk.isEmpty())
            Que.enqueue(stk.pop());

    }

    public static void main(String[] args) {
        ReversingQueue RQ = new ReversingQueue();

        QueueUsingLinkedList Qu = new QueueUsingLinkedList();
        Qu.enqueue(5);
        Qu.enqueue(7);
        System.out.println(Qu.displayQueue());
        RQ.reverseQueue(Qu);
        System.out.println(Qu.displayQueue());


    }
}
