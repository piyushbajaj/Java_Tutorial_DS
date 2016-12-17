package Sorting;

/**
 * Created by piyush.bajaj on 06/10/16.
 */
public class MergeSort {

    Node head; //head of the list

    /* Linked List Node*/
    static class Node
    {
        int data;
        Node next;

        //Constructor to create a new node
        //Next is by default initialized as null

        Node(int d){
            data = d;
            next = null;
        }
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void MergeSortAlgo(int arr[], int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            MergeSortAlgo(arr, left, mid);
            MergeSortAlgo(arr, mid + 1, right);
            Merge(arr, left, mid, right);
        }
    }

    public static void Merge(int arr[], int left, int mid, int right){
        //will create two temporary arrays, so taking out the size for them

        int N1 = mid - left + 1;
        int N2 = right - mid;

        int[] L = new int[N1];
        int[] R = new int[N2];

        for(int i = 0; i < N1; i++){
            L[i] = arr[left + i];
        }

        for(int j = 0; j < N2; j++){
            R[j] = arr[mid + 1 + j];
        }

        //Now compare and push values to the original array
        int i=0;
        int j=0;
        int k=left;

        while(i<N1 && j<N2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
                k++;
            }
            else{
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        while(i<N1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j<N2){
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    public int getCount(Node Nd){
        int count=0;
        while(Nd!=null){
            count++;
            Nd = Nd.next;
        }
        return count;
    }

    public static void main(String[] args) {

        MergeSort list = new MergeSort();
        list.head = new Node(12);
        list.head.next = new Node(6);
        list.head.next.next = new Node(12);
        list.head.next.next.next = new Node(8);
        list.head.next.next.next.next = new Node(9);
        int count = list.getCount(list.head);
        Node Nd = list.head;
        Node temp = list.head;
        int a[] = new int[count];

        for(int i = 0; i < count && Nd!=null; i++){
            a[i] = Nd.data;
            Nd = Nd.next;
        }

        //int a[] = {5, 4, 1, 2, 10, 3, 2};

        //int a[] = {5, 4, 1};
        int l =0;
        int r = a.length -1;
        MergeSortAlgo(a, l, r);
        //SelectionSortAlgo_Improved(a);
        for(int i = 0; i < a.length && temp!=null; i++){
            temp.data = a[i];
            temp = temp.next;
        }
        list.printList(list.head);
    }
}
