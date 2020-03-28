
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: DeleteNode.java, v 0.1 2020-03-28 15:42 rahul.kumar Exp $$
 */
public class DeleteNode {

    public static void main(String[] args){

        LinkedList linkedList =new LinkedList();

        LinkedList.Node a = new LinkedList.Node(1);
        LinkedList.Node b = new LinkedList.Node(2);
        LinkedList.Node c = new LinkedList.Node(8);
        LinkedList.Node d = new LinkedList.Node(10);


        linkedList.head = a;
        a.next=b;
        b.next=c;
        c.next=d;

        deleteNode(linkedList.head,3);
        linkedList.printLinkList(linkedList.head);
    }

    public static LinkedList.Node deleteNode(LinkedList.Node head ,int x){
        if(head == null || x==0){
            return head;
        }

        LinkedList.Node curr = head;
        LinkedList.Node pre = null;

        if(x==1){
            head = head.next;
            return head;
        }

        int count =1;
        while (curr!=null  && x>=2){

            if(count == x){
                pre.next = curr.next;

            }
            pre = curr;
            curr =curr.next;

            count ++;

        }
        return head;

    }
}