
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

        removeElementFromEnd(linkedList.head,  5);


        linkedList.printLinkedList();

    }


    public static LinkedList.Node removeElementFromEnd(LinkedList.Node head, int val){


        LinkedList.Node pre = new LinkedList.Node(-1) , cur = pre;

        pre.next = head;

        while (head!=null)
        {
            if(head.data == val){
                cur.next = head.next;
                head = cur.next;
            }

            else{
                cur = head;
                head = head.next;
            }
        }

        return pre.next;



    }
}