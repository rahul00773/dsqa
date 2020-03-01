
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: ConvertBinaryNumberLinkedListtoInteger.java, v 0.1 2020-03-02 00:40 rahul.kumar Exp $$
 */
public class ConvertBinaryNumberLinkedListtoInteger {


    public static int getDecimalValue(LinkedList.Node head) {

        LinkedList.Node currentNode = head;

        String s = "";

        while(currentNode!=null){
            s = s+currentNode.data;
            currentNode = currentNode.next;
        }

        int foo = Integer.parseInt(s,2);
        //System.out.println(foo);
        // int x= Integer.parseInt(foo);
        return foo;

    }


    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();

        LinkedList.Node first = new LinkedList.Node(0);
        LinkedList.Node sec = new LinkedList.Node(1);

        linkedList.head =first;
        first.next = sec;

        System.out.println(getDecimalValue(linkedList.head));
    }
}