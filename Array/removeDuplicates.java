package Array;

import java.util.Arrays;

/**
 * Created by piyush.bajaj on 08/02/17.
 */
public class removeDuplicates {

    public void removeDup(int[] arr){
        Arrays.sort(arr);

        int[] result = new int[arr.length];
        int prev = arr[0];
        result[0] = prev;
        int count = 0;

        for(int i = 1; i < arr.length; i++){
            int ch = arr[i];
            if(prev != ch)
                result[i] = ch;
            else
                count++;
            prev = ch;
        }
        printArray(result);

        int diff = arr.length - count;
        int[] res = new int[diff];
        int j = 0;

        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                res[j++] = arr[i];
            }
        }
        res[j] = arr[arr.length-1];
        printArray(res);



        return;
    }

    public void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        removeDuplicates rd = new removeDuplicates();

        System.out.println("Original Array is: ");


        int[] arr = {1, 1, 2, 2, 3, 4, 5};
        rd.printArray(arr);

        rd.removeDup(arr);
    }
}
