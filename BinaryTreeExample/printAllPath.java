package BinaryTreeExample;

/**
 * Created by piyush.bajaj on 19/12/16.
 */
public class printAllPath {
    Node root;
    public static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public printAllPath(){
        root = null;
    }

    public printAllPath(int key){
        root = new Node(key);
    }

    public void printPaths(Node key){
        int[] path = new int[256];
        printPaths(key, path, 0);
    }

    public void printPaths(Node key, int[] path, int pathLen){
        if(key == null)
            return;
        path[pathLen] = key.data;
        pathLen++;

        if(key.left == null && key.right == null)
            printArray(path, pathLen);
        else {
            printPaths(key.left, path, pathLen);
            printPaths(key.right, path, pathLen);
        }
    }

    public void printArray(int[] arr, int len){
        for(int i = 0; i < len; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printAllPath BT = new printAllPath(1);
        System.out.println("Root: " + BT.root.data);
        BT.root.left = new Node(2);
        System.out.println("Root ("+ BT.root.data +") -> Left: " + BT.root.left.data);
        BT.root.right = new Node(3);
        System.out.println("Root ("+ BT.root.data +") -> Right: " + BT.root.right.data);
        BT.root.left.left = new Node(4);
        System.out.println("Root ("+ BT.root.data +") -> Left ("+ BT.root.left.data + ") -> Left: " + BT.root.left.left.data);
        BT.root.left.right = new Node(5);
        System.out.println("Root ("+ BT.root.data +") -> Left ("+ BT.root.left.data + ") -> Right: " + BT.root.left.right.data);
        BT.root.right.left = new Node(6);
        System.out.println("Root ("+ BT.root.data +") -> Right ("+ BT.root.right.data + ")-> Left: " + BT.root.right.left.data);
        BT.root.right.right = new Node(7);
        System.out.println("Root ("+ BT.root.data +") -> Right ("+ BT.root.right.data + ") -> Right: " + BT.root.right.right.data);

        BT.printPaths(BT.root);
    }
}
