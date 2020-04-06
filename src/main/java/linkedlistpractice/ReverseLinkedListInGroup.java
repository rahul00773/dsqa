
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: ReverseLinkedListInGroup.java, v 0.1 2020-04-05 22:42 rahul.kumar Exp $$
 */
public class ReverseLinkedListInGroup {


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

        reverseLinkedListInGroup(linkedList.head, 3);

    }

    public static LinkedList.Node reverseLinkedListInGroup(LinkedList.Node head, int k){


        LinkedList.Node current = head;

        LinkedList.Node temp = head;
        LinkedList.Node newHead =null;
        while (current.next!=null && current!=null) {


            for (int i = 0; i < k; i++) {
                temp = temp.next;

            }

            newHead = temp;

            LinkedList.Node next = temp.next;
            temp.next = null;
            reverse(current);
        }

        return newHead;
    }

    public static void reverse(LinkedList.Node head){

        LinkedList.Node curr = head;

        LinkedList.Node next =null;

        while (curr.next!=null){

            next = curr.next;

            curr.next = next.next;

            next.next=head;
            head=next;

        }

    }
}