package Array;

import java.util.Scanner;

/**
 * Created by piyush.bajaj on 04/09/16.
 */
public class ArrayExamples {
    public static void main(String[] args) {
        System.out.println("enter the length of Array: ");
        Scanner n = new Scanner(System.in);
        int length = n.nextInt();
        int[] number = new int[length];
        int count = 0;

        System.out.println("Enter the number one by one: ");
        for (int i = 0; i < length; i++) {
            number[i] = n.nextInt();
        }

        System.out.println("Enter the number to cross-check the sum: ");
        int z = n.nextInt();

        boolean b = checkPairSum(number, z, length);

        System.out.println("Is the sum of two numbers in array is equal to " + z + ": " + b);
    }

    public static boolean checkPairSum(int A[], int x, int length){
        for(int i=0; i < length ; i++){
            for(int j=i+1; j < length ; j++){
                if(A[i] + A[j] == x)
                    return true;
            }
        }
        return false;
    }
}
