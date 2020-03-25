
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: IntersectionOfTwoLinkedList.java, v 0.1 2020-03-25 21:52 rahul.kumar Exp $$
 */
public class IntersectionOfTwoLinkedList {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        LinkedList.Node first = new LinkedList.Node(4);

        LinkedList.Node sec = new LinkedList.Node(1);
        LinkedList.Node third = new LinkedList.Node(8);
        LinkedList.Node fourth = new LinkedList.Node(4);
        LinkedList.Node fifth = new LinkedList.Node(5);


        linkedList.head = first;
        first.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = fifth;

        LinkedList linkedList1 = new LinkedList();
        LinkedList.Node f = new LinkedList.Node(5);
        LinkedList.Node s = new LinkedList.Node(0);
        LinkedList.Node t = new LinkedList.Node(1);
        LinkedList.Node fo = new LinkedList.Node(8);
        LinkedList.Node fi = new LinkedList.Node(4);
        LinkedList.Node si = new LinkedList.Node(5);

        linkedList1.head = f;
        f.next=s;s.next = t;
        t.next = third;
        fo.next=fi;
        fi.next=si;


       linkedList.printLinkedList(getIntersection(linkedList.head,linkedList1.head));


    }

    public static LinkedList.Node getIntersection(LinkedList.Node h1, LinkedList.Node h2) {


        LinkedList.Node p = h1;

        LinkedList.Node q = h2;


        int h1l = 0, h2l = 0;


        while (p != null) {

            h1l++;

            p = p.next;


        }


        while (q != null) {
            h2l++;
            q = q.next;
        }

        int diff;
        if (h1l < h2l) {

             diff = h2l-h1l;

            for(int i =0; i<diff; i++){
                h2 = h2.next;
            }

        }

        else {

            diff = h1l - h2l;

            for (int i = 0; i < diff; i++) {

                h1 = h1.next;
            }
        }


            while (h1.next!=null && h2.next!=null){

                if(h1==h2){
                    h1.next = null;
                    return h1;
                }
                h1=h1.next;
                h2=h2.next;
            }


        return null;
    }
}