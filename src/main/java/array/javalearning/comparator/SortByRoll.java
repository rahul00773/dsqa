
package array.javalearning.comparator;


import java.util.Comparator;

/**
 * @author rahul.kumar
 * @version $Id: SortByRoll.java, v 0.1 2020-02-19 00:37 rahul.kumar Exp $$
 */
public class SortByRoll implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollNo - o2.rollNo;
    }
}