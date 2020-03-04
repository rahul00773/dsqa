
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: HasCycle.java, v 0.1 2020-03-02 01:50 rahul.kumar Exp $$
 */
public class HasCycle {


    public boolean hasCycle(LinkedList.Node head) {

        if(head==null){
            return false;
        }
        LinkedList.Node  slow = head;
        LinkedList.Node  fast = head.next;

        while(slow!=fast){

            if(fast==null ||fast.next==null){
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}