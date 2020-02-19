
package comparator;

/**
 * @author rahul.kumar
 * @version $Id: Student.java, v 0.1 2020-02-19 00:33 rahul.kumar Exp $$
 */
public class Student {


    int rollNo;
    String name;
    String address;

    Student(int rollNo, String name, String address){

       this.rollNo = rollNo;
       this.name = name;
       this.address = address;

    }

    public String toString(){
        return this.rollNo +" " + this.name +" " + this.address;
    }
}