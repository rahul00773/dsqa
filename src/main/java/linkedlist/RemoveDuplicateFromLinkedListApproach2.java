
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: RemoveDuplicateFromLinkedListApproach2.java, v 0.1 2020-03-05 00:07 rahul.kumar Exp $$
 */
public class RemoveDuplicateFromLinkedListApproach2 {

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();

        LinkedList.Node first = new LinkedList.Node(1);
        LinkedList.Node sec = new LinkedList.Node(2);
        LinkedList.Node thir = new LinkedList.Node(3);


        linkedList.head=first;

        first.next = sec;
        sec.next = thir;

        System.out.println("Print linked list before deleting node");
        linkedList.printLinkedList();

        deleteDuplicates(linkedList.head);

    }

    public static LinkedList.Node deleteDuplicates(LinkedList.Node head) {

        LinkedList.Node currentNode = head;
        LinkedList.Node pre =head;
        LinkedList.Node next= null;

        while(currentNode!=null){

            if(currentNode.data == pre.data){

                pre.next =currentNode.next;
                currentNode = currentNode.next;


            }

            else{
                currentNode = currentNode.next;
                pre = pre.next;
            }


        }

        return head;
    }
}