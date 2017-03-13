package BinaryTreeExample;

import java.util.ArrayList;

/**
 * Created by piyush.bajaj on 01/01/17.
 */
public class SwappingNodesBST {
    Node root;
    public static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public SwappingNodesBST(){
        root = null;
    }

    public SwappingNodesBST(int key){
        root = new Node(key);
    }

    public void insert_BST(Node key, int data){
        if(key==null)
            return;
        while (key!=null) {
            if (data < key.data) {
                if (key.left != null) {
                    key = key.left;
                }
                else {
                    key.left = new Node(data);
                    return;
                }
            }
            else {
                if (key.right != null) {
                    key = key.right;
                }
                else {
                    key.right = new Node(data);
                    return;
                }
            }
        }
    }

    public static ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> inOrderTraversal(Node key){
        if(key==null)
            return res;
        else {
            inOrderTraversal(key.left);
            res.add(key.data);
            inOrderTraversal(key.right);
        }
        return res;
    }

    //Using InOrder Traversal Technique here
    public void detectingTwoSwapNodes(Node key){
        Node first, middle, last;

        if(key == null )
            return;

        detectingTwoSwapNodes(key.left);

        if(prev!=null && prev.data > key.data){
            if(firstNode == null && secondNode == null){
                firstNode = prev;
                secondNode = key;
            }
            else
                secondNode = key;
        }
        prev = key;

        detectingTwoSwapNodes(key.right);
    }

    public void swap(Node first, Node second){
        int temp = first.data;
        first.data = second.data;
        second.data = temp;
    }



    public static Node prev = null;
    public static Node firstNode = null;
    public static Node secondNode = null;

    public static void main(String[] args) {
        SwappingNodesBST BT = new SwappingNodesBST(6);
        BT.insert_BST(BT.root, -13);
        BT.insert_BST(BT.root, 14);
        BT.insert_BST(BT.root, -8);
        BT.insert_BST(BT.root, 15);
        BT.insert_BST(BT.root, 13);
        BT.insert_BST(BT.root, 7);

        System.out.println(BT.inOrderTraversal(BT.root));

        System.out.println("After swapping two nodes: ");

        BT.root.left.data = 14;

        BT.root.right.data = -13;


        res.clear();

        System.out.println(BT.inOrderTraversal(BT.root));

        BT.detectingTwoSwapNodes(BT.root);

        BT.swap(firstNode, secondNode);

        res.clear();

        System.out.println("After putting back the swapped nodes: ");

        System.out.println(BT.inOrderTraversal(BT.root));

    }
}
