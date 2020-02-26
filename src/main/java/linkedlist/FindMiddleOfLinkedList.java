package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: FindMiddleOfLinkedList.java, v 0.1 2020-02-27 00:28 rahul.kumar Exp $$
 */
public class FindMiddleOfLinkedList {


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

        printMiddleOfLinkedList(linkedList.head);

    }


    public static void printMiddleOfLinkedList(LinkedList.Node head){

        LinkedList.Node currentNode = head;
        LinkedList.Node currentNode1 = head;
        LinkedList.Node secondNode = head.next;
        double listsize = 1.0;

        while (currentNode.next!=null){
            listsize++;
            currentNode = currentNode.next;
        }

        System.out.println("print list size" + listsize);

        if(listsize % 2.0 == 0.0){

            System.out.println(listsize/2.0);
        }
        while (secondNode!=null && secondNode.next!=null){


            currentNode1 = currentNode1.next;
            secondNode = secondNode.next.next;

        }

        if(listsize/2.0 == 0.0){

            System.out.println(listsize/2.0);
        }

        System.out.println("Middle node is " + currentNode1.next.data);

    }


}