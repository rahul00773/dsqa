
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: PairWiseSwap.java, v 0.1 2020-03-29 22:41 rahul.kumar Exp $$
 */
public class PairWiseSwap {

    public static void main(String[] args){

        LinkedList linkedList =new LinkedList();

        LinkedList.Node a = new LinkedList.Node(1);
        LinkedList.Node b = new LinkedList.Node(2);
        LinkedList.Node c = new LinkedList.Node(3);
        LinkedList.Node d = new LinkedList.Node(4);
        LinkedList.Node f = new LinkedList.Node(4);


        linkedList.head = a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=f;

        linkedList.printLinkList(pairWiseSwap(linkedList.head));


    }

    public static LinkedList.Node pairWiseSwap(LinkedList.Node head){

        LinkedList.Node temp  = head;

        LinkedList.Node newHead  = head.next;

        LinkedList.Node pre = null;
        LinkedList.Node next = null;

        while (temp.next!=null && temp!=null){
int k = temp.data;
temp.data = temp.next.data;
temp.next.data = k;
temp = temp.next.next;


        }

       return head;

    }
}