
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: LengthOfLinkedListUsingRecursion.java, v 0.1 2020-03-28 16:07 rahul.kumar Exp $$
 */
public class LengthOfLinkedListUsingRecursion {

    public static void main(String[] args){
        LinkedList linkedList =new LinkedList();

        LinkedList.Node a = new LinkedList.Node(1);
        LinkedList.Node b = new LinkedList.Node(2);
        LinkedList.Node c = new LinkedList.Node(3);
        LinkedList.Node d = new LinkedList.Node(4);


        linkedList.head = a;
        a.next=b;
        b.next=c;
        c.next=d;

        System.out.println(getLengthOfLinkedList(linkedList.head));

    }

    public static int getLengthOfLinkedList(LinkedList.Node head){

       if(head == null){
           return 0;
       }
       else {
           return 1+getLengthOfLinkedList(head.next);
       }
    }
}