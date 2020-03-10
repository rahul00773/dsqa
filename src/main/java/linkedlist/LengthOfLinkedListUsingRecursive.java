
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: LengthOfLinkedListUsingRecursive.java, v 0.1 2020-03-07 23:56 rahul.kumar Exp $$
 */
public class LengthOfLinkedListUsingRecursive {


    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();

        LinkedList.Node first= new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(3);
        LinkedList.Node fourth = new LinkedList.Node(4);

        linkedList.head=first;
      /*  first.next = second;
        second.next = third;
        third.next = fourth;*/

        int x =getLength(linkedList.head);
        System.out.println(x);
    }


    public static int getLength(LinkedList.Node head){


        if(head==null){
            return 0;
        }

          return 1+getLength(head.next);
    }
}