package LinkedList;

import java.util.HashMap;

/**
 * Created by piyush.bajaj on 06/10/16.
 */
public class DetectLoop {

    Node head;
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

    public void checkLoop(){
        Node slow_p = head;
        Node fast_p = head;
        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                System.out.println("Found loop");
                System.out.println("Found loop at " + slow_p.data);
                System.exit(1);
            }
        }
        System.out.println("No loop");
    }

    public void checkLoop_hash(){
        Node Nd = head;

        HashMap<Integer, Boolean> hash = new HashMap<>();
        hash.put(Nd.data, true);
        while(Nd.next!=null){
            if(hash.containsKey(Nd.next.data)){
                System.out.println("Found loop");
                return;
            }
            else {
                hash.put(Nd.next.data, true);
                Nd = Nd.next;
            }
        }
        System.out.println("No loop");
    }


    public static void main(String[] args) {
        DetectLoop llist = new DetectLoop();
        llist.head = new Node(1);
        llist.head.next = new Node(2);
        llist.head.next.next = new Node(3);
        llist.head.next.next.next = new Node(4);
        llist.head.next.next.next.next = new Node(5);
        llist.head.next.next.next.next.next = llist.head.next;
        llist.checkLoop();
        //llist.checkLoop_hash();
        //llist.printList();
        System.out.println("\n");
        //System.out.println(llist.search(0));
        //System.out.println(llist.search_recursive(llist.head, 1));
        //llist.returnNthNode(3);
    }
}
