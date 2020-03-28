
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: RemoveDuplicaeFromSortedLinkedList.java, v 0.1 2020-03-28 23:31 rahul.kumar Exp $$
 */
public class RemoveDuplicaeFromSortedLinkedList {

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


        linkedList.head =a;
        a.next = b;
        b.next = c;
        c.next =d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        linkedList.printLinkList(removeDuplicate(linkedList.head));
    }

    public static LinkedList.Node removeDuplicate(LinkedList.Node head){

        LinkedList.Node curr = head;

        while (curr!=null){

            LinkedList.Node temp = curr;

            while (temp!=null && temp.data== curr.data){
                temp = temp.next;
            }

            curr.next = temp;
            curr = curr.next;

        }



return head;

    }

}