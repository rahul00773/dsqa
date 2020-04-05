
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: IntersectionOfTwoLinkedList.java, v 0.1 2020-04-05 20:07 rahul.kumar Exp $$
 */
public class IntersectionOfTwoLinkedList {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();

        LinkedList.Node a = new LinkedList.Node(0);
        LinkedList.Node b = new LinkedList.Node(1);
        LinkedList.Node c = new LinkedList.Node(2);
        LinkedList.Node d = new LinkedList.Node(3);
        LinkedList.Node f = new LinkedList.Node(4);
        LinkedList.Node g = new LinkedList.Node(5);


        linkedList.head = a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=f;
        f.next=g;


        LinkedList linkedList1 = new LinkedList();

        LinkedList.Node h = new LinkedList.Node(3);
        LinkedList.Node i = new LinkedList.Node(4);
        LinkedList.Node j = new LinkedList.Node(5);
        LinkedList.Node k = new LinkedList.Node(6);
        LinkedList.Node l = new LinkedList.Node(7);
        LinkedList.Node m = new LinkedList.Node(8);

        linkedList1.head=h;
        h.next=i;
        i.next=j;
        j.next=k;
        k.next=l;
        l.next=m;

       linkedList.printLinkList(getIntersection(linkedList.head,linkedList1.head));

    }

    public static LinkedList.Node getIntersection(LinkedList.Node head1, LinkedList.Node head2){


        if(head1==null || head2==null ){


            return null;
        }

        if(head1.data<head2.data)
            return getIntersection(head1.next,head2);

        if(head1.data>head2.data)
            return getIntersection(head1,head2.next);

        LinkedList.Node temp = new LinkedList.Node(0);

        temp.next=head1;

        getIntersection(head1.next,head2.next);

        return temp.next;
    }
}