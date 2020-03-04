
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: RemoveElementFromEnd.java, v 0.1 2020-03-03 01:25 rahul.kumar Exp $$
 */
public class RemoveElementFromEnd {

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

       LinkedList.Node n= removeElementFromEnd(linkedList.head,  2);


        linkedList.printLinkedList(n);

    }


    public static LinkedList.Node removeElementFromEnd(LinkedList.Node head, int n){


        LinkedList.Node first  = head;
        LinkedList.Node sec = head;

        for(int i =0; i<n; i++){

            if(sec.next == null){

                if(i==n-1){
                    head = head.next;
                    return head;
                }


            }
            sec = sec.next;
        }


        while (sec.next!=null){
            first = first.next;
            sec = sec.next;
        }

        first.next = first.next.next;

        return head;
    }
}