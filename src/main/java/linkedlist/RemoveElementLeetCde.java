
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: RemoveElementLeetCde.java, v 0.1 2020-02-27 01:51 rahul.kumar Exp $$
 */
public class RemoveElementLeetCde {

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

        removeElement(linkedList.head,  6);


        linkedList.printLinkedList();

    }

    public static LinkedList.Node removeElement(LinkedList.Node head, int val){


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