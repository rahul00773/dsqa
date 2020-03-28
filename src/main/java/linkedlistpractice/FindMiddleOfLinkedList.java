
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: FindMiddleOfLinkedList.java, v 0.1 2020-03-28 18:24 rahul.kumar Exp $$
 */
public class FindMiddleOfLinkedList {

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
    linkedList.printLinkList(getMiddleOfLinkedList(linkedList.head));

    }

    public static LinkedList.Node getMiddleOfLinkedList(LinkedList.Node head){

        LinkedList.Node current = head;
        LinkedList.Node fast  = head.next;

        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            current = current.next;
        }

        current.next = null;
        return current;
    }

}