package Array;

/**
 * Created by piyush.bajaj on 01/12/16.
 */
public class missingNumber {
    public static int missingNum(int[] arr){
        int n = arr.length + 1;
        int sum = n * (n+1)/2;
        for(int a: arr){
            sum = sum - a;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(missingNum(arr));
        //missingNum(arr);

    }
}
