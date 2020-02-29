
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: ReverseLinkedList.java, v 0.1 2020-02-29 23:23 rahul.kumar Exp $$
 */
public class ReverseLinkedList {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();

        LinkedList.Node first= new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(3);
        LinkedList.Node fourth = new LinkedList.Node(4);

        linkedList.head=first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("current Linked List");
        linkedList.printLinkedList();
        LinkedList.Node linkedList1 =reveseLinkedList(linkedList.head);
        linkedList.printLinkedList(linkedList1);


    }

    public static LinkedList.Node reveseLinkedList(LinkedList.Node head){


        LinkedList.Node pre = null;

        LinkedList.Node curr = head;

        LinkedList.Node  next = null;


        while (curr!=null){
            next  = curr.next;
            curr.next  = pre ;
            pre = curr;
          curr = next;


        }

        return pre;
    }
}