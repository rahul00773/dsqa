
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: SegregateEvenOdd.java, v 0.1 2020-03-24 23:28 rahul.kumar Exp $$
 */
public class SegregateEvenOdd {


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
        //segreageEvenOdd(linkedList.head);
        linkedList.printLinkedList(segreageEvenOdd(linkedList.head));


    }


    public static LinkedList.Node segreageEvenOdd(LinkedList.Node head) {

        LinkedList.Node current = head;

        LinkedList.Node pre = null;
        LinkedList.Node end = head;


        while (end.next != null) {
            end = end.next;
        }

        LinkedList.Node newHead = end;

        while (current.data % 2 != 0 && current != end) {
            newHead.next = current;
            current = current.next;
            newHead.next.next = null;
            newHead = newHead.next;
        }




        if (current.data % 2 == 0) {
            head = current;

            while (current != end) {

                if (current.data % 2 == 0) {

                    pre = current;
                    current = current.next;
                } else {

                    pre.next = current.next;
                    current.next = null;
                    newHead.next = current;
                    newHead = current;
                    current = pre.next;
                }
            }
        }

        else pre = current;

        if (newHead != end && end.data%2 != 0) {

            pre.next = end.next;
            end.next = null;
            newHead.next = end;
        }

        return head;

    }


}