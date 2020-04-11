
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: DeleteAlternateFromLinkedList.java, v 0.1 2020-04-11 12:29 rahul.kumar Exp $$
 */
public class DeleteAlternateFromLinkedList {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();
        LinkedList.Node a = new LinkedList.Node(0);
        LinkedList.Node b  = new LinkedList.Node(1);
        LinkedList.Node c = new LinkedList.Node(1);
        LinkedList.Node d = new LinkedList.Node(2);
        LinkedList.Node e = new LinkedList.Node(2);
        LinkedList.Node f = new LinkedList.Node(3);
        LinkedList.Node g = new LinkedList.Node(3);
        LinkedList.Node h = new LinkedList.Node(4);
        LinkedList.Node i = new LinkedList.Node(5);


        linkedList.head =a;
        a.next = b;
        b.next=c;
        c.next =d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next =i;

        linkedList.printLinkList(deleteAlterNate(linkedList.head));

    }


    public static LinkedList.Node deleteAlterNate(LinkedList.Node head){


        LinkedList.Node current = head;
        LinkedList.Node next = current.next;

        while (current!=null && current.next!=null ){

            next  = current.next.next;

            current.next= next;

            current=next;

        }

        return head;






    }
}