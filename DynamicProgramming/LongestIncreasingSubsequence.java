package DynamicProgramming;

/**
 * Created by piyush.bajaj on 23/01/17.
 */
public class LongestIncreasingSubsequence {

    //This takes time complexity: O(n*n)
    public void longestSub(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];

        for(int i =0; i < n; i++){
            temp[i] = 1;
        }

        int k = 1;
        for(int i =k; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i])
                    temp[i] = Math.max(temp[i], temp[j]+1);
                if(j==i)
                    break;
            }
        }

        System.out.println(temp[n-1]);
    }


    public int longestSub_improved(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        int j = 1;

        for(int i = 0; i < n; i++)
            temp[i] = -1;

        temp[0] = arr[0];
        for(int i = 1; i < n; i++){
           if(arr[i] < temp[0])
               arr[i] = temp[0];

           else if(arr[i] > temp[j-1])
                temp[j++] = arr[i];

            else {

               temp[ceilValue(temp, -1, j-1, arr[i])] = arr[i];

//               if (arr[i] > temp[j - 2] && arr[i] < temp[j - 1])
//                   temp[j - 1] = arr[i];
           }
        }
    return j++;
    }

    //Using the logic from Binary search
    public int ceilValue(int[] temp, int l, int r, int key){
        while (r-l>1) {
            int m = l + (r-l)/2;
            if(temp[m] >= key)
                r = m;
            else
                l = m;
        }
        return r;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence LI = new LongestIncreasingSubsequence();
        //int m = -1+ 1/2;

        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};

        int[] arr1 = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3,11, 7, 15};
                //{50, 3, 10, 7, 40, 80};

        //LI.longestSub(arr);
        //Output: Len= 4; 3, 10, 40, 80


        System.out.println(LI.longestSub_improved(arr1));
    }
}
