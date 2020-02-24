
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: DeleteAnElementAfterSearchigInLinkedList.java, v 0.1 2020-02-25 00:12 rahul.kumar Exp $$
 */
public class DeleteAnElementAfterSearchigInLinkedList {

 public static void main(String[] args){

     LinkedList linkedList = new LinkedList();

     LinkedList.Node first = new LinkedList.Node(2);
     LinkedList.Node sec = new LinkedList.Node(3);
     LinkedList.Node third = new LinkedList.Node(4);
     LinkedList.Node fifth = new LinkedList.Node(5);


     linkedList.head = first;
     first.next = sec;
     sec.next = third;
     third.next = fifth;

     // Insert an element after third

     insertAfter(third,6);

     linkedList.printLinkedList();



 }

    public static void insertAfter(LinkedList.Node prev_node, int new_data)
    {
        /* 1. Check if the given Node is null */
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }

    /* 2. Allocate the Node &
       3. Put in the data*/
        LinkedList.Node new_node = new LinkedList.Node(new_data);

        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;

        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
    }


    public static void deleteAfter(LinkedList.Node prev_node, int new_data)
    {
        /* 1. Check if the given Node is null */
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }

    /* 2. Allocate the Node &
       3. Put in the data*/
        LinkedList.Node new_node = new LinkedList.Node(new_data);

        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;

        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
    }
}