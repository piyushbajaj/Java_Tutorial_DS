package Sorting;

/**
 * Created by piyush.bajaj on 01/10/16.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {5, 4, 1, 2, 10, 3, 2};
        //BubbleSortAlgo(a);
        //BubbleSortAlgo_Improved(a);
        bubbleSort_prac(a);

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }



    //Practice


    public static void bubbleSort_prac(int[] arr){
        int n = arr.length-1;
        int temp = 0;
        boolean flag = true;
        for(int i = n; i >=0 && flag; i--){
            flag = false;
            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
        }

    }































    public static int[] BubbleSortAlgo(int a[]){
        for(int i = a.length -1 ; i >=0; i--){
            for(int j = 0; j <= i-1; j++ ){
            //Here i-1 is kept to make sure that every time the greatest element is reaching at the end of an array
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }

    public static int[] BubbleSortAlgo_Improved(int a[]){
        //int swapped = 1;
        for(int i = a.length -1 ; i >=0; i--){
            boolean is_sorted = true;
            for(int j = 0; j <= i-1; j++ ){
                //Here i-1 is kept to make sure that every time the greatest element is reaching at the end of an array
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    is_sorted = false;
                }
            }
            if(is_sorted) return a;
        }
        return a;
    }
}
