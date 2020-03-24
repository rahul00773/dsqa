
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: RemoveDuplicate.java, v 0.1 2020-03-21 23:49 rahul.kumar Exp $$
 */
public class RemoveDuplicate {

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();

        LinkedList.Node first = new LinkedList.Node(1);
        LinkedList.Node sec = new LinkedList.Node(2);
        LinkedList.Node thir = new LinkedList.Node(3);
        LinkedList.Node four = new LinkedList.Node(3);
        LinkedList.Node fifth = new LinkedList.Node(4);


        linkedList.head=first;

        first.next = sec;
        sec.next = thir;
        thir.next = four;
        four.next = fifth;

        linkedList.printLinkedList(removeDuplicate(linkedList.head));

    }

    public static LinkedList.Node removeDuplicate(LinkedList.Node head){
        LinkedList.Node currentNode = head;
        LinkedList.Node next;


        while(currentNode!=null && currentNode.next!=null){


            if(currentNode.data == currentNode.next.data) {

                next = currentNode.next.next;

                if (next == null) {
                    currentNode.next = null;
                    break;
                }

                currentNode.next = next;
            }
            if(currentNode.data!=currentNode.next.data){
                currentNode  =currentNode.next;

            }

        }



        return head;


    }
}