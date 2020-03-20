
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: RotateLinkedList.java, v 0.1 2020-03-01 00:56 rahul.kumar Exp $$
 */
public class RotateLinkedList {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();
        LinkedList.Node first = new LinkedList.Node(0);

        LinkedList.Node sec = new LinkedList.Node(1);
        LinkedList.Node third = new LinkedList.Node(2);
        LinkedList.Node fourth = new LinkedList.Node(3);


        linkedList.head = first;
        first.next = sec;
        sec.next = third;
        third.next = fourth;

        LinkedList.Node l1 = reverseKGroup(linkedList.head,2);

        linkedList.printLinkedList(l1);
    }



    public static LinkedList.Node reverseKGroup(LinkedList.Node head, int k) {
        LinkedList.Node current = head;
        LinkedList.Node previous = null;
        int totalSize = 1;
        LinkedList.Node check = head;
        while(check.next != null) {
            check = check.next;
            totalSize++;
        }
        while(current != null) {
            LinkedList.Node next = null;
            LinkedList.Node prevPart = previous;
            LinkedList.Node nextPart = current;
            if(totalSize - k >= 0){
                for(int i = 0; current != null  && i < k; i++) {
                    next = current.next;
                    current.next = previous;
                    previous = current;
                    current = next;
                    totalSize--;
                }
                if(prevPart != null) {
                    prevPart.next = previous;
                }
                else head = previous;
                nextPart.next = current;
                if(current == null) break;
                previous = nextPart;

            }
            else {
                while(current != null) {
                    previous = current;
                    current = current.next;
                }
            }

        }
        return head;

    }
}