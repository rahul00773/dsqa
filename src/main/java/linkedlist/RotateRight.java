
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: RotateRight.java, v 0.1 2020-03-17 00:13 rahul.kumar Exp $$
 */
public class RotateRight {


    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList();
        LinkedList.Node first = new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(3);
        LinkedList.Node fourth = new LinkedList.Node(4);
        LinkedList.Node fifth = new LinkedList.Node(5);
        LinkedList.Node sixth = new LinkedList.Node(6);


        linkedList.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        LinkedList.Node n = rotateRight(linkedList.head, 2);

        linkedList.printLinkedList(n);


    }

    public static LinkedList.Node rotateRight(LinkedList.Node head, int k) {

        LinkedList.Node p = head;
        LinkedList.Node q = head;


        LinkedList.Node newHead = null;
        int size = 0;

        while (p != null) {
            size++;
            p = p.next;
        }

        for (int i = 0; i < size - k - 1; i++) {
            q = q.next;

        }


        newHead = q.next;

        q.next = null;

        LinkedList.Node z = newHead;

        while (z.next != null) {
            z = z.next;
        }

        z.next = head;

        return newHead;

    }
}