package BinaryTreeExample;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by piyush.bajaj on 19/12/16.
 */
public class sumOfAllElements {
    Node root;
    public static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public sumOfAllElements(){
        root = null;
    }

    public sumOfAllElements(int key){
        root = new Node(key);
    }

    public int sumofAllElementsInBT(Node key){
        if(key == null)
            return 0;
        return (key.data + sumofAllElementsInBT(key.left) + sumofAllElementsInBT(key.right));
    }


    //Using Level Order Traversal
    public int sumofAllElementsInBT_Iterative(Node key){
        if(key == null)
            return 0;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(key);
        int sum=0;
        while (!queue.isEmpty()){
            Node temp = queue.remove();
            sum += temp.data;

            if(temp!=null){
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        sumOfAllElements BT = new sumOfAllElements(1);
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

        System.out.println("So the sum of all the nodes in the BT: " + BT.sumofAllElementsInBT(BT.root));

        System.out.println("So the sum of all the nodes in the BT using Iterative approach is: " + BT.sumofAllElementsInBT_Iterative(BT.root));

    }
}
