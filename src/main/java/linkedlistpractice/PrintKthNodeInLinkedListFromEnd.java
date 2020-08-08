package linkedlistpractice;

public class PrintKthNodeInLinkedListFromEnd {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();
        LinkedList.Node a = new LinkedList.Node(0);
        LinkedList.Node b  = new LinkedList.Node(1);
        LinkedList.Node c = new LinkedList.Node(1);
        LinkedList.Node d = new LinkedList.Node(2);
        LinkedList.Node e = new LinkedList.Node(2);
        LinkedList.Node f = new LinkedList.Node(3);
        LinkedList.Node g = new LinkedList.Node(3);
        LinkedList.Node h = new LinkedList.Node(4);
        LinkedList.Node i = new LinkedList.Node(5);


        linkedList.head =a;
        a.next = b;
        b.next=c;
        c.next =d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next =i;

        printKthNodeFromEnd(linkedList.head, 2);
    }


    static int count = 0;
    public static void printKthNodeFromEnd(LinkedList.Node head,int k){

        if(head ==null){
            return;
        }
        printKthNodeFromEnd(head.next,k);
        count++;
        if(count==k){
            System.out.println(head.data);
        }
        
    }
    
}