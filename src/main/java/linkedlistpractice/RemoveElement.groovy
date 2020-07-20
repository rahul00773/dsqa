package linkedlistpractice

import org.testng.annotations.Test
import sun.plugin.javascript.navig.Link

class RemoveElement {

    def  LinkedList removeElements(LinkedList head, int val){

        LinkedList temp = head;
       if(temp==null){
           return null
       }

        while(head!= null && head.data == val){
            head = head.next;
            temp = head;
        }

        if(temp == null)
            return head;
        else
            temp = temp.next;

        LinkedList temp1 = head;

        while(temp != null){
            if(temp.data == val){
                temp1.next = temp.next;
            }else{
                temp1 = temp;
            }
            temp = temp.next;
        }

        return  head;


    }

    @Test
    public void testLinkedList(){

        LinkedList linkedList = new LinkedList();
        LinkedList.Node a = new LinkedList.Node(0);
        LinkedList.Node b  = new LinkedList.Node(1);
        LinkedList.Node c = new LinkedList.Node(1);
        LinkedList.Node d = new LinkedList.Node(2);
        LinkedList.Node e = new LinkedList.Node(2);
        LinkedList.Node f = new LinkedList.Node(3);
        LinkedList.Node g = new LinkedList.Node(3);
        LinkedList.Node h = new LinkedList.Node(4);


        linkedList.head =a;
        a.next = b;
        b.next = c;
        c.next =d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        RemoveElement element = new  RemoveElement()

        element.removeElements(linkedList.head,2);
    }
}
