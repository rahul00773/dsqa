
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: SearchUsingRecursion.java, v 0.1 2020-03-28 16:39 rahul.kumar Exp $$
 */
public class SearchUsingRecursion {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        LinkedList.Node a = new LinkedList.Node(1);
        LinkedList.Node b = new LinkedList.Node(2);
        LinkedList.Node c = new LinkedList.Node(3);
        LinkedList.Node d = new LinkedList.Node(4);


        linkedList.head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(searchUsingRecursion(linkedList.head, 2));

    }

    public static boolean searchUsingRecursion(LinkedList.Node head, int val) {


        if (head == null)
            return false;
        if (head.data == val)
            return true;
        return searchUsingRecursion(head.next, val);

    }
}