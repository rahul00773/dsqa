
package javadatastructure;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author rahul.kumar
 * @version $Id: PriorityQue.java, v 0.1 2020-02-23 23:32 rahul.kumar Exp $$
 */
public class PriorityQue {


    public static void main(String[] args) {


        PriorityQueue<Strudent> priorityQueue = new PriorityQueue();
        priorityQueue.add(new Strudent(4, "shyam"));
        priorityQueue.add(new Strudent(1, "rahul"));
        priorityQueue.add(new Strudent(2, "data"));
        priorityQueue.add(new Strudent(3, "data"));

        Iterator<Strudent> srt = priorityQueue.iterator();

        while (srt.hasNext()) {
            System.out.println("the item of the queue" + priorityQueue.poll().toString());
        }


    }


}