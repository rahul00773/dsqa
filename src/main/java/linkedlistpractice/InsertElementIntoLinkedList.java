
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: InsertElementIntoLinkedList.java, v 0.1 2020-03-28 12:50 rahul.kumar Exp $$
 */
public class InsertElementIntoLinkedList {

    public static void main(String[] args){

        LinkedList linkedList =new LinkedList();

        LinkedList.Node a = new LinkedList.Node(1);
        LinkedList.Node b = new LinkedList.Node(2);
        LinkedList.Node c = new LinkedList.Node(3);
        LinkedList.Node d = new LinkedList.Node(4);


        linkedList.head = a;
        a.next=b;
        b.next=c;
        c.next=d;

        System.out.println("Print Linked list after inserting at starting of linked list");
        linkedList.printLinkList(insertAtBeginning(linkedList.head, 0));
        System.out.println("print linked list after insertion at the end of linked list");
        linkedList.printLinkList(insertAtEnd(linkedList.head, 5));
    }


    public static LinkedList.Node insertAtBeginning(LinkedList.Node head, int value){

        LinkedList.Node first = new LinkedList.Node(value);

        //Condition - If head is null then our head will point to first value
        if(head == null){


            head = first;
            return head;
        }
        LinkedList.Node current = head;
        head=first;
        first.next = current;
        return head;
    }


    public static  LinkedList.Node insertAtEnd(LinkedList.Node head, int value)  {
        LinkedList.Node first = new LinkedList.Node(value);

        //Condition - If head is null then our head will point to first value
        if(head == null){


            head = first;
            return head;
        }

        LinkedList.Node curr = head;

        while (curr.next!=null){

            curr = curr.next;
        }

        curr.next = first;

        return head;

    }
}