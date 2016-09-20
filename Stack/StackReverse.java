package Stack;

import java.util.Stack;

/**
 * Created by piyush.bajaj on 18/09/16.
 */
public class StackReverse {
    public static void insertAtBottom(Stack<Integer> s,int data){
        int temp;
        if(s.isEmpty())
            s.push(data);
        else{


            temp = s.pop();
            insertAtBottom(s, data);

            s.push(temp);

        }



    }


    public static Stack reverse(Stack<Integer> s){
       if(!s.isEmpty()){
           int temp = s.pop();
           reverse(s);

           insertAtBottom(s, temp);


       }
        return s;
    }


    public void sortStack(Stack<Integer> s){
        int x, y;
        if(!s.isEmpty()){
            x = s.pop();
            y = s.pop();
        }
    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s);
        System.out.println(reverse(s));

        //System.out.println(insertAtBottom(s));


        //reverse(s);

    }
}
