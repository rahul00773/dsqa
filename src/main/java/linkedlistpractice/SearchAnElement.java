
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: SearchAnElement.java, v 0.1 2020-03-28 16:33 rahul.kumar Exp $$
 */
public class SearchAnElement {

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

       boolean ans = searchElement(linkedList.head,6);
        System.out.println(ans);
    }

    public static boolean searchElement(LinkedList.Node head, int val){

        while (head!=null){
            if(head.data==val){
                return true;
            }
            head=head.next;
        }
        return false;
    }
}