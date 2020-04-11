
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: SegregateEvenAndOddLinkedList.java, v 0.1 2020-04-07 01:23 rahul.kumar Exp $$
 */
public class SegregateEvenAndOddLinkedList {

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        LinkedList.Node a = new LinkedList.Node(2);
        LinkedList.Node b  = new LinkedList.Node(1);
        LinkedList.Node c = new LinkedList.Node(1);
        LinkedList.Node d = new LinkedList.Node(2);
        LinkedList.Node e = new LinkedList.Node(2);
        LinkedList.Node f = new LinkedList.Node(3);
        LinkedList.Node g = new LinkedList.Node(3);
        LinkedList.Node h = new LinkedList.Node(4);


        linkedList.head =a;
        a.next = b;
        b.next = c;
        c.next =d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        linkedList.printLinkList(segregateEvenOdd(linkedList.head));

    }

    public static LinkedList.Node segregateEvenOdd(LinkedList.Node head){

        LinkedList.Node current = head;

        LinkedList.Node p =current;
        LinkedList.Node q = current;
        LinkedList.Node next = null;

        while (p.next!=null){
            p=p.next;
        }


        while (q!=p){
            if(q.data%2!=0){

               next = q.next;

                p.next=q;
                p.next.next =null;
                p=p.next;
                q=next;
            }

            else q=q.next;

        }

        return head;
    }
}