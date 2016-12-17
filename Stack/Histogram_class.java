package Stack;

import java.util.Stack;

/**
 * Created by piyush.bajaj on 10/12/16.
 */
public class Histogram_class {
    public static int maxArea(int[] intArr){
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        int maxArea = 0;
        int top =0;
        while (i< intArr.length){
            if(stk.isEmpty() || intArr[stk.peek()] <= intArr[i]){
                stk.push(i++);
            }
            else {
                top = stk.pop();
                maxArea = Math.max(maxArea, intArr[top] *(stk.isEmpty()? i: (i - stk.peek() - 1)));
            }
        }

        while (!stk.isEmpty()){
            top = stk.pop();
            maxArea = Math.max(maxArea, intArr[top] *(stk.isEmpty() ? i : (i - stk.peek() - 1)));
        }

        return maxArea;

    }

    public static void main(String[] args) {
        int[] intArr = {3, 2, 5, 6, 1, 4, 4};
        System.out.println("Maximum area is: " + maxArea(intArr));
    }
}
