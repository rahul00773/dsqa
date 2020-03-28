
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: ReverseALinkedList.java, v 0.1 2020-03-28 22:51 rahul.kumar Exp $$
 */
public class ReverseALinkedList {

public static void main(String[] args){

    LinkedList linkedList = new LinkedList();

    LinkedList.Node a = new LinkedList.Node(0);
    LinkedList.Node b = new LinkedList.Node(1);
    LinkedList.Node c = new LinkedList.Node(2);
    LinkedList.Node d = new LinkedList.Node(2);
    LinkedList.Node f = new LinkedList.Node(1);
    LinkedList.Node g = new LinkedList.Node(1);

    linkedList.head = a;
    a.next = b;
    b.next =c;
    c.next =d;
    d.next =f;
    f.next=g;

    linkedList.printLinkList(reverseLinkedList(linkedList.head));
}

public static LinkedList.Node reverseLinkedList(LinkedList.Node head){

    LinkedList.Node pre = null;
    LinkedList.Node curr = head;
    LinkedList.Node next  = null;

    while (curr!=null){

        next = curr.next;

        curr.next=pre;

        pre=curr;
        curr = next;
    }
    return pre;
}


}