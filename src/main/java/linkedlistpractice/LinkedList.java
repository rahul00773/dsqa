
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: LinkedList.java, v 0.1 2020-03-28 12:42 rahul.kumar Exp $$
 */
public class LinkedList {


    Node head;

    static class Node{

        int data;

        Node next;

        Node(int d){

            data =d;
            next=null;
        }
    }

    public  void printLinkList(LinkedList.Node head){

        while (head!=null){

            System.out.print(head.data);
            System.out.print("->");
            head = head.next;
        }
        System.out.println("null");
    }


}