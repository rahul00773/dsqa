
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: CheckIfLinkedListIsPalindrome.java, v 0.1 2020-03-01 01:54 rahul.kumar Exp $$
 */
public class CheckIfLinkedListIsPalindrome {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();

        LinkedList.Node first = new LinkedList.Node(1);
        LinkedList.Node sec = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(2);
        LinkedList.Node fourth = new LinkedList.Node(2);
        LinkedList.Node fifth = new LinkedList.Node(1);

        linkedList.head = first;
        first.next = sec;
        sec.next = third;
        third.next = fourth;
       fourth.next =fifth;

        System.out.println(isPalindrome(linkedList.head));




    }

    public static  boolean isPalindrome(LinkedList.Node head){
        boolean ans  =true;
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;
        LinkedList.Node start = null;
        LinkedList.Node midnode = null;
        while(fast!=null && fast.next!=null){
          slow= slow.next;
          fast = fast.next.next;

        }

        if (fast != null) {
            midnode = slow;
            slow = slow.next;
        }
        start = slow.next;
        slow.next = null;

        reverseLinked(start);
        while(head!=null && start!=null){
                if(head.data!=start.data){
                ans = false;
            }

            head = head.next;
            start = start.next;
        }

        return ans;
    }


    public static LinkedList.Node reverseLinked(LinkedList.Node head){

        LinkedList.Node pre = null;
        LinkedList.Node next = null;
        LinkedList.Node curr= head;

        while (curr!=null){

            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }
}