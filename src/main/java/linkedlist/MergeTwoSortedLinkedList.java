
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: MergeTwoSortedLinkedList.java, v 0.1 2020-02-29 00:40 rahul.kumar Exp $$
 */
public class MergeTwoSortedLinkedList {

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


        LinkedList linkedList1 = new LinkedList();

        LinkedList.Node first1 = new LinkedList.Node(1);
        LinkedList.Node second2 = new LinkedList.Node(2);
        LinkedList.Node third2 = new LinkedList.Node(4);
        LinkedList.Node fourth3 = new LinkedList.Node(8);
        LinkedList.Node fifth4 = new LinkedList.Node(10);
        LinkedList.Node sixth5 = new LinkedList.Node(12);

        linkedList1.head = first1;
        first1.next = second2;
        second2.next = third2;
        third2.next = fourth3;
        fourth3.next = fifth4;
        fifth4.next = sixth5;


        System.out.println("First Linked List");
        linkedList.printLinkedList(linkedList.head);
        System.out.println("Second Linked List");
        linkedList.printLinkedList(linkedList1.head);

        LinkedList.Node n1 = mergeTwoSortedList(linkedList.head, linkedList1.head);
        System.out.println("after sorting  Linked List");
        linkedList.printLinkedList(n1);


    }

    public static LinkedList.Node mergeTwoSortedList(LinkedList.Node l1, LinkedList.Node l2) {


        LinkedList.Node l3 = new LinkedList.Node(0);


        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {

            return l1;
        }


        LinkedList.Node l1current = l1;
        LinkedList.Node l2current = l2;

        LinkedList.Node sor = l3;
/*
        if(l1current.data<=l2current.data){
            sor = l1current;
            l1current = l1current.next;
        }

        else{
            sor = l2current;
            l2current = l2current.next;
        }*/


        while (true) {
            if (l1current == null) {
                sor.next = l2current;
                break;
            }

            if (l2current == null) {

                sor.next = l1current;
                break;
            }

            if (l1current.data <= l2current.data) {

                sor.next = l1current;

                l1current = l1current.next;

            } else {

                sor.next = l2current;
                l2current = l2current.next;

            }

            sor = sor.next;

        }

        return l3.next;

    }
}