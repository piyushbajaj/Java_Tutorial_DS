package Array;

/**
 * Created by piyush.bajaj on 02/12/16.
 */
public class BinarySearch {
    public static void binaryLook(int[] arr, int key){
        int mid, first, last;
        first = 0;
        last = arr.length-1;
        mid = (first + last)/2;

        while (first<=last){
            if(arr[mid] < key){
                first = mid + 1;
            }
            else if(arr[mid] == key){
                System.out.println(key + " found at location " + (mid+ 1));
                return;
            }
            else {
                last = mid-1;
            }
            mid = (first + last)/2;
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 6, 8, 9};
        int key = 8;
        binaryLook(a, key);
    }
}
