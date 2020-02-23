
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: InsertInLinkedList.java, v 0.1 2020-02-23 23:09 rahul.kumar Exp $$
 */
public class InsertInLinkedList {


    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();

        LinkedList.Node first = new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);


        linkedList.head = first;

        linkedList.head.next = second;

        System.out.println("Before inserting an element in linked list ");
        linkedList.printLinkedList();


        LinkedList.Node third = new LinkedList.Node(4);

        second.next = third;

        System.out.println("After inserting an element in linked list in end ");
        linkedList.printLinkedList();

        LinkedList.Node fourth = new LinkedList.Node(3);

        second.next = fourth;

        fourth.next = third;


        System.out.println("After inserting an element in linked list in Middle ");
        linkedList.printLinkedList();


    }
}