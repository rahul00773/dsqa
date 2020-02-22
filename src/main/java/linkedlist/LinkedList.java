
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: LinkedList.java, v 0.1 2020-02-23 01:57 rahul.kumar Exp $$
 */
public class LinkedList {

    Node head;

    static class Node{

        int data;

        Node next;

        Node(int d)
        {
            data =d;
            next = null;
        }
    }


    public static void main(String[] args){
            LinkedList linkedList = new LinkedList();


            linkedList.head = new Node(1);

            Node sec = new Node(2);
            Node third =  new Node(3);

            linkedList.head.next=sec;
            sec.next = third;

            linkedList.printLinkedList();

    }

    public  void printLinkedList(){

        Node n = head;
        while (n!=null){
            System.out.println(n.data +" ");
            n = n.next;
        }
    }

}