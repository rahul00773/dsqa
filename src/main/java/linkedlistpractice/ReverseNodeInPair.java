
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: ReverseNodeInPair.java, v 0.1 2020-04-12 12:39 rahul.kumar Exp $$
 */
public class ReverseNodeInPair {

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

        linkedList.printLinkList(reverseLinkedListInPair(linkedList.head,3));
    }


    public static LinkedList.Node reverseLinkedListInPair(LinkedList.Node head,int k){

       LinkedList.Node current = head;
       LinkedList.Node pre = null;
       LinkedList.Node next = null;

       int count =0;

       while (count<k && current!=null){

           next=current.next;
           current.next=pre;
           pre=current;
           current=next;
           count++;

       }
       if(next!=null)
           head.next=reverseLinkedListInPair(next,k);

       return pre;
    }
}