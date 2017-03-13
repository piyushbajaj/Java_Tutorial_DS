package BinaryTreeExample;

/**
 * Created by piyush.bajaj on 30/12/16.
 */
public class LargestBSTInBinaryTree_Class {
    Node root;
    public static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public LargestBSTInBinaryTree_Class(){
        root = null;
    }

    public LargestBSTInBinaryTree_Class(int key){
        root = new Node(key);
    }


    private int index = 0;
    public Node createTree(int inorder[],int preorder[]){
        Node result =  createTree(inorder,preorder,0,inorder.length-1);
        index = 0;
        return result;
    }

    public Node createTree(int inorder[],int preorder[], int start, int end){
        if(start > end){
            return null;
        }
        int i;
        for(i=start; i <= end; i++){
            if(preorder[index] == inorder[i]){
                break;
            }
        }
        Node node = new Node(preorder[index]);
        index++;
        node.left = createTree(inorder,preorder,start,i-1);
        node.right = createTree(inorder,preorder,i+1,end);
        return node;
    }

    public class  MinMax{
        boolean isBST;
        int size;
        int min;
        int max;

        MinMax(){
            isBST = true;
            size = 0;
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
        }
    }

    public int largestBSTVal(Node key){
        MinMax m = largest(key);
        return m.size;
    }

    public MinMax largest(Node key){
        if(key == null)
            return new MinMax();

        //postorder traversal of tree. First visit left and right then
        //use information of left and right to calculate largest BST.
        MinMax leftside = largest(key.left);
        MinMax rightside = largest(key.right);

        MinMax m = new MinMax();

        //Now check if the isBST is satisfying or not

        //if either of left or right subtree says its not BST or the data
        //of this node is not greater/equal than max of left and less than min of right
        //then subtree with this node as root will not be BST.
        //Return false and max size of left and right subtree to parent
        if(leftside.isBST == false || rightside.isBST == false || leftside.max > key.data || rightside.min <= key.data){
            m.isBST = false;
            m.size = Math.max(leftside.size, rightside.size);
            return m;
        }

        //If it has reached here it means its BST is true
        m.isBST = true;
        m.size = leftside.size + rightside.size + 1;

        //if root.left is null then set root.data as min else
        //take min of left side as min
        m.min = key.left!=null? leftside.min:key.data;


        //if root.right is null then set root.data as max else
        //take max of right side as max.
        m.max = key.right!=null? rightside.max:key.data;

        return m;
    }


    public static void main(String[] args) {
        LargestBSTInBinaryTree_Class BT = new LargestBSTInBinaryTree_Class();

        int inorder[]  = {-7,-6,-5,-4,-3,-2,1,2,3,16,6,10,11,12,14};
        int preorder[] = {3,-2,-3,-4,-5,-6,-7,1,2,16,10,6,12,11,14};

        Node Nd = BT.createTree(inorder, preorder);
        int maxValue = BT.largestBSTVal(Nd);

        System.out.println("Size of largest BST is " + maxValue);

    }
}
