package Array;

/**
 * Created by piyush.bajaj on 03/12/16.
 */
public class mergeArray {
    public static void mergeTwoArray(int[] small, int[] big){
        int nBig = big.length;
        int nSmall = small.length;
//        int j = nSmall-1;
//        for(int i = nBig -1; i >= 0; i--){
//            if(big[i] <= small[j] ){
//                int temp = big[i];
//                big[i] = small[j];
//                small[j] = temp;
//            }
//            //j--;
//            if(small[j] < small[j-1]){
//                int temp = small[j];
//                small[j] = small[j-1];
//                small[j-1] = temp;
//            }
//
//        }
        int i = nSmall;
        int j =0, k =0;

        while(k < nBig){
            if(i< nBig && big[i] <= small[j]){
                big[k] = big[i];
                k++;
                i++;
            }
            else {
                big[k] = small[j];
                k++;
                j++;
            }
        }
        printArray(big);
    }

    public static void printArray(int[] arr){
        System.out.print("After merging two sorted arrays, output is: ");
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void moveElementToLast(int[] big){
        int n = big.length;
        int j = n-1;
        for(int i = n-1; i >= 0; i--){
            if(big[i] != -1){
                big[j] = big[i];
                if (i<j)
                    big[i] = -1;
                j--;
            }
        }

    }


    public static void main(String[] args) {
        int[] big = {2, 8, -1, -1, -1, 13, -1, 15, 20};
        int[] small = {5, 7, 9, 25};
        moveElementToLast(big);
        mergeTwoArray(small, big);
    }
}
