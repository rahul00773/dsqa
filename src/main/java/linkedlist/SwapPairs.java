
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: SwapPairs.java, v 0.1 2020-03-14 22:44 rahul.kumar Exp $$
 */
public class SwapPairs {


    public static void main(String[] args){


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

       LinkedList.Node n1 =  swapPairs(linkedList.head);

       linkedList.printLinkedList(n1);


    }

    public static LinkedList.Node swapPairs(LinkedList.Node head){


        LinkedList.Node curr = head;
        LinkedList.Node next1 = head.next;


       LinkedList.Node q = null;

        LinkedList.Node temp = null;
        while (true){

            q = curr.next;
           temp = q.next;

            q.next = curr;

            if(temp==null ||temp.next==null){

                curr.next = null;
                break;
            }
            curr.next = temp.next;

            curr = temp;
        }


       return next1;
    }
}