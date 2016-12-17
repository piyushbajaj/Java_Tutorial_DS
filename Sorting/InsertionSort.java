package Sorting;

/**
 * Created by piyush.bajaj on 02/10/16.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {5, 4, 1, 2, 10, 3, 2};
        InsertionSortAlgo(a);
        //SelectionSortAlgo_Improved(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }

    }

    public static int[] InsertionSortAlgo(int a[]){
     int i, j, v;
        for(i=1; i < a.length; i++){
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
