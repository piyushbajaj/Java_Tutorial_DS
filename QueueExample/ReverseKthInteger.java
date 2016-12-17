package QueueExample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by piyush.bajaj on 13/12/16.
 */
public class ReverseKthInteger {
    public void reversequeueFirstKth(int k, Queue<Integer> queue){
        Stack<Integer> stk = new Stack<>();

        for(int i =0; i < k; i++){
            stk.push(queue.remove());
        }

        while (!stk.empty())
            queue.add(stk.pop());

        int n = queue.size() - k;

        for(int i = 0; i < n; i++)
            queue.add(queue.remove());

    }

    public String displayQueue(Queue<Integer> queue){
        String s = "[";
        while (!queue.isEmpty()){
            s += queue.poll() + ",";
            //queue = queue.
        }
        s += "]";
        return s;
    }

    public static void main(String[] args) {
        ReverseKthInteger QC = new ReverseKthInteger();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);

        QC.reversequeueFirstKth(4, queue);

        System.out.println(QC.displayQueue(queue));

    }
}
