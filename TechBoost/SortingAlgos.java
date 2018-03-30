package TechBoost;

/**
 * Created by piyush.bajaj on 22/03/18.
 */
public class SortingAlgos {

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public void selection_Sort(int[] arr){
        int len = arr.length;

        int min = 0;

        for(int i = 0; i < len; i++){
            min = i;
            for(int j = i+1; j < len; j++){
                if(arr[j] < arr[min])
                    min = j;
            }
            swap(arr, i, min);
        }
    }

    public void insertion_sort(int[] arr){
        int len = arr.length;

        for(int i = 1; i < len; i++){
            int V = arr[i];
            int j = i-1;

            while ( j >= 0 && arr[j] > V ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = V;
        }
    }

    public void bubble_sort(int[] arr){
        int len = arr.length;

        for(int i = len-1 ; i >=0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1])
                    swap(arr, j, j+1);
            }
        }
    }

    public static void main(String[] args) {
        SortingAlgos sortingAlgos = new SortingAlgos();
        int[] A = {6, 4, 2, 1, 3, 5};
        sortingAlgos.selection_Sort(A);
        System.out.print("Selection Sort: ");
        sortingAlgos.printArray(A);

        int[] A1 = {6, 4, 2, 1, 3, 5};
        System.out.println();
        sortingAlgos.insertion_sort(A1);
        System.out.print("Insertion Sort: ");
        sortingAlgos.printArray(A1);

        int[] A2 = {6, 4, 2, 1, 3, 5};
        System.out.println();
        sortingAlgos.bubble_sort(A2);
        System.out.print("Bubble Sort: ");
        sortingAlgos.printArray(A2);
    }
}
