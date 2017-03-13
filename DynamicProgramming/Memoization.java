package DynamicProgramming;

/**
 * Created by piyush.bajaj on 23/01/17.
 */
public class Memoization {
    public int fib(int n){
        if(n <=1) {
            //System.out.print(n + " ");
            return n;
        }
        //System.out.print((fib(n-1) + fib(n-2)) + " ");
        return fib(n-1) + fib(n-2);
    }

    /* Function to initialize NIL values in lookup table */
    int Max = 100;
    int Nil = -1;

    int[] lookup = new int[Max];

    public void initialize(){
        int i;
        for(i = 0; i < Max; i++)
            lookup[i] = Nil;
    }

    public int fib_Mem(int n){
        if(lookup[n]==Nil){
            if(n <= 1)
                lookup[n] = n;
            else
                lookup[n] = fib(n-1) + fib(n-2);
        }

        return lookup[n];
    }


    public static void main(String[] args) {
        Memoization mem = new Memoization();
        System.out.println(mem.fib(4));

        mem.initialize();
        System.out.println(mem.fib_Mem(4));
    }
}
