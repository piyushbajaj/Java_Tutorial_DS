package Stack;

import java.util.Stack;

/**
 * Created by piyush.bajaj on 19/09/16.
 */
public class StackSort {
    //We can use below algorithm to sort stack elements:
    public static void sortAStack(Stack<Integer> s){
        int temp=0;
        if(!s.isEmpty()){
            temp = s.pop();
            sortAStack(s);
            sortedInsert(s, temp);

        }
    }

    //Below algorithm is to insert element is sorted order:
    public static void sortedInsert(Stack<Integer> s, int data){
        int temp =0;
        if(s.isEmpty() || data > s.peek())
            s.push(data);
        else{
            temp = s.pop();
            sortedInsert(s, data);
            s.push(temp);
        }
    }

    public static void displayStack(Stack<Integer> s){
        if(!s.isEmpty()){
            System.out.println(s.pop());
            displayStack(s);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);
        displayStack(s);
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);
        System.out.println("Element on the top: " + s.peek());
        sortAStack(s);
        displayStack(s);
    }
}
