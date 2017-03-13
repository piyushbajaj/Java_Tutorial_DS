package Sorting;

/**
 * Created by piyush.bajaj on 02/10/16.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {5, 4, 1, 2, 10, 3, 2};
        //SelectionSortAlgo(a);
        //SelectionSortAlgo_Improved(a);

        selectSort_prac(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

    }

    //Practice
    public static void selectSort_prac(int[] arr){
        int n = arr.length-1;
        int min = 0, temp =0;
        for(int i = 0; i <= n; i++){
            min = i;
            for(int j = i+1; j <= n; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }









    public static int[] SelectionSortAlgo(int a[]){
        int i, j, min, temp;
        for(i=0; i < a.length; i++){
            min = i;
            for(j=i+1; j < a.length; j++){
                if(a[j] < a[min])
                    min = j;
            }
            //swap min element
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        return a;
    }

    public static int[] SelectionSortAlgo_Improved(int a[]){
        int i, j, min, temp;
        boolean isSorted;
        for(i=0; i < a.length; i++){
            min = i;
            isSorted = true;
            for(j=i+1; j < a.length; j++){
                if(a[j] < a[min]) {
                    min = j;
                    isSorted = false;
                }
            }
            //swap min element
            if(isSorted) return a;
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;

        }
        return a;
    }



}
