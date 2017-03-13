package Sorting;

/**
 * Created by piyush.bajaj on 15/01/17.
 */
public class QuickSort {



    public int[] quickSort(int[] arr, int low, int high){
        if(low < high){
            //pivot_index is the partitioning index
            int pivot_index = partition(arr, low, high);

            quickSort(arr, low, pivot_index-1);
            quickSort(arr, pivot_index+1, high);
        }
        return arr;
    }

    ///This is done considering that last element is the pivot
    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int i = low-1;

        for(int j = low; j <= high-1; j++){
            if(arr[j] <= pivot){
                i++;
                swap(i, j, arr);
            }
        }
        //Final Swap
        swap(i+1,high,arr);
        return (i+1);
    }

    public void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort QS = new QuickSort();
        int[] arr = {10, 80, 30, 90, 40, 50, 100};
        int low = 0;
        int high = arr.length-1;
        System.out.println("Original Array: ");
        QS.printArray(arr);
        System.out.println("After applying Quick Sort in an Array: ");
        //QS.quickSort(arr, low, high);
        //QS.printArray(arr);

        QS.quickSort_prac(arr, low, high);
        QS.printArray(arr);
    }

    //practice

    public void quickSort_prac(int[] arr, int l, int h){
        if(l < h){
            int pivot = partition(arr, l, h);
            quickSort_prac(arr, l, pivot-1);
            quickSort_prac(arr, pivot + 1, h);
        }
    }

    public int partition_prac(int[] arr, int l, int h){
        int pivot = arr[h];

        int i = l-1;
        for(int j = l; j <= h -1; j++){
            if(arr[j] <= pivot){
                i++;
                swap(i, j, arr);
            }
        }

        i++;
        swap(i, h, arr);
        return i;
    }
}
