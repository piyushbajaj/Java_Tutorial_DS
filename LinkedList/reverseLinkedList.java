package LinkedList;

/**
 * Created by piyush.bajaj on 26/08/16.
 */
public class reverseLinkedList {

    //This a declaration of Node Structure
    static class Node {

        int data;  //Value
        Node next; //Next Pointer defined

        Node(int d) {
            data = d;
            next = null;
        }
    }

    //This is a declaration of starting Node
    static Node head;

    /* Function to reverse the linked list */
    /*
    Here i am basically using here 3 Nodes, prev(for pointing previous values or old values),
    current(for pointing to the values present currently), next(for pointing to next values)
    So here if you see closely you will understand that i am changing the direction of the pointers,
    so finally prev node will contain all the address for the reverse Nodes.
     */
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        reverseLinkedList list = new reverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Original Linked list is :");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list : ");
        list.printList(head);
    }
}
