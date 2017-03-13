package BinaryTreeExample;

/**
 * Created by piyush.bajaj on 03/01/17.
 * Total number of possible Binary Search Trees with n different keys = Catalan number Cn = (2n)!/(n+1)!*n!
 */
public class CatalanNumber {
    int catalan(int n){
        int res = 0;

        if(n<=1)
            return 1;

        for(int i = 0; i < n; i++){
            res += catalan(i) * catalan(n-i-1);
        }
        return res;
    }

    public static void main(String[] args) {
        CatalanNumber CN = new CatalanNumber();
        System.out.println("Hence first 10 catalan numbers are: ");
        for(int i = 0; i < 10; i++) {
            System.out.print(CN.catalan(i) + " ");
        }
    }
}
