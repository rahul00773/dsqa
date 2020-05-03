
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: MergeSortLinkedList.java, v 0.1 2020-05-02 13:45 rahul.kumar Exp $$
 */
public class MergeSortLinkedList {

    public static void main(String[] args){
    LinkedList linkedList = new LinkedList();

    LinkedList.Node a = new LinkedList.Node(0);
    LinkedList.Node b  = new LinkedList.Node(1);
    LinkedList.Node c = new LinkedList.Node(1);
    LinkedList.Node d = new LinkedList.Node(2);
    LinkedList.Node e = new LinkedList.Node(2);
    LinkedList.Node f = new LinkedList.Node(3);
    LinkedList.Node g = new LinkedList.Node(3);
    LinkedList.Node h = new LinkedList.Node(4);
    LinkedList.Node i = new LinkedList.Node(5);


    linkedList.head = a;
    a.next = b;
    b.next=c;
    c.next =d;
    d.next = e;
    e.next = f;
    f.next = g;
    g.next = h;
    h.next =i;

    mergeSortOfLinkedList(linkedList.head);

}

public static void mergeSortOfLinkedList(LinkedList.Node head){

        LinkedList.Node current = head;
        LinkedList.Node slow = head;

        LinkedList.Node fast = head;


        while (fast!=null || fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }


        LinkedList.Node midNext= slow.next;


        slow.next = null;

        mergeSort(current,slow);
        mergeSort(midNext,fast);
        merge();

}


public static void mergeSort(LinkedList.Node head, LinkedList.Node end){


}

public static void merge(){

}
}