package Sorting;

/**
 * Created by piyush.bajaj on 02/10/16.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {5, 4, 1, 2, 10, 3, 2};
        InsertionSortAlgo(a);
        //SelectionSortAlgo_Improved(a);

        insertSort_prac(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

    }

    //Practice
    public static void insertSort_prac(int[] arr){
        int n = arr.length-1;
        int temp =0, j=0;
        for(int i = 1; i <= n; i++ ){
            temp = arr[i];
            j = i;

            while (arr[j-1] > temp && j >= 1){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }











    public static int[] InsertionSortAlgo(int a[]){
     int i, j, v;
        for(i=2; i < a.length; i++){
            v = a[i];
            j = i;
            while (j>=1 && a[j-1] > v){
                a[j] = a[j-1];
                j--;
            }
            a[j] = v;
        }
        return a;
    }
}
