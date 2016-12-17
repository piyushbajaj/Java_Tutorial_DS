package Array;

/**
 * Created by piyush.bajaj on 02/12/16.
 */
public class rotatedArrayClass {
    public static void rotatedArray(int arr[], int key){
        int n = arr.length;
        int pivot =0;
        for(int i =0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot==0){
            System.out.println("This is not a rotated array");
            binaryLook(arr, key, 0);
            return;
        }

        int[] subArr1 = new int[pivot + 1];
        int[] subArr2 = new int[n-(pivot+1)];

        for(int i = 0; i < pivot + 1; i++){
            subArr1[i] = arr[i];
        }

        for(int i = 0; i < n-(pivot+1); i++){
            subArr2[i] = arr[pivot + 1 + i];
        }

        if(key < subArr1[0])
            binaryLook(subArr2, key, (pivot + 1));
        else
            binaryLook(subArr1, key, 0);

    }



    public static void binaryLook(int[] arr, int key, int loc){
        int mid, first, last;
        first = 0;
        last = arr.length-1;
        mid = (first + last)/2;

        while (first<=last){
            if(arr[mid] < key){
                first = mid + 1;
            }
            else if(arr[mid] == key){
                System.out.println(key + " found at location " + (mid+ 1 + loc));
                return;
            }
            else {
                last = mid-1;
            }
            mid = (first + last)/2;
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 1, 2};
        int key = 1;
        rotatedArray(a, key);
    }
}
