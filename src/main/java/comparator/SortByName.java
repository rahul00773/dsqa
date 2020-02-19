
package comparator;

import java.util.Comparator;

/**
 * @author rahul.kumar
 * @version $Id: SortByName.java, v 0.1 2020-02-19 00:45 rahul.kumar Exp $$
 */
public class SortByName implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}