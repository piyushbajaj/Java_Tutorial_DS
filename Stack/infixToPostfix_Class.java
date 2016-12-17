package Stack;

import java.util.Stack;

/**
 * Created by piyush.bajaj on 09/12/16.
 */
public class infixToPostfix_Class {
    public boolean isOperand(char ch){
        return ((ch>= 'a' && ch <= 'z')|| (ch>='A' && ch <= 'Z'));
    }

    public int Precedence(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public String infixToPostfix(String s){
        Stack<Character> ST = new Stack<>();
        int k =-1;

        char[] chArr = s.toCharArray();

        for(char ch: chArr)
        {

            if(isOperand(ch))
                chArr[++k] = ch;
            else if(ch == '(')
                ST.push(ch);
            else if(ch == ')'){
                while (ST.peek()!= '('){
                    chArr[++k] = ST.pop();
                }
                ST.pop();
            }
            else {
                while (!ST.isEmpty() && Precedence(ch) <= Precedence(ST.peek())){
                    chArr[++k] = ST.pop();
                }
                ST.push(ch);
            }
        }

        while (!ST.isEmpty())
            chArr[++k] = ST.pop();

        char[] new_char = new char[k+1];

        for(int i=0; i < new_char.length; i++)
            new_char[i] = chArr[i];

        return String.valueOf(new_char);
    }

    public static void main(String[] args) {
        infixToPostfix_Class PC = new infixToPostfix_Class();
        String s = "A*B-(C+D)+E";
        System.out.println(PC.infixToPostfix(s));

    }
}
