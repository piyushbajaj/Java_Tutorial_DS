package Recursion;

/**
 * Created by piyush.bajaj on 13/03/16.
 */
public class sequence {
    public static void main(String[] args) {
     test(10);
    }

    public static void test(int n)
    {
        if(n==1){
            System.out.println(n);
        }
        else
        {test(n-1);
        System.out.println(n);}
    }

}
