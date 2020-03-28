
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: DeleteANodeFromLinkedList.java, v 0.1 2020-03-28 14:29 rahul.kumar Exp $$
 */
public class DeleteANodeFromLinkedList {

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

        deleteLink(linkedList.head,3);
        linkedList.printLinkList(linkedList.head);

    }

    public static void deleteLink(LinkedList.Node head, int val){


        if(head == null){
            return;
        }

        if(head.data==val){
            head = head.next;
            return;
        }
        LinkedList.Node curr = head;
        LinkedList.Node pre = null;

        while (curr!=null){


            if(curr.data == val){

                pre.next = curr.next;

            }

            pre = curr;
            curr =curr.next;



        }
    }
}