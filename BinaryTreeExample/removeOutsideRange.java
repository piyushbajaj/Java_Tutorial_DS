package BinaryTreeExample;

/**
 * Created by piyush.bajaj on 31/12/16.
 */
public class removeOutsideRange {
    Node root;
    public static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public removeOutsideRange(){
        root = null;
    }

    public removeOutsideRange(int key){
        root = new Node(key);
    }

    //This is done using Post-Order Traversal
    public Node removeNodeOutsideRange(Node key, int min, int max){
        //Base case
        if(key == null)
            return null;

        key.left = removeNodeOutsideRange(key.left, min, max);
        key.right = removeNodeOutsideRange(key.right, min, max);


        if(key.data < min){
            return key.right;
        }
        if(key.data > max){
            return key.left;
        }
        return key;


    }


    public void inOrderTraversal(Node key){
        if(key ==null)
            return;

        inOrderTraversal(key.left);

        System.out.print(key.data + " ");

        inOrderTraversal(key.right);
    }


    public static void main(String[] args) {
        removeOutsideRange BT = new removeOutsideRange(50);
        System.out.println("Root: " + BT.root.data);
        BT.root.left = new Node(30);
        System.out.println("Root ("+ BT.root.data +") -> Left: " + BT.root.left.data);
        BT.root.right = new Node(70);
        System.out.println("Root ("+ BT.root.data +") -> Right: " + BT.root.right.data);
        BT.root.left.left = new Node(20);
        System.out.println("Root (" + BT.root.data + ") -> Left (" + BT.root.left.data + ") -> Left: " + BT.root.left.left.data);
        BT.root.left.right = new Node(40);
        System.out.println("Root (" + BT.root.data + ") -> Left (" + BT.root.left.data + ") -> Right: " + BT.root.left.right.data);
        BT.root.right.left = new Node(60);
        System.out.println("Root ("+ BT.root.data +") -> Right ("+ BT.root.right.data + ")-> Left: " + BT.root.right.left.data);
        BT.root.right.right = new Node(80);
        System.out.println("Root ("+ BT.root.data +") -> Right ("+ BT.root.right.data + ") -> Right: " + BT.root.right.right.data);

        BT.inOrderTraversal(BT.root);

        System.out.println();

        BT.removeNodeOutsideRange(BT.root, 10, 55);

        System.out.println("After removing nodes: ");

        BT.inOrderTraversal(BT.root);

    }
}
