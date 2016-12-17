package Sorting;

/**
 * Created by piyush.bajaj on 02/10/16.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {5, 4, 1, 2, 10, 3, 2};
        //SelectionSortAlgo(a);
        SelectionSortAlgo_Improved(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
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
