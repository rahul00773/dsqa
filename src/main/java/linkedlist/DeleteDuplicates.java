
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: DeleteDuplicates.java, v 0.1 2020-03-02 00:57 rahul.kumar Exp $$
 */
public class DeleteDuplicates {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();

        LinkedList.Node first = new LinkedList.Node(1);
        LinkedList.Node sec = new LinkedList.Node(1);
        LinkedList.Node third = new LinkedList.Node(2);

        linkedList.head =first;
        first.next = sec;
        sec.next = third;

        deleteDuplicates(linkedList.head);
        linkedList.printLinkedList( deleteDuplicates(linkedList.head));
    }

    public static LinkedList.Node deleteDuplicates(LinkedList.Node head){

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