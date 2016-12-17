package BinaryTreeExample;

/**
 * Created by piyush.bajaj on 04/12/16.
 */
public class BinaryTreeBalancedClass {
    Node root;

    static class Node{
        Node left, right, root;
        int data;
        Node(int d){
            data = d;
            left = right = root = null;
        }
    }

    int height(Node root)
    {
        if (root == null)
            return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }

//    int difference(int N1, int N2){
//
//    }

    public void balancedTree(Node Nd1, Node Nd2){
        int diff = height(Nd1) - height(Nd2);
        if(Math.abs(diff) == 1 || diff == 0) {
            System.out.println("Binary tree is balanced for the given Nodes");
            return;
        }
        else {
            System.out.println("Binary tree is Not balanced for the given Nodes");
            return;
        }


    }

    public static void main(String[] args) {
        BinaryTreeBalancedClass BT = new BinaryTreeBalancedClass();
        BT.root = new Node(3);
        System.out.println("Root of a binary tree is: " + BT.root.data);
        BT.root.left = new Node(2);

        BT.root.right = new Node(4);

        System.out.println("Root->left of a binary tree is: " + BT.root.left.data);

        System.out.println("Root->right of a binary tree is: " + BT.root.right.data);

        System.out.println("Root->left->left of a binary tree is: " + BT.root.left.left);

        System.out.println("Root->right->right of a binary tree is: " + BT.root.left.right);

        BT.root.left.left = new Node(1);

        BT.root.right.right = new Node(5);

        System.out.println("Root->left->left of a binary tree is: " + BT.root.left.left.data);

        System.out.println("Root->right->right of a binary tree is: " + BT.root.right.right.data);

        BT.balancedTree(BT.root, BT.root.left.left);

    }
}
