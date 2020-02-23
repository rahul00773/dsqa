
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: DeleteElementFromLinkedList.java, v 0.1 2020-02-23 23:53 rahul.kumar Exp $$
 */
public class DeleteElementFromLinkedList {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();

        LinkedList.Node first = new LinkedList.Node(1);
        LinkedList.Node sec = new LinkedList.Node(2);
        LinkedList.Node thir = new LinkedList.Node(3);


        linkedList.head=first;

        first.next = sec;
        sec.next = thir;

        System.out.println("Print linked list before deleting node");
        linkedList.printLinkedList();



        first.next = thir;
        System.out.println("Print linked list after deleting node");
        linkedList.printLinkedList();



    }

}