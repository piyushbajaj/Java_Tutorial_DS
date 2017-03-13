package Array;

/**
 * Created by piyush.bajaj on 17/01/17.
 */
public class reverseArray {
    public int[] reverseArr(int[] arr, int s, int e){
        int n = arr.length;

        if(n==0)
            return null;
        else if(n==1)
            return arr;
        else {

            for(int i = 0; i < n/2; i++) {
                s = i;
                swap(arr, s, e);
                e--;
            }
            return arr;
        }

    }

    //much better approach

    public void reverseArray_Improved(int[] arr, int s, int e){
        //int temp;
        while (s < e){
          swap(arr, s, e);
            s++;
            e--;
        }
    }

    public void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    public static void main(String[] args) {
        reverseArray RA = new reverseArray();
        int[] arr = {10, 14, 16, 5, 7, 50};

        System.out.println("Original Array: ");
        RA.printArray(arr);

//        RA.reverseArr(arr, 0, arr.length - 1);
//        RA.printArray(arr);

        RA.reverseArray_Improved(arr, 0, arr.length - 1);
        RA.printArray(arr);
    }
}
