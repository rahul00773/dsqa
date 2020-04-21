
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: DeleteAllOccuranceOfDuplicateElement.java, v 0.1 2020-04-18 13:19 rahul.kumar Exp $$
 */
public class DeleteAllOccuranceOfDuplicateElement {



        public static void main(String[] args){
            LinkedList linkedList =new LinkedList();

            LinkedList.Node a = new LinkedList.Node(1);
            LinkedList.Node b = new LinkedList.Node(2);
            LinkedList.Node c = new LinkedList.Node(3);
            LinkedList.Node d = new LinkedList.Node(4);
            LinkedList.Node f = new LinkedList.Node(4);


            linkedList.head = a;
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=f;

            linkedList.printLinkList(removeDuplicate(linkedList.head));
    }

    public static LinkedList.Node removeDuplicate(LinkedList.Node head){

            LinkedList.Node current = head;
            LinkedList.Node pre = null;
    LinkedList.Node dummy = new LinkedList.Node(0);
    pre = dummy;

            while (current!=null&& current.next!=null){

                if(current.data!= current.next.data){

                    pre=current;
                    current = current.next;
                }

                else {
                    current= current.next;
                }
            }

            return head;
    }

}